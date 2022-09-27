package Laba3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> ListFruit = new ArrayList<>();
    private double MaxWeight = 0.0;
    private double weight = 0.0;

    public Box(T... fruit) {
        this.ListFruit = new ArrayList<>();
    }

    public void AddFruit(T... fruit) {
        ListFruit.addAll(Arrays.asList(fruit));
        weight = fruit[0].getWeight();
    }

    public double getMaxWeight() {
        return MaxWeight = ListFruit.size() * weight;
    }

    public void getListFruit() {
        for (Fruit f : ListFruit) {
            System.out.println(f.getClass().getName());
        }

    }

    public boolean Compare(Box<?> another) {
        return MaxWeight == another.getMaxWeight();
    }

    public void Transfer(Box<T> another) {
        if (this != another) {
            ListFruit.addAll(another.ListFruit);
            another.ListFruit.clear();
        } else System.out.println("Одинаковые коробки ");
    }
}
