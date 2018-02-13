package firstprogram;

class Sample extends Constructorsample {
	@Override
	void car() {
		System.out.println("Car is ready");
		// TODO Auto-generated method stub
	}
	public static void main(String[] args){
		Constructorsample obj = new Sample();
		obj.bike();
		obj.car();		
	}
}
