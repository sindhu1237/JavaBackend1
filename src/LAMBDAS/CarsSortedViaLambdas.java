package LAMBDAS;
import java.util.*;

public class CarsSortedViaLambdas {
    public static class Car{
        int speed;
        int price;
        String brand;
        Car(int speed, int price, String brand){
            this.speed=speed;
            this.price=price;
            this.brand=brand;
        }
        public String toString(){
            return "[ Speed = "+ this.speed + "," + "Price = " + this.price + "," + "Brand = " + this.brand +"]\n";
        }
    }
    public static void main(String[] args) {
        Car c1=new Car(100,1000,"A");
        Car c2=new Car(200,2000,"B");
        Car c3=new Car(300, 3000, "C");
        Car c4=new Car(400,4000,"D");
        Car c5=new Car(500,5000,"E");
        List<Car> list=Arrays.asList(c2,c3,c4,c5,c1);
        System.out.println(list);
        Comparator<Car> speedComparator=(car1,car2) ->  car2.speed-car1.speed;
        Collections.sort(list, speedComparator);
        System.out.println("After speed Comparator");
        System.out.println(list);

    }
}
