package practicesPOO.practice3.exercise1;

public class Rectangle {
    public double height;
    public double width;

    public double getArea(){
        return height*width;
    }

    public double  getPerimeter(){
        return (2*width)+(2*height);
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }
}
