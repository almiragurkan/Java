package almira.main;


import almira.shapes.Circle;

import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> list = new ArrayList<>();
        Circle c = new Circle(5.5);
        System.out.println(c.area());

        list.add(c);
        list.add(new Circle(3));
        list.add(new Circle(7.5));
        for(int i=0; i<list.size(); i++) {
            Circle circle = list.get(i);
            System.out.println("Area is " + circle.area());
        }

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(5);
        numbers.add(new Integer(5));

        ArrayList<Boolean> bools = new ArrayList<>();


    }
}
