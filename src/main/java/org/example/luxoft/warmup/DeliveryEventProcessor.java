package org.example.luxoft.warmup;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Task:
- Group events by courier
- Sort events by time
- Pair START -> END
- Calculate delivery duration

Count:
- completed deliveries
- deliveries longer than 45 minutes
- total distance per courier
*/

public class DeliveryEventProcessor {

    public static final String START = "START";
    public static final String END = "END";
    public static final String COURIER_1 = "courier1";

    record DeliveryEvent(
            String courierId,
            String type, // START or END
            int distanceKm,
            LocalDateTime timestamp) {
    }

    public static void main(String[] args) {

        List<DeliveryEvent> deliveryEvents = getTestDeliveryEvents();

        Map<String, List<DeliveryEvent>> eventsByCourier =
                deliveryEvents.stream()
                        .collect(Collectors.groupingBy(DeliveryEvent::courierId));

        int completedDeliveries = 0;
        int deliveriesLongerThan45Minutes = 0;

        Map<String, Integer> distanceByCourier = new HashMap<>();

        for (Map.Entry<String, List<DeliveryEvent>> entry : eventsByCourier.entrySet()) {

            String courierId = entry.getKey();
            List<DeliveryEvent> events = entry.getValue();

            events.sort(Comparator.comparing(DeliveryEvent::timestamp));

            DeliveryEvent start = null;

            for (DeliveryEvent event : events) {

                if (START.equals(event.type())) {
                    start = event;

                } else if (END.equals(event.type()) && start != null) {

                    completedDeliveries++;

                    long durationMinutes = ChronoUnit.MINUTES.between(start.timestamp(), event.timestamp());

                    if (durationMinutes > 45) {
                        deliveriesLongerThan45Minutes++;
                    }

                    int distance = Math.abs(event.distanceKm() - start.distanceKm());

                    distanceByCourier.merge(courierId, distance, Integer::sum);

                    start = null;
                }
            }
        }

        System.out.println("Completed deliveries: " + completedDeliveries);
        System.out.println("Deliveries longer than 45 minutes: " + deliveriesLongerThan45Minutes);
        System.out.println("Distance by courier: " + distanceByCourier);
    }

    private static List<DeliveryEvent> getTestDeliveryEvents() {
        return List.of(
                new DeliveryEvent(
                        COURIER_1,
                        START,
                        0,
                        LocalDateTime.of(2026, 8, 22, 10, 0)
                ),
                new DeliveryEvent(
                        COURIER_1,
                        END,
                        20,
                        LocalDateTime.of(2026, 8, 22, 10, 30)
                ),
                new DeliveryEvent(
                        COURIER_1,
                        START,
                        20,
                        LocalDateTime.of(2026, 8, 22, 11, 0)
                ),
                new DeliveryEvent(
                        COURIER_1,
                        END,
                        50,
                        LocalDateTime.of(2026, 8, 22, 12, 0)
                ),
                new DeliveryEvent(
                        "courier2",
                        START,
                        5,
                        LocalDateTime.of(2026, 8, 22, 9, 0)
                ),
                new DeliveryEvent(
                        "courier2",
                        END,
                        15,
                        LocalDateTime.of(2026, 8, 22, 9, 20)
                )
        );
    }
}
