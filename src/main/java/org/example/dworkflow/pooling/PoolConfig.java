package org.example.dworkflow.pooling;

import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PoolConfig {

    @Bean
    public ObjectPool<ExpensiveResource> expensiveResourcePool(
            ExpensiveResourcePoolFactory factory
    ) {
        return new GenericObjectPool<>(factory, new GenericObjectPoolConfig<>() {{
            setMaxTotal(100);           // Max instances in pool
            setMinIdle(10);             // Min idle instances
            setTestOnBorrow(true);      // Validate before use
            setBlockWhenExhausted(true); // Wait if pool is full
        }});
    }
}