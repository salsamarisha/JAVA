package pbstlinkedlist;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PbstLinkedList {
    public static void main(String[] args) throws IOException {
        Scanner input =new Scanner(System.in);
        System.out.print("banyak data = ");
        char x;
        int n = input.nextInt();
        Bst T=new Bst();
        Random r=new Random(2);
        for(int i=1;i<=n;i++){
            x=(char)(r.nextInt(26)+65);
            System.out.print(x+" ");
            T.root = T.insertR(x,T.root);
           //T.insert(x); 
         }
        System.out.println();
        System.out.print("PreOrder  :");
        T.preOrder();
        System.out.println();
        System.out.print("InOrder   :");
        T.inOrder();
        System.out.println();
        System.out.print("PostOrder :");
        T.postOrder();
        System.out.println();
//        System.out.print("Data yg dicari :");char huruf;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader( isr );
 //       huruf = (char)br.read();
        System.out.println();
   //     System.out.println(" ada = "+T.find(huruf));
        System.out.println(" Minimum = "+T.findMin());
        System.out.println(" Maksimum = "+T.findMax());
      //  T.delLeaf(huruf);
        //Node temp=T.carimaxkiri();
        //System.out.println(temp.data);
       // T.removemax(T.root);
        T.removeroot();
        System.out.println();
        System.out.print("PreOrder  :");
        T.preOrder();
        System.out.println();
        System.out.print("InOrder   :");
        T.inOrder();
        System.out.println();
  
    }
    
}
