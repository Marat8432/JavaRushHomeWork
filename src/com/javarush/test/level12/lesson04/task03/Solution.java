package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static void print(int a)
    {
        System.out.println(a);
    }
    public static void print(Integer s)
    {
        System.out.println(s);
    }
    public static void print(int n, int n2)
    {
        System.out.println(n + " " + n2);
    }
    public static void print(long n, int n2)
    {
        System.out.println(n + " " + n2);
    }
    public String print (String s)
    {
        return s;
    }
    //Напишите тут ваши методы
}
