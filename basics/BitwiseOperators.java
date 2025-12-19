package basics;

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args){
        //These operators return the binary number(in decimal base) that is obtained from bit-bit operation
        //Example for the &:
        //n1 in binary = 0101 1001
        //n2 in binary = 0011 1100
        //n1 & n2 = 0001 1000 = 24 in decimal base

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        //Exercise(Verify if the sixth bit of a network is 1 or 0);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = 0b100000;

        if((n & mask) != 0){
            System.out.println("6th bit is true");
        }
        else{
            System.out.println("6th bit is false");
        }

        sc.close();
    }

}
