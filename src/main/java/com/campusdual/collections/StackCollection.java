package com.campusdual.collections;

import java.util.Stack;

public class StackCollection {

    static void main() {
        Stack<String> instruments = new Stack<>();

        instruments.push("Guitar");
        instruments.push("Piano");
        instruments.push("Drums");
        instruments.push("Violin");

        String removedInstrument = instruments.pop();
        System.out.println("\nRemoved: " +removedInstrument);

        System.out.println("\nPeeked: " +removedInstrument);

        removedInstrument = instruments.pop();
        System.out.println("\nRemoved: " +removedInstrument);
    }
}
