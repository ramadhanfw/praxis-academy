// Java program to demonstrate accessing of members when 
// corresponding classes are imported and not imported. 
import java.util.Vector; 

public class packages 
{ 
public packages() 
{ 
	
	Vector newVector = new Vector(); 

	java.util.ArrayList newList = new java.util.ArrayList(); 
} 

public static void main(String arg[]) 
{ 
	new packages(); 
} 
} 
