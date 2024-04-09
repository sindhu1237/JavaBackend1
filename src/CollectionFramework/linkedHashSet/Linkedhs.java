package CollectionFramework.linkedHashSet;

import java.util.*;

public class Linkedhs {
    static class Car implements Comparable<Car> {
        int speed;
        int power;
        String name;

        public Car(int speed, int power, String name) {
            this.speed = speed;
            this.power = power;
            this.name = name;
        }

        @Override
        public String toString() {
            return "(" + this.name + "-" + this.speed + "-" + this.power + ")";
        }

        @Override
        public int compareTo(Car o) {
            return this.speed - o.speed;   // parent is ess than child
//            return o.speed - this.speed;  // parent is having max compare to child
        }


    public static final CarPowerComparator AComparatorOnPower = new CarPowerComparator();
    public static final CarNameComparator AComparatorOnName = new CarNameComparator();

    static class CarPowerComparator implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.power - o2.power;
        }
    }

    static class CarNameComparator implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.name.compareTo(o2.name);
        }
    }

}
//    public static final CarPowerComparator AComparatorOnPower = new CarPowerComparator();
//    public static final CarNameComparator  AComparatorOnName = new CarNameComparator();

    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
        System.out.println("Hashset values will not come in the order we had added them");
        demo1(new HashSet<>());
        System.out.println("LinkedHashSet retrieves values in the order we added them");
        demo1(new LinkedHashSet<>());
        System.out.println("using Comparable which allows to have single compareTo ");
        demo2();
        System.out.println("using Comparator which allows to have multiple compareTo ");
        demo3();
        System.out.println("Using TreeSet");
        demo4TreeSet();
    }
    public static void demo1(Set<String> set){
        set.add("India");
        set.add("China");
        set.add("US");
        set.add("UK");
        set.add("Canada");
        System.out.println(set);
    }
    private static void demo2(){

        // comparable used because no dedicated class passed for comparsion
//        PriorityQueue<Car> pq = new PriorityQueue<>();
        PriorityQueue<Car> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Car(50,800,"A"));
        pq.add(new Car(20,200, "B"));
        pq.add(new Car(70, 600, "C"));
        pq.add(new Car(30, 300, "D"));
        pq.add(new Car(10, 500, "E"));
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
    private static void demo3() {
//        PriorityQueue<Car> pq = new PriorityQueue<>(new CarPowerComparator());
//        PriorityQueue<Car> pq = new PriorityQueue<>(new CarNameComparator());
//        PriorityQueue<Car> pq = new PriorityQueue<>(Car.AComparatorOnName);
        // Anonymous class
        // We created an object of interface by implementing the method
        Comparator<Car> obj = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.speed != o2.speed) {
                    return o1.speed - o2.speed;
                } else {
                    return o1.power - o2.power;
                }
            }
        };
//        PriorityQueue<Car> pq = new PriorityQueue<>(obj);
        PriorityQueue<Car> pq = new PriorityQueue<>(Collections.reverseOrder(obj));
        pq.add(new Car(50, 800, "A"));
        pq.add(new Car(30, 200, "D"));
        pq.add(new Car(70, 600, "C"));
        pq.add(new Car(30, 300, "B"));
        pq.add(new Car(70, 500, "E"));
        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }
        static void demo4TreeSet() {
            TreeSet<Integer> ts = new TreeSet<>();
            ts.add(10);
            ts.add(20);
            ts.add(30);
            ts.add(40);
            ts.add(50);
            ts.add(60);
            ts.add(70);
            System.out.println("Ceiling value of 35 is " + ts.ceiling(35));
            System.out.println("Ceiling value of 40 is " + ts.ceiling(40));
            System.out.println("floor value of 35 is " + ts.floor(35));
            System.out.println("floor value of 30 is " + ts.floor(30));
            System.out.println("ts.first() =  " + ts.first());
            System.out.println("ts.last() =  " + ts.last());
            System.out.println("ts.headSet(35) =  " + ts.headSet(35));
            System.out.println("ts.headSet(30) =  " + ts.headSet(30)); // ending will not be printed
            System.out.println("To add ending value to headset we should add inclusive as true");
            System.out.println("ts.headSet(30) =  " + ts.headSet(30, true));
            System.out.println("TailSet includes from the starting point if we want to ignore we should mention inclusive as false");
            System.out.println("ts.tailSet(35) =  " + ts.tailSet(35));
            System.out.println("ts.tailSet(30) =  " + ts.tailSet(30));
            System.out.println("setting inclusive as false for tailset");
            System.out.println("ts.tailSet(30) =  " + ts.tailSet(30, false));
            System.out.println("ts.subSet(10,60) = " +ts.subSet(10,60));
            System.out.println("ts.subSet(10,60) = " +ts.subSet(10,true,60,true));


        }
}
