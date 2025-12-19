package practicesPOO.practice6.exercise3;

public class Person{
    private String name;
    private double age;
    private double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //Getters
    public String getName() {return name;}
    public double getAge() {return age;}
    public double getHeight() {return height;}

    //Setters
    public void setName(String name) {this.name = name;}
    public void setAge(double age) {this.age = age;}
    public void setHeight(double height) {this.height = height;}
}
