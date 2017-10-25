package advancedsort;

public class Cetak {
    void cetak(int[] x,int n){
        for(int i=1;i<=n;i++){
            System.out.print(x[i]+" ");
            if(i%20==0) System.out.println();
        }
        System.out.println();
        
    }
}
