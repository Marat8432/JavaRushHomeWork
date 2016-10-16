package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    Solution (int i) {
    }
    Solution (double i) {
    }
    Solution (float i) {
    }

    public Solution() {    }
    public Solution(String s, double i) {
    }
    public Solution(String s, float i) {
    }


    protected Solution(int i, String s){
    }
    protected Solution(double i, String s){
    }
    protected Solution(float i, String s){
    }

    private Solution (int i, double j) {
    }
    private Solution (int i, float j) {
    }
    private Solution (int i, boolean j) {
    }
}

