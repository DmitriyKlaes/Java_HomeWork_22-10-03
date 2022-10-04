package ru.GeekBrains;

public class Program {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox2.getWeight();

        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());


        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox1.compare(orangeBox));
        System.out.println(appleBox1.compare(appleBox2));

        System.out.println(appleBox1.getCount());
        System.out.println(appleBox2.getCount());
        appleBox1.intersperseIn(appleBox2);
        System.out.println("----");
        System.out.println(appleBox1.getCount());
        System.out.println(appleBox2.getCount());
    }
}
