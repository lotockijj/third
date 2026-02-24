package org.example.dworkflow;

public class C implements X {
    private final APart aPart;
    private final BPart bPart;

    public C(APart aPart, BPart bPart) {
        this.aPart = aPart;
        this.bPart = bPart;
    }

    @Override
    public void a() {
        aPart.a();  // Delegate to A
    }

    @Override
    public void b() {
        bPart.b();  // Delegate to B
    }

    public static void main(String[] args) {
        C c = new C(new AAdapter(new A()), new BAdapter(new B()));
        c.a(); // A's a()
        c.b(); // B's b()
    }
}