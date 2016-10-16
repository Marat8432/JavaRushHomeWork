package com.javarush.test.level15.lesson12.home04;

/**
 * Created by total on 29.09.2016.
 */
public final class Sun implements Planet
{
    private static Sun instance = null;
    private Sun()   { }

    public static synchronized Sun getInstance()
    {
        if (instance == null) instance = new Sun();
        return instance;
    }


}
