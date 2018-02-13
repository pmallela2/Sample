package thirdprogram;

public class ConstructorPrgrm {
	
	int i;
	String emp;
	/*ConstructorPrgrm(){
		System.out.println(i + " " + emp);
	}*/
	void display(){
		 System.out.println(i + " " + emp);
	}
	public static void main(String args[]){
		ConstructorPrgrm obj = new ConstructorPrgrm();
		obj.display();
	}
}
