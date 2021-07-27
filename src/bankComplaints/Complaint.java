package bankComplaints;

import java.time.LocalDate;

public class Complaint {
 private LocalDate dateRecieved,dateSent;
 private String product,consumerDisputed,timely,companyResponse,state,issue;
 private String subProduct,company,zipCode,submittedVia,subIssue;
 private String complaintID;

 public Complaint(){
 }
 
public Complaint(LocalDate dateRecieved, LocalDate dateSent, String product, String consumerDisputed, String timely,
		String companyResponse, String state, String subProduct, String company, String submittedVia, String zipCode,
		String complaintID, String issue,String subIssue) {
	super();
	this.dateRecieved = dateRecieved;
	this.dateSent = dateSent;
	this.product = product;
	this.consumerDisputed = consumerDisputed;
	this.timely = timely;
	this.companyResponse = companyResponse;
	this.state = state;
	this.subProduct = subProduct;
	this.company = company;
	this.submittedVia = submittedVia;
	this.zipCode = zipCode;
	this.complaintID = complaintID;
	this.issue = issue;
	this.subIssue = subIssue;
}
public LocalDate getDateRecieved() {
	return dateRecieved;
}
public String getIssue() {
	return issue;
}

public String getSubIssue() {
	return subIssue;
}

public void setSubIssue(String subIssue) {
	this.subIssue = subIssue;
}

public void setIssue(String issue) {
	this.issue = issue;
}
public void setDateRecieved(LocalDate dateRecieved) {
	this.dateRecieved = dateRecieved;
}
public LocalDate getDateSent() {
	return dateSent;
}
public void setDateSent(LocalDate dateSent) {
	this.dateSent = dateSent;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getConsumerDisputed() {
	return consumerDisputed;
}
public void setConsumerDisputed(String consumerDisputed) {
	this.consumerDisputed = consumerDisputed;
}
public String getTimely() {
	return timely;
}
public void setTimely(String timely) {
	this.timely = timely;
}
public String getCompanyResponse() {
	return companyResponse;
}
public void setCompanyResponse(String companyResponse) {
	this.companyResponse = companyResponse;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getSubProduct() {
	return subProduct;
}
public void setSubProduct(String subProduct) {
	this.subProduct = subProduct;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getSubmittedVia() {
	return submittedVia;
}
public void setSubmittedVia(String submittedVia) {
	this.submittedVia = submittedVia;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getComplaintID() {
	return complaintID;
}
public void setComplaintID(String complaintID) {
	this.complaintID = complaintID;
}

@Override
public String toString() {
	return "Complaint [dateRecieved=" + dateRecieved + ", dateSent=" + dateSent + ", product=" + product
			+ ", consumerDisputed=" + consumerDisputed + ", timely=" + timely + ", companyResponse=" + companyResponse
			+ ", state=" + state + ", issue=" + issue + ", subProduct=" + subProduct + ", company=" + company
			+ ", zipCode=" + zipCode + ", submittedVia=" + submittedVia + ", subIssue=" + subIssue + ", complaintID="
			+ complaintID + "]";
}
 
}
