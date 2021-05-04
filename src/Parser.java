import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Parser {	
	public static void main(String[] args) {
		
		ObjectMapper op = new ObjectMapper();
		
		//String jsonString=" {\"id\": 101,\"name\": \"john\"}";
		
		String dir= System.getProperty("user.dir");
		String filename =dir+"/Data/Employee.json";
		
				System.out.println(filename);
				
				System.out.println();
		
		try {
			
			//if it is jsonstring
			//Pojo p	= op.readValue(jsonString, Pojo.class);
			
			//if it is a file
			Pojo p	= op.readValue(new File(filename), Pojo.class);
			
			System.out.println(p.getId());     
	    System.out.println(p.getName());
	    
			
	    }
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
  
}
}
