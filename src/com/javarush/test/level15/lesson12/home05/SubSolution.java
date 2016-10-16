package com.javarush.test.level15.lesson12.home05;

/**
 * Created by total on 30.09.2016.
 */
public class SubSolution extends Solution {
    SubSolution(int i)
    {
        super(i);
    }
    SubSolution(double i)
    {
        super(i);
    }
    SubSolution(float i)
    {
        super(i);
    }

    public SubSolution(String s, int i)
    {
        super(s, i);
    }
    public SubSolution(String s, double i)
    {
        super(s, i);
    }
    public SubSolution(String s, float i)
    {
        super(s, i);
    }

    protected SubSolution(int i, String s)
    {
        super(i, s);
    }
    protected SubSolution(double i, String s)
    {
        super(i, s);
    }
    protected SubSolution(float i, String s)
    {
        super(i, s);
    }

    private SubSolution(int i, double j)  {super();}
    private SubSolution(int i, float j)   {super();}
    private SubSolution(int i, boolean j)  {super();}
}


/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/