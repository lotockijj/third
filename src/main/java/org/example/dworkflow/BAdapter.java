package org.example.dworkflow;

public class BAdapter implements BPart {
    private final B bImpl;

    public BAdapter(B bImpl) {
        this.bImpl = bImpl;
    }

    @Override
    public void b() {
        bImpl.b();
    }
}