package org.example.dworkflow.distinct;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public class Node{
        Node next;
        int val;
    }

    public static void main(String[] args) {
        Distinct distinct = new Distinct();
        boolean hasCycle = hasCycle(distinct);
        System.out.println(hasCycle);
    }

    private static boolean hasCycle(Distinct distinct) {
        Node node = distinct.new Node();
        Set<Node> dist = new HashSet<>();
        boolean hasCycle = false;
        while(node != null){
            if(!dist.add(node)){
                hasCycle = true;
                break;
            }
            node = node.next;
        }
        return hasCycle;
    }
}
