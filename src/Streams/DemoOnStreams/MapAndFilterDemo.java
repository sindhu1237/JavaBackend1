package Streams.DemoOnStreams;
import LAMBDAS.CarsSortedViaLambdas;

import java.util.*;
public class MapAndFilterDemo {
    public static class Car {
        int speed;
        int price;
        String brand;

        Car(int speed, int price, String brand) {
            this.speed = speed;
            this.price = price;
            this.brand = brand;
        }
        public String toString(){
            return "[ Speed = "+ this.speed + "," + "Price = " + this.price + "," + "Brand = " + this.brand +"]\n";
        }
    }
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,5, 12,44,43,85,17,7,24);
        // give only even numbers
        List<Integer> res=new ArrayList<>();
        for(int val: list){
            if(val%2==0){
                res.add(val);
            }
        }
//        System.out.println(res);

        // give only even numbers using filter method of streams
        System.out.println(list.stream().filter(x-> x%2 == 0).toList());
       /*
          1. list converted to stream
          2. stream will loop over the elements in list
          3. pass every element to filter
          4. filter will pass every element to lambda
          5. lambda will return true or false for the element
          6. If filter gets a true from lambda it will include the element in results.
          7. if filter gets a false from lambda it will reject the element
        */

        List<Car> cars=Arrays.asList(
                new Car(100,1000,"A"),
                new Car(2000,2000,"B"),
                new Car(3000,3000,"C"),
                new Car(400,4000,"D")
        );
        System.out.println(cars.stream().filter(c -> c.speed>1000).toList());

        // using MAP
        List<Integer> price=cars.stream().map(c -> c.price).toList();
        System.out.println(price);


    }
}
