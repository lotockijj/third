package org.example.dworkflow;

public class AAdapter implements APart {
    private final A aImpl;

    public AAdapter(A aImpl) {
        this.aImpl = aImpl;
    }

    @Override
    public void a() {
        aImpl.a();
    }
}