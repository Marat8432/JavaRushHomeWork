package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();//напишите тут ваш код
        map.put("Вася1", new Cat("1"));
        map.put("Вася2", new Cat("2"));
        map.put("Вася3", new Cat("3"));
        map.put("Вася4", new Cat("4"));
        map.put("Вася5", new Cat("5"));
        map.put("Вася6", new Cat("6"));
        map.put("Вася7", new Cat("7"));
        map.put("Вася8", new Cat("8"));
        map.put("Вася9", new Cat("9"));
        map.put("Вася10", new Cat("10"));
        return map;//напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Cat s = iterator.next().getValue();
            set.add(s);

        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
