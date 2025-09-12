package org.example.dworkflow;

// How to implement class C which uses class A a method and class B b method following SOLID principle / best practise ?
public class A implements X {
    @Override
    public void a() {
        System.out.println("A's a()");
    }

    @Override
    public void b() {
        System.out.println("A's b()");
    }
}