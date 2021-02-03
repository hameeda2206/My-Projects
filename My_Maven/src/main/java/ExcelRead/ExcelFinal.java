package ExcelRead;

import java.io.IOException;

public class ExcelFinal 
{
	
	public static void main (String args[]) throws IOException
	{
	 ExcelVal ob = new 	ExcelVal();
	 String p = ob.readdata(0, 0);
	 System.out.println(p);
	 String q = ob.readdata(1, 0);
	 System.out.println(q);		 
	}

}
