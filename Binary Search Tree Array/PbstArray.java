package pbstarray;
import java.util.Random;
import java.util.Scanner;

public class PbstArray {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("banyak data = ");
        char x;
        int n = input.nextInt();
        Bst T=new Bst();
        Random r=new Random();
        for(int i=1;i<=n;i++){
           // x=(char)(r.nextInt(26)+65);
           x=(char) input.nextInt();
            System.out.print(x+" ");
            T.insert(x, i);
         }
        System.out.println();
        System.out.println("Indeks terakhir = "+T.index);  
        System.out.println();
        System.out.print("PreOrder  :");
        T.preOrder(1);
        System.out.println();
        System.out.print("InOrder   :");
        T.inOrder(1);
        System.out.println();
        System.out.print("PostOrder :");
        T.postOrder(1);
        System.out.println();
        System.out.print("LevelOrder:");
        T.levelOrder(1);
        System.out.println();
 
    }
    
}
