package practicesPOO.practice3.exercise2;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double getNetSalary(){
        return grossSalary-tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += grossSalary* (percentage/100);
    }

    public String toString(){
        return String.format("%s, $ %.2f", name, getNetSalary());
    }
}
