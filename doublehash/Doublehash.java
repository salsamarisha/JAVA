//Marisha Salsabila (10) 16/394091/PA/17182
package doublehash;

import java.util.Random;
import java.util.Scanner;

final class HashTable {

    private int table_size;
    private int primeSize;
    private int primeSize2;
    private int hash_table[];
    private int temp[];
    private int i = 0;

    public HashTable(int ts) {
        table_size = ts;

        hash_table = new int[primeSize(ts)];
        temp = new int[ts];
        for (int i = 0; i < ts; i++) {
            hash_table[i] = 0;  //array hash table  utama
            temp[i] = 0; //sebagai array penyimpan data yang tabrakan
        }
    }

    public static int primeSize(int table_size) {
        while (true) {
            boolean prima = true;

            int akar = (int) Math.sqrt(table_size);
            for (int m = 2; m <= akar; m++) {
                if (table_size % m == 0) {
                    prima = false;
                }
                if (prima) {
                    return table_size;
                }
                break;
            }

            table_size = table_size + 1;
            for (int k = 2; k <= akar; k++) {
                if (table_size % k == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                return table_size;
            }
        }
    }

    public static int primeSize2(int n) {
        while (true) {
            boolean prima = true;
            n = n - 1;
            int akar = (int) Math.sqrt(n);
            for (int i = 2; i <= akar; i++) {
                if ((n % i) == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                return n;
            }
        }
    }

    public int hashCode(int n) {
        return (n % primeSize(table_size));
    }

    public void insert(int value) {
        // for(int j=0; j<primeSize(table_size); j++){
        int index;
        index = hashCode(value);
        if (hash_table[index] == 0) {     //jika hash table kosong, data dimasukkan dengan indeks rumus hash
            hash_table[index] = value;
        } else if (hash_table[index] != 0) {  //jika index hash telah terisi, disimpan ke dalam array temp dulu
            temp[i] = value;
            i++;
            //}
        }
        for (int k = 0; k < i; k++) {
            int h = 1;
            //   int index;
//            index = hash_table[i] % primeSize(table_size);
            int hashCode2 = (primeSize2(table_size)) - (h * (value % primeSize2(table_size))); //fungsi hash 2
            // index=((temp[k]%primeSize(table_size)))+hashCode2;
            index = ((temp[k] % primeSize2(table_size)) + (hashCode2)) % primeSize2(table_size); //data di temp dikenakan fungsi hash2 untuk ditempatkan pada index hash table

//           while (hash_table[index] != 0) {
//               h++;
//               index = ((temp[k] % primeSize2(table_size)) + (h * hashCode2)) % primeSize2(table_size)+h; //data di temp dikenakan fungsi hash2 untuk ditempatkan pada index hash table
//                //jika data masih tabrakan, dikalikan dengan h+=1
//            }
//            if(hash_table[index]!=0 && index<=primeSize(table_size)){
//                h+=1;
//             //   System.out.println("ini h "+ h);
//                hashCode2 = (primeSize2(table_size)) - (h * (value % primeSize2(table_size)));
//                index = ((temp[k] % primeSize2(table_size)) + (h * hashCode2)) % primeSize2(table_size);
//            }
            if (hash_table[index] == 0 && index <= primeSize(table_size)) {
                hash_table[index] = temp[k];
            }
            if (index > primeSize(table_size)) {
                index = index % primeSize(table_size);
                if (hash_table[index] == 0) {
                    hash_table[index] = temp[k];
                }
            }

        }
    }

    public void print() {

        for (int i = 0; i < primeSize(table_size); i++) {
            System.out.println(i + " " + hash_table[i] + " ");
        }
    }

}

public class Doublehash {

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("banyaknya data : ");
        int n = input.nextInt();

        HashTable ht = new HashTable(n);
        Random r = new Random();
        for (int i = 1; i <= n; i++) {
            x = (r.nextInt(100));
            ht.insert(x);
            System.out.println(x);
        }

        System.out.println("hash table:");
        ht.print();
    }

}
