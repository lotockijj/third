package org.example.dworkflow.huge.file;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.util.concurrent.*;

/*
<records>
    <record>...</record>
    <record>...</record>
    ...
</records>
 */
public class MultiThreadXmlFileProcessor {
    private static final int THREAD_COUNT = 10;
    private static final int QUEUE_CAPACITY = 1000; // limit to avoid memory issues
    private static final String FILE_PATH = "huge.txt";

    public static void main(String[] args) throws Exception {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1000);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                try {
                    while (true) {
                        String xmlRecord = queue.take();
                        if (xmlRecord.equals("__EOF__")) break;
                        processXmlRecord(xmlRecord);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
// Producer
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try (FileReader fileReader = new FileReader("huge.xml")) {
            XMLStreamReader reader = factory.createXMLStreamReader(fileReader);
            StringWriter writer = null;
            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLStreamConstants.START_ELEMENT &&
                        reader.getLocalName().equals("record")) {
                    writer = new StringWriter();
                    XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
                    XMLStreamWriter xmlWriter = outputFactory.createXMLStreamWriter(writer);
                    xmlWriter.writeStartElement("record");
                } else if (event == XMLStreamConstants.END_ELEMENT &&
                        reader.getLocalName().equals("record")) {
                    // Finish element
                    queue.put(writer.toString());
                } else if (writer != null) {
                    // Write events inside <record> to writer
                }
            }
        }

// Send stop signals
        for (int i = 0; i < 10; i++) queue.put("__EOF__");

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

    }

    private static void processXmlRecord(String line) {
        // Simulate processing
        System.out.println(Thread.currentThread().getName() + " processed: " + line);
    }
}