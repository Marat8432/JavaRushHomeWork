package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] array1 = new int[5];
        int[] array2 = new int[2];
        int[] array3 = new int[4];
        int[] array4 = new int[7];
        int[] array5 = new int[0];


        ArrayList<int[]> klist = new ArrayList<int[]>();
          {
              klist.add(array1);
              klist.add(array2);
              klist.add(array3);
              klist.add(array4);
              klist.add(array5);

              for (int i = 0; i < klist.size(); i++)
              {
                  for (int j = 0; j < klist.get(i).length; j++)
                  {
                      klist.get(i)[j] = j;
                  }
              }
          }

        return klist;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
