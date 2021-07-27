package bankComplaints;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import bankComplaints.Complaint;
import CSV

public class ReadCSVData {

	public static void main(String[] args) throws IOException, ParseException {
		Reader reader = new FileReader("D:\\CSVData\\complaints.csv");
		List<String[]> data = readCSV(reader);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		List<Complaint> complaints = new ArrayList<Complaint>();
		for(String[] lines:data) {
			Complaint complaint = new Complaint();
			LocalDate dateRecieved = LocalDate.parse(lines[0], formatter);
			LocalDate dateSent = LocalDate.parse(lines[0], formatter);
			complaint.setDateRecieved(dateRecieved);
			complaint.setProduct(lines[1]);
			complaint.setSubProduct(lines[2]);
			complaint.setIssue(lines[3]);
			complaint.setSubIssue(lines[4]);
			complaint.setCompany(lines[5]);
			complaint.setState(lines[6]);
			complaint.setZipCode(lines[7]);
			complaint.setSubmittedVia(lines[8]);
			complaint.setDateSent(dateSent);
			complaint.setCompanyResponse(lines[10]);
			complaint.setTimely(lines[11]);
			complaint.setConsumerDisputed(lines[12]);
			complaint.setComplaintID(lines[13]);
			complaints.add(complaint);
		}
		System.out.println(complaints.get(0));
		
	}

	private static <CSVReader> List<String[]> readCSV(Reader reader) throws IOException, CsvException {
		CSVReader read = new CSVReaderBuilder(reader).withSkipLines(1).build();

		List<String[]> l = read.readAll();
		reader.close();
		read.close();
		return l;
	}

}
