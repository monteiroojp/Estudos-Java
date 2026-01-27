package practicesPOO.practice7.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private List<HourContract> contracts = new ArrayList<HourContract>();
    private Department department;

    //Constructor
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    //Getters
    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment(Department department){
        this.department = department;
    }

    //Add contract
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    //Remove contract
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    //Calculate income
    public double income(int year, int month){
        double total = baseSalary;

        for(HourContract contract : contracts){
            if((contract.getDate().getYear() == year) && (contract.getDate().getMonthValue() == month))
                total += contract.totalValue();
        }

        return total;
    }
}
