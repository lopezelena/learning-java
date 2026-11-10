package com.campusdual.encapsulation;

public class UseOfEncapsulation {
    static void main() {
        Vehicle v1 = new Vehicle("1234BCD", "Xsara", "Citroen");
        String details = v1.getDetails();
        System.out.println(details);
    }
}
