package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //                             Home work #1

        /*Написать программу, выводящую в консоли “Привет, мир!”
        Выводиться в консоль должно значение переменной.
        Переменная должна являться результатом конкатенации (соединения) двух переменных типа String.
        Переменная “Привет, ” должна быть константой.
                Вывести на экран значение константы.

                                  Задание на сообразительность:

        Сделать так, чтобы программа здоровалась с пользователем
        Спрашивала его имя
        Здоровалась с пользователем по имени, которое он ввёл с клавиатуры.
        */

      /*  System.out.println("Hello world");
        String a="Hello";
        String b="World";
        System.out.println(a+" "+b);


        System.out.println("Как тебя зовут?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello "+name);
      */

        //                             Home work #2

      /* Создать переменную по имени “name”, которая будет сохранять имя человека.
                Вторая переменная должна содержать возраст человека.
                Третья переменная  - температура на улице сегодня. Так же сохраняем её в переменную.
        Если возраст человека в диапазоне 20-45 лет и на улице температура меньше +30 градусов и больше -20 градусов, 4
        то можно идти гулять. Если человеку меньше 20 лет и температура больше 0 градусов и меньше 28 градусов можно гулять.
        если человеку больше 45 лет то можно гулять только когда температура больше -10 градусов и меньше 25 градусов
       */

       /* String name = "Айбек";
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
        }*/


        //                             Home work #3

        /* Создать массив, заполнив его именами людей, элементов массива должно быть 3
        Создать switch на каждый элемент массива (Но всего в программе должен быть только 1 свитч)
        Первому человеку программа должна желать доброго утра, второму доброго дня, а третьему доброго вечера.
        Программа должна поприветствовать всех.*/

        /*String[] names = new String[3];

        names[0] = "Стив Джобс";
        names[1] = "Джефф Безос";
        names[2] = "Илон Маск";

        switch (names[0]){
            case "Стив Джобс":
                System.out.println("Доброе утро " + names[0]);
            case "Джефф Безос":
                System.out.println("Добрый день " + names[1]);
            case "Илон Маск":
                System.out.println("Доброй вечер " + names[2]);

                System.out.println("Привет"+names[0] +names[1] +names[2]);
        }*/


    }
}
