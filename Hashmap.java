import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		
			  HashMap<Integer,String> HM=new HashMap<Integer,String>();  
			  HM.put(1,"Ajay");  
			  HM.put(2,"Sunil");  
			  HM.put(3,"Sharma");  
			  HM.put(4,"Rahul");  
			  for(Map.Entry m:HM.entrySet()){  
			   System.out.println(m.getValue());  
			  }  
			 }  
			

	}


