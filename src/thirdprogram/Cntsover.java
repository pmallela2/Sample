package thirdprogram;

public class Cntsover {
	int id;
	int val;
	int z;
	Cntsover(){
		
	}
	Cntsover(int x,int y){
		id = x;
		val = y;
	}
	Cntsover(int x,int y,int a){
		id = x;
		val = y;
		z = a;
	}
	void display(){
		System.out.println(id + " " + val + " " + z);
	}
public static void main(String args[]){
	
	Cntsover obj = new Cntsover(10,30);
	Cntsover obj1 = new Cntsover(30,40,50);
	obj.display();
	obj1.display();
}
}
