package com.cybertek.tests;

import com.github.javafaker.Faker;

public class firtclass {

    public static void main(String[] args) {
        System.out.println("hello word");
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().cityName());



    }
}
