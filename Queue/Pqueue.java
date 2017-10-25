package pqueue;
import java.util.Scanner;
import java.util.Random;
public class Pqueue {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Banyak data : ");
        int n = input.nextInt();
        Queue Q=new Queue();
        Random r=new Random();
        for(int i=1;i<=n;i++){
            char x=(char)(r.nextInt(26)+65);
            Q.enqueue(x);
        }
        Q.displayM();
        Q.dequeueM();Q.dequeueM();//Q.dequeueM();
        Q.displayM();
        Q.enqueueM('T');
        Q.displayM();
        Q.enqueueM('U');
        Q.displayM();
        Q.enqueueM('V');
        Q.displayM();
        for(int i=0; i<Q.max_data; i++)
            System.out.print(Q.item[i]+" ");
    }
    
}
