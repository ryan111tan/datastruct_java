package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is the first code I written in a while :D");
        System.out.println("Hello World btw.");

        Dog d = new Dog(20);
        d.makeNoise();
        Dog smallDog = new Dog(10);
        smallDog.makeNoise();
        Dog bigDog = new Dog(30);
        bigDog.makeNoise();

        Dog bigger = Dog.maxDog(smallDog,bigDog);
        bigger.makeNoise();
    }
}
