package org.example.dworkflow.pooling;

import org.springframework.beans.factory.annotation.Lookup;

/*
    Alternative: @Lookup for Controlled Prototypes
If pooling is overkill, use Spring’s @Lookup to manage creation:
→ Less control than pooling but no external dependencies.
Final Answer to Interviewer
**"For millions of prototype beans, I’d use object pooling to:
    1.Limit instance count,
    2.Reduce GC pressure,
    3.Avoid Spring’s per-bean overhead.

    If pooling isn’t feasible, I’d redesign with stateless singletons or @Lookup."**
Would you like benchmarks comparing pooling vs. raw prototype creation?
 */
public abstract class MyService {
    @Lookup
    protected abstract ExpensiveResource createExpensiveResource();

    public void process() {
        ExpensiveResource resource = createExpensiveResource();  // New instance per call
        // ... use resource ...
    }
}