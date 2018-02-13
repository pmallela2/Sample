package basics;

public class ReversStr_prgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str = "Praveen Kumar";
		StringBuilder obj = new StringBuilder();
		  obj.append(str);
		obj = obj.reverse();
		for(int i=0;i<obj.length();i++)
		{
			System.out.print(obj.charAt(i));
		}
		
	}

}
