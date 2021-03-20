package ua.alevel.homework6;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone(435, "iPhone 7", 122);
        System.out.println("Phone 1: number - " + phone1.number + ", model - " + phone1.model + ", weight - " + phone1.weight);
        phone1.getNumber();
        phone1.receiveCall("John");


        Phone phone2 = new Phone(227, "Galaxy S8", 143);
        System.out.println("Phone 2: number - " + phone2.number + ", model - " + phone2.model + ", weight - " + phone2.weight);
        phone2.getNumber();
        phone2.receiveCall("Barak");

        Phone phone3 = new Phone(873, "iPhone 11", 201);
        System.out.println("Phone 3: number - " + phone3.number + ", model - " + phone3.model + ", weight - " + phone3.weight);
        phone3.getNumber();
        phone3.receiveCall("Janifer");

    }

}
