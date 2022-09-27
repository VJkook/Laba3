package Laba3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("весело");
        arrayList.add("в");
        arrayList.add("поле");
        arrayList.add("мы");
        arrayList.add("вместе");
        arrayList.add("живем");
        arrayList.add("!");
        System.out.println(arrayList);
        String s1 = arrayList.get(2);
        String s2 = arrayList.get(4);
        arrayList.set(2, s2);
        arrayList.set(4, s1);
        System.out.println(arrayList);
        String[] mass = new String[arrayList.size()];
        arrayList.toArray(mass);*/


        Box<Apple> apple = new Box<>(new Apple(),new Apple());
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();
        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();

        apple.AddFruit(new Apple(), new Apple());
        apple.AddFruit(new Apple());
        apple.AddFruit(new Apple());
       apple.getListFruit();
        orange.AddFruit(new Orange());
        orange.AddFruit(new Orange());
        orange.AddFruit(new Orange());

        apple1.AddFruit(new Apple());
        apple1.AddFruit(new Apple());
        apple1.AddFruit(new Apple());
        apple1.AddFruit(new Apple());
        //System.out.println(apple1.getMaxWeight());
        System.out.println("Вес коробки с яблоками: " + apple.getMaxWeight());
        System.out.println("Вес коробки с апельсинами: " + orange.getMaxWeight());
        System.out.println("Сравнение двух коробок с яблоками: " + apple.Compare(orange1));
        apple.Transfer(apple);
        System.out.println("Куда переыпаем  " + apple.getMaxWeight());
        System.out.println("Откуда пересыпаем " + apple1.getMaxWeight());


    }
}
