package pbstlinkedlist;

  class Node {
     char data;
     Node left,righ;
    void preOrder(){
        System.out.print(data+" ");
        if (left!=null) left.preOrder();
        if (righ!=null) righ.preOrder();
    }
    void inOrder(){
        if (left!=null) left.inOrder();
        System.out.print(data+" ");
        if (righ!=null) righ.inOrder();
    }
    void postOrder(){
        if (left!=null) left.postOrder();
        if (righ!=null) righ.postOrder();
        System.out.print(data+" ");
    }

    void removemax(){
        Node temp;
	if(righ.righ == null){
           temp=righ;                    
           righ=temp.left;
	} else 
	   righ.removemax();
}
  }


public class Bst {
    Node root;
    public Bst(){
      root=null;  
    }
    Node insertR(char input, Node T){
      if(T==null){
        Node b=new Node();
        b.data=input;
        b.left=null;b.righ=null;
        T=b;
      }
      else
        if(input<T.data)
           T.left=insertR(input,T.left);
        else if(input>T.data) 
           T.righ=insertR(input,T.righ);
      return T;
    }
    public void insert(char input){
        Node baru=new Node();
        baru.data=input;
        baru.left=null;baru.righ=null;
        if(root==null)root=baru;
        else{
           Node q=root;
           Node p=root;
           while (q!=null){
             p=q;  
             if(input<p.data) q=p.left;
             else if(input>p.data) q=p.righ;else q=null;
           }
           if(input<p.data) p.left=baru;else
           if(input>p.data) p.righ=baru;
        }  
    }

    public void preOrder(){
      if (root!=null) 
        root.preOrder();
    }
    public void inOrder(){
      if (root!=null) 
        root.inOrder();
    }
    public void postOrder(){
     if (root!=null) 
        root.postOrder();
     }

    public boolean find(char x){
      if(root!=null) {
         Node q=root; Node p;
         while (q!=null && q.data!=x) {
            p=q;     
            if(x<p.data) q=p.left;
            else if(x>q.data) q=p.righ;
         }           
          return q != null;
     }
     return false;
    }
    
    public char findMin()
    {
     if(root!=null) {
        Node q=root;
        while (q.left!=null) q=q.left;
        return q.data;
       }
     else return 0;
    }
    public char findMax()
    {
     if(root!=null) {
        Node q=root;
        while (q.righ!=null) q=q.righ;
        return q.data;
       }
     else return 0;
    }
    public void delLeaf(char x){
    if(root!=null) {
       Node q=root,p=q,r=p;
       while (q!=null && x!=p.data) {
          r=p;p=q;     
          if(x<p.data) q=p.left;else q=p.righ;
        }           
        if ((q==null && x==p.data) && (p.left==null && p.righ==null)){ 
           if (x<r.data) r.left=null; else r.righ=null;
        }  
         else System.out.println("bukan daun");      
      }
    }
    
    Node carimaxkiri(){
      if(root!=null) {
        Node q=root.left;
        while (q.righ!=null) q=q.righ;
        return q;
      }
      else return null;
    }
    void removemax(Node T){
	if(T.righ.righ==null)                   
           T.righ=T.righ.left;
	 else 
	    removemax(T.righ);
    }

    public void removemaxkiri(){
      if (root.left!=null) removemax(root.left);
 	 
    }

    public void removeroot(){
     if (root!=null){
       Node temp=carimaxkiri();
       root.data=temp.data;          
       removemaxkiri();
   }	 
}

    
}
