package tugas3;

class Node {

    int data;
    Node next;
    
    Node (int dat){
        data = dat;
        next = null;
    }
}

class List {

    Node head;
    Node tail;

    boolean isEmpty() {
        return (head == null);
    }

    Node newNode(int data) {
        Node r = new Node(data);
        return r;
    }
    void addFirst(Node input) {
        if (isEmpty()) {	//Jika linked list masih kosong,
            head = input;	//maka head dan tail sama dengan node input
            tail = input;
        } else {
            input.next = head;	//Jika linked list sudah berisi,
            head = input;	//maka input akan di depan dan menjadi head
        }
    }

    void addLast(Node input) {
        if (isEmpty()) {	//Jika linked list masih kosong,
            head = input;	//maka head dan tail sama dengan node input
            tail = input;
        } else {
            tail.next = input;	//Jika linked list sudah berisi,
            tail = input;	//maka input akan di belakang dan menjadi tail
        }
    }

    void insertAfter(int key, Node input) {
        Node temp = head;
        do {
            if (temp.data == key) {	//Jika data sama dengan key, maka input
                input.next = temp.next; //disambung diantara temp dan temp.next
                temp.next = input;
                System.out.println("Insert data is succeed.");
                break;	//dari temp --> temp.next menjadi :
            }			//temp --> input --> temp.next
            temp = temp.next;
        } while (temp != null);
    }

    void insertBefore(int key, Node input) {
        Node temp = head;
        while (temp != null) {
            if ((temp.data == key) && (temp == head)) {
                this.addFirst(input);	/* jika insert pada awal linked list
                 maka call method addFirst */

                System.out.println("Insert data is succeed.");
                break;
            } else if (temp.next.data == key) {
                input.next = temp.next;	//dari temp --> temp.next menjadi
                temp.next = input;			//temp --> input --> temp.next
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.next;
        }
    }

    void removeFirst() {
        //Node temp = head;
        if (!isEmpty()) {
            if (head == tail) {		//jika element linked list hanya 1,
                head = tail = null;		//maka head dan tail menjadi null
            } //sehingga linked list kosong
            else {
                //temp = temp.next;		//memajukan temp ke temp.next
                head = head.next;		//kemudian head dipindah ke temp
            }
        } else {
            System.out.println("Data is empty!");
        }
    }

    void removeLast() {
        Node temp = head;
        if (!isEmpty()) {
            if (tail == head) {		//jika element linked list hanya 1
                head = tail = null;		//maka head dan tail menjadi null
            } //sehingga linked list kosong
            else {
                while (temp.next != tail) {
                    temp = temp.next;	//memajukan temp hingga satu elemen
                }						//sebelum tail.
                temp.next = null;		//temp.next di-null,dan jadi akhir LL
                tail = temp;		//tail dipindah ke temp
            }
        } else {
            System.out.println("Data is empty!");
        }
    }

    void remove(int key) {
        Node temp = head;
        if (!isEmpty()) {
            while (temp != null) {
                if (temp.next.data == key) {	//mengganti temp.next dengan
                    temp.next = temp.next.next; //temp.next.next
                    break;	//dari temp --> temp.next -->temp.next.next
                } //menjadi temp --> temp.next.next
                else if ((temp.data == key) && (temp == head)) {
                    this.removeFirst();//jika key berada pada awal linked list,
                    break;		//maka call method removeFirst
                }
                temp = temp.next;
            }
        } else {
            System.out.println("Data is empty!");
        }
    }

    void find(int key) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                found = true;
                break;
            }
            i++;
            temp = temp.next;
        }
        if (found) {
            System.out.println(key + " is found at index " + i);
        } else {
            System.out.println("Data isn't found");
        }
    }

    void InsertSorted(Node newnode) {
        Node current;
        if ((head == null) || (head.data >= newnode.data)) {
            newnode.next = head;
            head = newnode;
        } else {
            current = head;
            while ((current.next != null) && (current.next.data < newnode.data)) {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

    void printNode() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
