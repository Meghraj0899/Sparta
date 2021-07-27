package bankComplaints;

import java.util.Scanner;

public class HomePage {
public static void main(String[] args) {
 
	FetchComplaints fetch= new FetchComplaints ();
	fetch.loadData();
	Scanner sc=new Scanner(System.in);
	System.out.println("Select a number between 0 and 7 for the information you want to know:");
	System.out.println("1.Display all the complaints based on the year provided by the user ");
	System.out.println("2.Display all the complaints based on the name of the bank provided by the user");
	System.out.println("3.Display complaints based on the complaint id provided by the user ");
	System.out.println("4.Display number of days took by the Bank to close the complaint ");
	System.out.println("5.Display all the complaints closed/closed with explanation ");
	System.out.println("6.Display all the complaints which received a timely response ");
	
	int val=sc.nextInt();
	sc.nextLine();
	
	switch(val)
	{
	case 1: 
		System.out.println("Enter year for which you want to display complaints");
		String year=sc.next();
		fetch.complaintsBasedOnYear(year);
	break;
	case 2:
		System.out.println("Enter company name for which you want to display complaints");
	    String u_company=sc.next(); 
		fetch.complaintsBasedOnCompany(u_company);
	break;
	case 3: 
		System.out.println("Enter complaint ID for which you want to display complaints ");
		String id=sc.next();
		fetch.complaintsBasedOnComplaintID(id);
	break;
	case 4: 
		System.out.println("Enter complaint ID");
		String compid=sc.next();
		fetch.NoOfDaysTOCloseComplaint(compid);
	break;
	case 5: 
		System.out.println("Enter complaint ID");
		String uid=sc.next();
		fetch.complaintsClosed(uid);
	break;
	case 6: 
		System.out.println("Enter complaint ID");
		String timely_compid=sc.next();
		fetch.complaintsReceivingTimelyResponse(timely_compid);
	break;
	default: System.out.println("Sorry ! request can't be processed");
	
	}
}
}
