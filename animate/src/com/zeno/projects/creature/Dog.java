package com.zeno.projects.creature;

/**
 *
 * @author Jude Kikuyu
 * date written: 22/02/2016
 */
public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("A new dog has been created!");
    }
    @Override
    public void sleep() {
        System.out.println("A dog sleeps...");
    }
    @Override
    public void eat() {
        System.out.println("A dog eats...");
    }
}
