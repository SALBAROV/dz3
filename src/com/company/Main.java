package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        System.out.println(pogoda(26, 27 ));
        System.out.println(pogoda(25,  28));
        System.out.println(pogoda(26,  29));
        System.out.println(pogoda(27,  30));


    }

    public static String pogoda(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        }
        else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять 2";
        }
        else if (age > 45 && temp > -10 && temp >25){
            return "Можно идти гулять";
        } else  {
            return  "Оставайтесь дома";
        }

    }
         public  static  int generateRandomAge(){
             Random random = new Random();
             int age = random.nextInt( 50);
             return age;
         }

}
