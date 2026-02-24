package org.example.dworkflow.pooling;

import org.apache.commons.pool2.ObjectPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceConsumerService {
    private final ObjectPool<ExpensiveResource> pool;

    @Autowired
    public ResourceConsumerService(ObjectPool<ExpensiveResource> pool) {
        this.pool = pool;
    }

    public void process() throws Exception {
        ExpensiveResource resource = pool.borrowObject();  // Get from pool
        try {
            resource.init("data");
            // ... use the resource ...
        } finally {
            pool.returnObject(resource);  // Return to pool
        }
    }
}