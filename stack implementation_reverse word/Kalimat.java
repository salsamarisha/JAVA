package pstack;

public class Kalimat {
  public void balik(String st){
        Stack S=new Stack();
        char[] kal;
        kal=st.toCharArray();
        for(int i=0;i<st.length();i++){ 
           S.push(kal[i]);
        }
        S.Display();
        int i=0;
        while (!S.isEmpty()){
            char c=S.pop();kal[i++]=c;
        }
        String hasil=new String(kal);
        System.out.print("Hasilnya :");
        System.out.println(hasil);
  }    
   public void balance(String st){
        Stack S=new Stack();
        char[] kal;
        kal=st.toCharArray();
        int i=0;boolean cek=true;
        while (i<st.length()){ 
            if (kal[i]=='{' || kal[i]=='[' || kal[i]=='(' ) S.push(kal[i]);
            else { if(!S.isEmpty())
            {if ((kal[i]=='}' && S.item[S.top]=='{') ||
                (kal[i]==']' && S.item[S.top]=='[')||
                (kal[i]==')' && S.item[S.top]=='(')
                ){
                 char x=S.pop();
                }}
            else {
              if ((kal[i]=='}')||(kal[i]==']')||(kal[i]==')')) {cek=false;i=st.length();}
             } 
            }
            i++;      
        }
        if ((!S.isEmpty())||(cek==false)){ 
                System.out.println("Tidak valid");}
        else {System.out.println("valid");}     
   }
}
