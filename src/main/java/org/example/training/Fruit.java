package org.example.training;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private int weight;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return weight + " " + name;
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.name.compareTo(o.name) > 0){
            return 1;
        }
        if(this.name.compareTo(o.name) < 0){
            return -1;
        }
        if(this.weight > o.weight){
            return 1;
        }
        if(this.weight < o.weight){
            return -1;
        }
        return 0;
    }
}
