package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by total on 03.10.2016.
 */
public abstract class DrinkMaker
{
    protected abstract void getRightCup();
    protected abstract void putIngredient();
    protected abstract void pour();
    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}

/* Template pattern
1. В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
- void getRightCup() - выбрать подходящую чашку
- void putIngredient() - положить ингредиенты
- void pour() - залить жидкостью
2. В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в такой последовательности:
   выбирает чашку, кладет ингредиенты, заливает жидкостью.
3. В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker.
4. Распредели следующие фразы между всеми методами в классах LatteMaker и TeaMaker, различные фразы для различных методов.
5. Каждый метод должен выводить в консоль свою фразу не пересекаясь с другими методами.
6. Фразы:
"Заливаем водой"
"Берем чашку для латте"
"Насыпаем чай"
"Берем чашку для чая"
"Заливаем молоком с пенкой"
"Делаем кофе"
*/