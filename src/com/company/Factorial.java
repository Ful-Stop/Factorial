package com.company;

public class Factorial {

    public static long calcFactorial(int n){
        long product = 1;

        for (int i = 1; i <= n; i++){
            product *= i;
        }
        return product;
    }

    public static double calcE(){
        double E_New = 2;
        double E = 1;
        double E_Diff = E_New - E;
        int check = 1;
        while(E_Diff > .001){
            check ++;
            E = E_New;
            E_New += 1.0/calcFactorial(check);
            E_Diff = E_New - E;
        }
        return E;
    }

    public static double calcEX(int x){
        double E = 1;
        double E_New = E + x/calcFactorial(1);
        double E_Diff = E_New - E;
        int check = 1;
        while(E_Diff > .001){
            check ++;
            E = E_New;
            E_New += Math.pow(x, check)/calcFactorial(check);
            E_Diff = E_New - E;
        }
        return E;
    }

    public static void main(String[] args) {
	// calcFactorial
        for (int i = 1; i <= 20; i ++)
            System.out.println(calcFactorial(i));

    // calcE
        System.out.println();
        System.out.println(calcE());

    // calcEX
        System.out.println();
        for (int i = 1; i <= 10; i ++)
            System.out.println(calcEX(i));

    }
}
