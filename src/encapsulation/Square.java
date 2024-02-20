package encapsulation;

public class Square {
    int side;
    public void getArea() {
        int area = this.side * this.side;
        System.out.println("Area of Square is : "+ area);
    }

    public void getPerimeter() {
        int perimeter = 4 * this.side;
        System.out.println("Perimeter of Square is : "+ perimeter);
    }
}
