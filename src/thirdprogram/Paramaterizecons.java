package thirdprogram;

public class Paramaterizecons {
	int i;
	String emp;
	
	Paramaterizecons(int i,String emp){
		System.out.println("Parameterize Values" +" "+ i +" "+ emp);
	}
	void display(){
		System.out.println("Parameterize Values" +" "+ i +" "+ emp);
	}
	public static void main(String args[]){
			Paramaterizecons obj = new Paramaterizecons(10,"praveen");
			obj.display();
	}

}
