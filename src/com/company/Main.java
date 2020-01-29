package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "Айбек";
        int age =27 ;
        int temperature =20;
        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
            System.out.println("Можно идти гулять");
        }
        if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно гулять2");
        }
        if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("То можно гулять3");
        }

    }
}
