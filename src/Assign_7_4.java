//This program converts three types of date format to common type yyyy-mm-dd
//SimpleDateFormat Class is used
import java.text.SimpleDateFormat;  
import java.util.Date; 
public class Assign_7_4 {
	public static void main(String[] args)throws Exception {  
	    // Providing different format to the variable in string format
		String sDate1="31 12 1998";  
	    String sDate2="24,02,2011"; 
	    String sDate3="23, 08, 2022";  
	    // parsing the string format to date type using SimpleDateFormat constructor
	    Date date1=new SimpleDateFormat("dd MM yyyy").parse(sDate1);  
	    Date date2=new SimpleDateFormat("dd,MM,yyyy").parse(sDate2); 
	    Date date3=new SimpleDateFormat("dd, MM, yyyy").parse(sDate3); 
	   // Assigning new desired type of format 
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		// converting the parsed dates into the desired format and printing them.
	    System.out.println(formatter.format(date1));
		System.out.println(formatter.format(date2));
		System.out.println(formatter.format(date3));
	     
	}  
} 