package advancedsort;
import java.util.Scanner;
import java.util.Random;

public class AdvancedSort {
  public static int cc,n;  
  public static int[] z;  
  public static Cetak c=new Cetak();
    
  public static int partisiA(int[] x,int aw,int ak){
   int i,j,t,pivot;
   pivot=x[aw];j=aw;//cout<<pivot<<endl;
   for (i=aw+1;i<=ak;i++){//cc++;
     if (x[i]<pivot) {
       j++;t=x[i];x[i]=x[j];x[j]=t;
     }
    } 
  x[aw]=x[j];x[j]=pivot;
  return j;
  }
public static int partisiB(int[] x,int aw,int ak)
{ int i,j,t,pivot;
  pivot=x[aw];//cout<<pivot<<endl;
  i=aw;j=ak;
  while (i<j){
    while ((i<ak)&&(x[i]<=pivot)) i++; 
    while ((j>aw)&&(x[j]>pivot)) j--;  
    if (i<j) {t=x[i];x[i]=x[j];x[j]=t;}
  }
  x[aw]=x[j];x[j]=pivot;
  c.cetak(x,n);
  return j;
}
public static void qsort(int[] x,int aw,int ak)
{ int j;
  if (aw<ak) {
     j=partisiB(x,aw,ak);
     qsort(x,aw,j-1);
     qsort(x,j+1,ak);
  }
}
  public static void merge(int[] x, int aw,int mid,int ak){
  int i,j,k,l;
  i=aw;j=mid+1;k=aw;
  do {cc++;
    if(x[i]<=x[j]) {z[k]=x[i];i++;}
    else {z[k]=x[j];j++;}
    k++;}
  while ((i<=mid) && (j<=ak));
  if (i>mid) for (l=j;l<=ak;l++) {z[k]=x[l];k++;}
  else for (l=i;l<=mid;l++) {z[k]=x[l];k++;}
  for (k=aw;k<=ak;k++) x[k]=z[k];
  //c.cetak(x,n);
}
public static void sort(int[] x,int aw,int ak)
{int mid;
  if(aw<ak) {
    mid =(aw+ak)/2;
    sort(x,aw,mid);
    sort(x,mid+1,ak);
    merge(x,aw,mid,ak);
  }
}
public static void MergeQuick(int[] x,int aw,int ak)
{int mid;
  if(ak-aw<60000) qsort(x,aw,ak);
  else {mid =(aw+ak)/2;
    MergeQuick(x,aw,mid);
    MergeQuick(x,mid+1,ak);
    merge(x,aw,mid,ak);
  }
}
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("banyak data = ");
        n = input.nextInt();
        int[] x=new int[n+1];
        z=new int[n+1];
        Random r=new Random();
        for(int i=1;i<=n;i++){
            x[i]=r.nextInt(100)+1;  
          }
       // System.out.println("Data sebelum terurut :");
      //  c.cetak(x, n);
        double start=System.nanoTime();
      // MergeSort hasil=new MergeSort();
        //hasil.sort(x,1,n);
        sort(x,1,n);
        //MergeQuick(x,1,n);
        double finish=System.nanoTime();
     //   System.out.println("Data terurut :");
       // c.cetak(x, n);
        System.out.println("waktu proses = "+(finish-start)/1.0E9+" detik");
        System.out.println("perbandingan = "+cc);

    }
    
}
