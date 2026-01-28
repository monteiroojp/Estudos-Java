package practicesPOO.practice8.exercise4;

public class NaturalPerson extends Person{
    private Double healthExpenses;

    public NaturalPerson(){
        super();
    }

    public NaturalPerson(String name, Double annualIncome, Double medicalExpenses) {
        super(name, annualIncome);
        this.healthExpenses = medicalExpenses;
    }

    public Double getMedicalExpenses() {
        return healthExpenses;
    }

    public void setMedicalExpenses(Double medicalExpenses) {
        this.healthExpenses = medicalExpenses;
    }

    @Override
    public double calculateIncomeTax() {
        double healthDiscount = healthExpenses > 0 ? 0.5 * healthExpenses : 0;
        if(annualIncome < 20000.0){
            return 0.15*annualIncome - healthDiscount;
        }
        return 0.25*annualIncome - healthDiscount;
    }
}
