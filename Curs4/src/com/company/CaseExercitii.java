package com.company;

import java.util.Scanner;

public class CaseExercitii extends Exercitii {
    int caseExercitii;

    public void CaseExercitii() {
        Scanner input = new Scanner(System.in);
        int alegere;
        String oneMoreTime;
        System.out.println("Vreti sa va jucati?(DA/NU)");
        oneMoreTime = input.nextLine();
        while (oneMoreTime.equals("da")) {
            System.out.println("\nAlegeti ce exercitiu vrei sa rezolvati(intre 1 si 10)");
            alegere = input.nextInt();
            if (alegere > 10 || alegere < 1) {
                System.out.println("Va rugam introduceti un numar intre 1 si 10:");
                alegere = input.nextInt();
            } else {
                switch (alegere) {
                    case 1:
                        Exercitii case1 = new Exercitii();
                        case1.Exercitiu1();
                        break;

                    case 2:
                        Exercitii case2 = new Exercitii();
                        case2.Exercitiul2();
                        break;
                    case 3:
                        Exercitii case3 = new Exercitii();
                        case3.Exercitiul3();
                        break;
                    case 4:
                        Exercitii case4 = new Exercitii();
                        case4.Exercitiul4();
                        break;
                    case 5:
                        Exercitii case5 = new Exercitii();
                        case5.Exercitiul5();
                    case 6:
                        Exercitii case6 = new Exercitii();
                        case6.Exercitiul6();
                        break;
                    case 7:
                        Exercitii case7 =new Exercitii();
                        case7.Exercitiul7();
                        break;
                    case 8:
                        Exercitii case8 =new Exercitii();
                        case8.Exercitiul8();
                        break;

                }

            }

        }
    }
}

