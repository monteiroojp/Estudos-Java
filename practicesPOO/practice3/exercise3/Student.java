package practicesPOO.practice3.exercise3;

public class Student {
    public String name;
    public double finalGrade = 0.0;

    public void showResult(){
        if(finalGrade > 60.0)
            System.out.printf("FINAL GRADE = %.2f%nPASS%n", finalGrade);
        else
            System.out.printf("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS%n", finalGrade, 60.0-finalGrade);
    }
}
