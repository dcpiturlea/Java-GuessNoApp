package com.company;


import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Exercitii {


    public void Exercitiu1() {

        int numarul1;
        int numarul2;
        Scanner input = new Scanner(System.in);
        System.out.println("Write a small program that reads 2 numbers from keyboard and display on the console the greatest number\n \n" +
                "Pentru a vedea care numarul este mai mare va rugam itnroduceti doua numere: ");
        numarul1 = input.nextInt();
        numarul2 = input.nextInt();
        if (numarul1 > numarul2) {
            System.out.println("Numarul " + numarul1 + " este mai mare decat " + numarul2);
        } else if (numarul2 > numarul1) {
            System.out.println("Numarul " + numarul2 + " este mai mare decat " + numarul1);
        } else {
            System.out.println("Numerele sunt egale");
        }
    }

    public void Exercitiul2() {
        /*

a+b+c

2*a + 3*b+4*c

(a+b)/c as a double (the exact value)

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Write a small program that reads 3 numbers from keyboard and displays on the console the following results:\n\n" +
                "Introduceti trei numere");
        int numarul1 = input.nextInt();
        int numarul2 = input.nextInt();
        int numarul3 = input.nextInt();
        double numarul4;
        numarul4 = ((double) numarul1 + (double) numarul2) / 2;
        System.out.println(numarul1 + numarul2 + numarul3);
        System.out.println(2 * numarul1 + 3 * numarul2 + 4 * numarul3);
        System.out.println(numarul4);

    }

    public int Exercitiul3() {
         /*


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20sssss
sortaSum(10, 11) → 21

          */
        System.out.println("Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.\n\n" +
                "Introduceti 2 nr");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sumAB = a + b;
        if (sumAB >= 10 && sumAB <= 19) {
            sumAB = 20;
        }
        System.out.println(sumAB);
        return sumAB;
    }


    public boolean Exercitiul4() {
        /*
         The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6 or if their sum or difference is 6

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true

         */
        Scanner input = new Scanner(System.in);
        System.out.println(" The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6 or if their sum or difference is 6\n\n" +
                "Va rugam introduceti doua numere");
        int a = input.nextInt();
        int b = input.nextInt();
        boolean c = false;
        boolean d = false;
        if ((a == 6 || b == 6) || (a + b == 6) || (a - b == 6) || (b - a == 6)) {
            c = true;
            d = c;
        } else if (c = false) {
            System.out.println("Eroare");
        }
        System.out.println(d);
        return d;
    }

    public void Exercitiul5() {
        /*
blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
         */
        System.out.println("Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.\n\n" +
                "Introduceti Doua numere mai mare decat 0");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a <= 21 && b <= 21) {
            if (21 - a > 21 - b)
                System.out.println(b + " Este mai aproape de 21");
            else if (21 - b > 21 - a) {
                System.out.println(a + " Este mai aproape de 21");
            }
        }
        if (a > 21 && b <= 21) {
            System.out.println("Numarul " + b + " este mai aproape de 21, deoarece " + a + " depaseste 21, deci nu este luat in considerare");
        }
        if (a <= 21 && b > 21) {
            System.out.println("Numarul " + b + " este mai aproape de 21, deoarece " + a + " depaseste 21, deci nu este luat in considerare");
        }
        if (a > 21 && b > 21)
            System.out.println("numerele depasesc 21");
    }

    public void Exercitiul6() {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Given three ints, a b c, return true if it is possible to add two of the ints to get the third.sss\n\n"
                + "Va rugam sa introduceti cele trei numere(enter dupa fiecare):");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if ((c == a + b) || (b == a + c) || (a == b + c)) {
            System.out.println("true");
        }
    }

    public void Exercitiul7() {
        int a;
        int noOfDigit = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Read a number from keyboard and store it in a variable named a. Find the numbers of digits of a and display the value on console\n" +
                "Va rugam sa introduceti un numar: ");
        a = input.nextInt();
        while (a != 0) {
            a = a / 10;
            noOfDigit++;

        }
        System.out.println("Numarul dumneavoastra are " + noOfDigit + " Cifre");
    }

    public void Exercitiul8() {

        Scanner input = new Scanner(System.in);
        System.out.println("Read numbers from keyboard and store them in an array until the user inputs an even number. Print the resulting array" +
                "\n\nIntroduceti cate numere doriti sa tastati): ");
        int nrElemente=  input.nextInt();
        int array[] = new int[nrElemente];
        int array2[] = new int[nrElemente];
        int j=0;
        System.out.println("Va rugam sa introduceti numerele(enter dupa fiecarE):");
        for (int i=0; i<nrElemente && j<nrElemente; i++){
            array[i]=  input.nextInt();
            array2[j] = array[i];
            j++;
           System.out.println(array2[i]);
        }

    }
}
