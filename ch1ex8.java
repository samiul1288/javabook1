package samiuljava;

public class ch1ex8 {
    public static void main(String[] args) {
        double radius = 5.5;
        // Define the value of pi
        double pi = Math.PI;
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        // Display the results
        System.out.println("The perimeter of the circle is: " + perimeter);
        System.out.println("The area of the circle is: " + area);
    }
}
