// 나영서
// 연소득 과세금액 계산 프로그램

package Mini.Q8;

import java.util.Scanner;

public class Quiz8 {
    static int[] range = {12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000};
    static double[] tax_rate = {.06, .15, .24, .35, .38, .4, .42, .45};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int income = scanner.nextInt();

        int[] tax = calTax(income);

        System.out.println();
        System.out.printf("[세율에 의한 세금]:\t\t\t%10d", tax[0]);
        System.out.println();
        System.out.printf("[누진공제 계산에 의한 세금]:\t%10d", tax[1]);
    }

    static int byTaxrate(int income, int level) {
        double tax = 0;

        if (level == 0) {
            tax = income * tax_rate[0];
            printTaxFormat(income, (int) (tax_rate[0] * 100), (int) tax);
            return (int) tax;
        }

        for (int i = 0; i <= level; i++) {
            int taxAtLevel;
            if (i == 0) {
                taxAtLevel = (int) (range[i] * tax_rate[i]);
                tax += taxAtLevel;
                printTaxFormat(range[i], (int) (tax_rate[i] * 100), taxAtLevel);
            } else if (i != level) {
                taxAtLevel = (int) ((range[i] - range[i - 1]) * tax_rate[i]);
                tax += taxAtLevel;
                printTaxFormat(range[i] - range[i - 1], (int) (tax_rate[i] * 100), taxAtLevel);
            } else {
                taxAtLevel = (int) ((income - range[i - 1]) * tax_rate[i]);
                tax += taxAtLevel;
                printTaxFormat(income - range[i - 1], (int) (tax_rate[i] * 100), taxAtLevel);
            }
        }
        return (int) tax;
    }

    static int byNG(int income, int level) {
        int[] NG = {0, 1080000, 5220000, 14900000, 19400000, 25300000, 35400000, 65400000};
        int tax = (int) (Math.ceil(income * tax_rate[level]));
        tax -= NG[level];
        return tax;
    }

    static int[] calTax(int income) {
        int[] taxArr = {0, 0};
        int level = 0;

        if (income <= 12000000) {
        } else if (income <= 46000000) {
            level = 1;
        } else if (income <= 88000000) {
            level = 2;
        } else if (income <= 150000000) {
            level = 3;
        } else if (income <= 300000000) {
            level = 4;
        } else if (income <= 500000000) {
            level = 5;
        } else if (income <= 1000000000) {
            level = 6;
        } else {
            level = 7;
        }

        taxArr[0] = byTaxrate(income, level);
        taxArr[1] = byNG(income, level);

        return taxArr;
    }

    static void printTaxFormat(int a, int b, int c){
        System.out.printf("%10d * %2d%% = %10d\n",a,b,c);
    }
}

