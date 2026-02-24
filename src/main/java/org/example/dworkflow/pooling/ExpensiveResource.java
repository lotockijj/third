package org.example.dworkflow.pooling;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
1. Add Dependencies (pom.xml) -> commons-pool2
2. Define the Pooled Bean -> ExpensiveResource
3. Create a Pool Factory - > ExpensiveResourcePoolFactory
4. Configure the Pool as a Spring Bean -> PoolConfig
5. Use the Pool in Services -> ResourceConsumerService

Key Benefits
1. Memory Efficiency:
    Only maxTotal instances exist (e.g., 100 instead of millions).
2. Performance:
    Avoids GC pressure and Spring’s prototype overhead.
3. Thread Safety:
    Pool manages concurrent access.

When to Avoid Pooling
Extremely lightweight beans (pooling adds overhead).
Beans with mutable state (requires careful cleanup in passivateObject).
Alternative: @Lookup for Controlled Prototypes
 */
@Component
@Scope("prototype")
public class ExpensiveResource {
    private String data;

    public void init(String data) {
        this.data = data;  // Simulate expensive initialization
    }

    public void close() {
        this.data = null;  // Cleanup for reuse
    }
}
