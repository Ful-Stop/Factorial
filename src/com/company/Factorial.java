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
        double E_Last = 1;
        int check = 1;
        while(E_Last > .001){
            check ++;
            E_Last = E_New;
            E_New += 1/calcFactorial(check);
        }
        return E_Last;
    }

    public static void main(String[] args) {
	// calFactorial
        for (int i = 1; i <= 20; i ++)
            System.out.println(calcFactorial(i));


        System.out.println(calcE());



    }
}
