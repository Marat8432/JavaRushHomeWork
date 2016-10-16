package com.javarush.test.level14.lesson06.home01;

/**
 * Created by total on 12.09.2016.
 */
public class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 100;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " +  getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

