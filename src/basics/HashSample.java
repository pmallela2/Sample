package basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		 Map<Integer, String> h = new HashMap<Integer, String>();
		 h.put(0, "Ravi");
		 h.put(1, "Ravi");
		 h.put(2, "Praveen");
		 h.put(3, "Phani");
		 Set<String> s=new HashSet<>();
		//System.out.println(h.size());
		/* for(i=1;i<=h.size();i++){
			 s.add(h.get(i));
		 System.out.println(h.get(i));
		 
		 }*/
		
		/*for(Map.Entry<Integer,String> m1:h.entrySet()){
		s.add(m1.getValue());
		 //System.out.println(s.toString());
		 
	}*/
		System.out.println(h);
	}
}

// ******HashMap*****
//Map<Integer, String> h = new HashMap<Integer, String>();
//System.out.println(selectElement.size());
    /*int i = 0;
    String s;
    int cnt;*/
/*for(Map.Entry<Integer,String> m1:h.entrySet()){
           val.add(m1.getValue());
     //h.put(i,reqElement.getText());
	//System.out.println(reqElement.getText());
 
}*/
       //System.out.println(h);
//System.out.println(val.toString());

//Map<Integer, String> h = new HashMap<Integer, String>();
//System.out.println(selectElement.size());
//    int i = 0;
//    String s;
//    int cnt;
//for (WebElement suggestion : selectElement)
//{      
//      // h.put(i,suggestion.getText());
//      s = suggestion.getText();
//      String[] city=s.split(" ");
//      cnt = city.length;
//      System.out.println(cnt);
//      for(String w:city)
//      {
//    	  System.out.println(w);
//   if (w.equalsIgnoreCase("Mumbai")) {
//	      
//  }
//     //  System.out.println(i+" "+h.get(i));
//      // i++;
//}
   
/*jobfunc.selectByVisibleText("Mumbai");
webElement.sendKeys(Keys.ENTER);*/
/*   for(Entry entry:h.entrySet())
System.out.println(entry.getKey()+" "+entry.getValue());*/
//}
//*******Hashset********
//Set<String> val=new HashSet<>();
