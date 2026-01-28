package practicesPOO.practice8.exercise4;

public class LegalPerson extends Person{
    private int hiredEmployees;

    public LegalPerson() {}

    public LegalPerson(String name, Double annualIncome, int hiredEmployees) {
        super(name, annualIncome);
        this.hiredEmployees = hiredEmployees;
    }

    public int getHiredEmployees() {
        return hiredEmployees;
    }

    public void setHiredEmployees(int hiredEmployees) {
        this.hiredEmployees = hiredEmployees;
    }

    @Override
    public double calculateIncomeTax(){
        if(hiredEmployees>10)
            return 0.14*annualIncome;

        return 0.16*annualIncome;
    }
}
