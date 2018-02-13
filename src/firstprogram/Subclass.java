package firstprogram;

  class Subclass extends Basic{
	
		  public static void main(String args[]) { 
			  Basic obj = new Subclass();
			  obj.makeNoise();
			   }
		@Override
	 void makeNoise(){
			int sum;
			@SuppressWarnings("unused")
			int m1a;
		  sum = i+j;
		  m1a = i*j;
		  System.out.println(sum);
		  System.out.println(m1a);
		}
		
	}

