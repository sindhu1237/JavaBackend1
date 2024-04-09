package CollectionFramework.Set;

import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        HashSet<Point> set = new HashSet<>();
        set.add(new Point(1,2));
        set.add(new Point(10, 20));
        set.add(new Point(100,200));
        set.add(new Point(10,20));
        System.out.println(set);

        String s = "sindhu";
        s.hashCode();
        // The hashcode of string makes sure that different strings goes to different bucket.
        // equals methods make sure there are no duplicates.
    }
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "[x=" + this.x + ", y=" + this.y + "]";
        }

        @Override
        public boolean equals(Object obj) {
            Point other = (Point) obj; // type casting
            System.out.println("Other x= "+other.x +" Other y= "+ other.y);
            System.out.println("this x= "+this.x +" this y= "+ this.y);
            return this.x == other.x && this.y == other.y;
        }

        @Override
        public int hashCode() {
//            return 0;  every element goes to same bucket
            return this.x + this.y; // Performance increases
        }
    }
}
