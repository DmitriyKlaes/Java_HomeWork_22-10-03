package ru.GeekBrains;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> boxList;

    public Box() {
        this.boxList = new ArrayList<>();
    }

    public void add(T element) {
        boxList.add(element);
    }

    public float getWeight() {
        if (boxList.isEmpty()) return 0;
        else return this.boxList.size() * this.boxList.get(0).weight();
    }

    public int getCount() {
        return this.boxList.size();
    }


    public boolean compare(Box<? extends Fruit> boxFruit) {
        return this.getWeight() == boxFruit.getWeight();
    }

    /** *
     * Пересыпаем фрукты из коробки в коробку
     * @param boxIn именно в эту коробку будем пересыпать
     */
    public void intersperseIn(Box<T> boxIn) {
        for (T t : boxList) {
            boxIn.add(t);
        }
        boxList.clear();
    }
}
