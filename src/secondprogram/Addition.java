package secondprogram;

public class Addition {
	int x;
	int y;
	int z;

	Addition(){
		x = 10;
		y = 20;
		z = 30;	
	}
	
	Addition(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;	
	}
	
	public void initialize() {
		x = 40;
		y = 50;
		z = 60;			
	}
	
	public void initialize(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;	
	}
	
	public void display()
	{
		System.out.println(x + " " + y + " " + z);
	}
}
