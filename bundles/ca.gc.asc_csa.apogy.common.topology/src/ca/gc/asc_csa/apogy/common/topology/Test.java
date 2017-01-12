package ca.gc.asc_csa.apogy.common.topology;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static String convertFilterStringToRegex(String filterString)
	{
		String regex = new String(filterString);
		
		if(filterString.indexOf("*") >= 0)
		{
			// Replace all * by .*
			regex = regex.replace("*", ".*");								
		}
		
		// If the filter string does not start with .*, adds a ^
		if(!regex.startsWith(".*"))
		{
			regex = "^" + regex;			
		}
		
		if(!regex.endsWith(".*"))
		{
			regex = regex + ".*";
		}
		
		return regex; 
	}
	
	public static void main(String[] args) 
	{
		List<String> lines = new ArrayList<>();
		lines.add("MESR_FRONT_LEFT_WHEEL");
		lines.add("SMA_FRONT");
		lines.add("MOUNT_SMA_TURRET");
		lines.add("SMA_TURRET");
		lines.add("MESR_ROOT");
		lines.add("AMESR_FRONT_LEFT_WHEEL");
		
		// String to be scanned to find the pattern.
	      
	      String filterString = "SMA_";
	      String pattern = convertFilterStringToRegex(filterString);

	      System.out.println("Pattern " + pattern);
	      
	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      for(String line : lines)
	      {
		      Matcher m = r.matcher(line);
		      if (m.find( )) 
		      {
		         System.out.println("Found match: " + line);	         
		      }		      
	      }
	}

}
