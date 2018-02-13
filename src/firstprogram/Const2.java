package firstprogram;

public class Const2 {
     
    int id;  
    String name;  
      Const2(){
    	  System.out.println("Constructor value is displayed");
      }
    void display(){System.out.println(id+" "+name);}  
      
    public static void main(String args[]){  
    	Const2 s1=new Const2();  
    	Const2 s2=new Const2();  
    /*s1.display();  
    s2.display();  */
    }
}
