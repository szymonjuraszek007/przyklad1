package com.company;

import java.util.*;

public class Main {

    public static final String No_MORE_NAMES = "-";

    public static void main(String[] args) {

        String name1,name2;
        Scanner input = new Scanner(System.in);

        Map<String, String> pairs = new HashMap<>();

        while(true){

            System.out.println("Podaj imie partnera");
            name1 = input.next();

            if(name1.equals(No_MORE_NAMES)){
                break;
            }
            System.out.println("Podaj imie partnerki");
            name2 = input.next();
            if(name2.equals(No_MORE_NAMES)){
                break;
            }

            pairs.put(name1,name2);
        }

        System.out.println("Podaj imie partnera zeby wyszukacimie partnerki");
        name1 = input.next();
        System.out.println("Partnerka dla " + name1 + " to " + pairs.get(name1));
    }
}
