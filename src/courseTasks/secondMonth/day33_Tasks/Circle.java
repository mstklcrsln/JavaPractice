package courseTasks.firstMonth.secondMonth.day33_Tasks;

public class Circle {

    public static double pi= 3.14;
    public double radius;
    public  double diameter;
    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
    public double calcArea(){
       double areaOfCircle = pi*(radius*diameter);
       return areaOfCircle;
    }
    public  double calcPerimeter(){
        double perimeterOfCircle= pi*diameter;
        return perimeterOfCircle;
    }
    public void pi (){
        System.out.println(pi);
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area of circle=" + calcArea() +
                ", perimeter of circle=" + calcPerimeter() +
                '}';
    }
}
/*
2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */