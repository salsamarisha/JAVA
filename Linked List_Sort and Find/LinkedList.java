package tugas3;
import java.util.Scanner;
import java.util.Random;

public class LinkedList {

    public static void main(String[] args) {
        List L = new List();
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak data = ");
        int n = input.nextInt();
        Random r = new Random();
        System.out.println();
        System.out.print("Data sebelum diurutkan :  ");
        for (int i = 1; i <= n; i++) {
            int rd = r.nextInt(100) + 1;
            Node p = new Node(rd);
            L.InsertSorted(p);
            
            // L.addFirst(p);
           // L.addLast(p);
            System.out.print(rd + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("Data sesudah diurutkan : ");
        L.printNode();
        System.out.println();
        System.out.print("Cari =  ");
        int k = input.nextInt();
       // Node q=new Node();q.data=101;q.next=null;
        // L.insertBefore(k,q);
        // L.remove(k);
        L.find(k);
        System.out.println();
        System.out.print("Masukkan data = ");
        int m = input.nextInt();
        
        Node p = new Node (m);
        L.InsertSorted(p);
        System.out.println();
        System.out.println("Data :  ");
        L.printNode();
        System.out.println();
    }

}
