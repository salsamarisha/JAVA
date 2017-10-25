package cobacoba;

import java.util.Scanner;

public class binnarysearch {

    Scanner input = new Scanner(System.in);

    void search(double[] X) {
        int c, first, last, middle, n = X.length;
        double search;

        search = input.nextDouble();
        first = 0;
        last = n - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (X[middle] < search) {
                first = middle + 1;
            } else if (X[middle] == search) {
                System.out.println(search + " Ditemukan " + " di baris ke  " + (middle + 1) + ".");
                break;
            } else {
                last = middle - 1;
            }

            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(search + " Data tidak ditemukan \n");
        }
    }
}
