package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        int height;
        boolean sex;
        int xeplenght;
        boolean fat;
        String hear;

        public Human (String name)
        {
            this.name = name;
        }
        public Human (int age)
        {
            this.age = age;
        }
        public Human (String name, int age, int height)
        {
            this.name = name;
            this.age = age;
            this.height = height;
        }
        public Human (String name, int age,boolean sex,int height,boolean fat,String hear)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human (String name, int age,boolean sex,boolean fat)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.fat = fat;
        }
        public Human (String name, int age,boolean sex,int height)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }
        public Human (String name, int age,boolean fat,String hear)
        {
            this.name = name;
            this.age = age;
            this.fat = fat;
            this.hear = hear;
        }
        public Human (String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Human (int age,String hear, int xeplenght)
        {
            this.hear = hear;
            this.age = age;
            this.xeplenght = xeplenght;
        }
        public Human (String name, int age,String hear)
        {
            this.name = name;
            this.age = age;
            this.hear = hear;
        }
         //напишите тут ваши переменные и конструкторы
    }
}
