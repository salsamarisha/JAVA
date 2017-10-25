//Tugas 2 Marisha Salsabila 16/394091/PA/17182

package cobacoba;

import java.util.Scanner;

public class Cobacoba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan banyaknya data : ");
        int jumlah = input.nextInt();
        double X[] = new double[jumlah];
        int A[];
        A = new int[jumlah];
        double B[];
        B = new double[jumlah];

        for (int i = 0; i < X.length; i++) {
            X[i] = (float) (Math.random() * 4);
        }
        //Agar data memiliki data dua angka di belakang koma
        for (int i = 0; i < X.length; i++) {
            X[i] *= 100;
            A[i] = (int) X[i];
            B[i] = ((double) A[i]) / 100;
            X[i] = B[i];
        }

        System.out.println("Data sebelum terurut :");
        print P = new print();
        P.print(X);

        //Proses Bubble Sort
        Sorting Y = new Sorting();
        Y.sort(X);

        System.out.println("Data setelah terurut : ");
        print F = new print();
        P.print(X);

        //binnarysearch
        System.out.println("Masukkan IPK yang akan dicari : ");

        binnarysearch Z = new binnarysearch();
        Z.search(X);
    }

}
