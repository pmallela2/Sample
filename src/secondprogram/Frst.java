package secondprogram;

public class Frst {
	public static void main(String args[]){
			Addition add = new Addition(100, 200, 300);
			add.display();
			add.initialize();
			add.display();
			add.initialize(1000,2000,3000);
			add.display();
		Frst obj = new Frst();
		obj.test();
			
	}
	void test(){
		int i;
		i = 10;
		System.out.println("Calling non static method from static" + " " + i);
		//this.stat();
	}
}
