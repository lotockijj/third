package org.example.dworkflow.pooling;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.springframework.stereotype.Component;

@Component
public class ExpensiveResourcePoolFactory
        extends BasePooledObjectFactory<ExpensiveResource> {

    @Override
    public ExpensiveResource create() {
        return new ExpensiveResource();  // Spring will inject dependencies
    }

    @Override
    public PooledObject<ExpensiveResource> wrap(ExpensiveResource resource) {
        return new DefaultPooledObject<>(resource);
    }

    @Override
    public void passivateObject(PooledObject<ExpensiveResource> pooledObject) {
        pooledObject.getObject().close();  // Reset state before returning to pool
    }
}