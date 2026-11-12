package com.campusdual.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    static void main() {
        Queue<String> instruments = new LinkedList<>();

        instruments.offer("Guitar");
        instruments.offer("Piano");
        instruments.offer("Drums");
        instruments.offer("Violin");

        System.out.println("Queue of musical instruments: ");
        for (String ins : instruments){
            System.out.println(ins);
        }

        String removedInstrument = instruments.poll();
        System.out.println("\nRemoved: " +removedInstrument);

        System.out.println("Queue after removal: ");
        for (String ins : instruments){
            System.out.println(ins);
        }

        System.out.println("\nPeeked instrument is: " + instruments.peek());

        System.out.println("Queue after peek: ");
        for (String ins : instruments){
            System.out.println(ins);
        }


    }
}
