package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by total on 27.09.2016.
 */
public class Singleton
{
    private Singleton() {   }
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}

