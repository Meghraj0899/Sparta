package bankComplaints;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class DataRead {
HashMap <String, ComplaintDetails> bankCompleteDetails = new HashMap<>();
public void fileLoader() {

// ArrayList<String> objcompdetOfBanks=new ArrayList<>();
 String path="D:\\CSVData\\complaints.csv";
 String line="";
 
 try {
	BufferedReader bf=new BufferedReader(new FileReader(path));
	while ((line=bf.readLine())!=null)
	{   
		
		//String[] elements=line.split(",(?=(?:[^\"]\"[^\"]\")[^\"]$)", -1);
		String[] elements=line.split(",");
		ComplaintDetails comp=new ComplaintDetails();
		comp.dateReceived=elements[0];
		comp.product=elements[1];
		comp.subProduct=elements[2];
		comp.issue=elements[3];
		comp.subIssue=elements[4];
		comp.company=elements[5];
		comp.state=elements[6];
		comp.ZIPcode=elements[7];
		comp.submittedVia=elements[8];
		comp.dateSentToCompany=elements[9];
		comp.companyResponseToConsumer=elements[10];
		comp.timelyResponse=elements[11];
		comp.consumerDisputed=elements[12];
		comp.consumerDisputed=elements[12];
		
		bankCompleteDetails.put(elements[13],comp); 
	}
	bf.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
}

HashMap<String,ComplaintDetails> GetMapBankobjcompdet(){
	
	return bankCompleteDetails;
	
}
}