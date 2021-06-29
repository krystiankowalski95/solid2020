package pl.zzpj2020.solid.isp.contactbook.violation;

class Contact implements Dialler, Emailer {
	private String name;
	private String address;
	private String emailAddress;
	private String telephone;
	
	public Contact(String name, String address, String emailAddress,
			String telephone) {
		super();
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
		this.telephone = telephone;
	}
	public String getName() {	return name; }
	
	public void setName(String name) {	this.name = name; }
	
	public String getAddress() {	return address; }
	
	public void setAddress(String address) {  this.address = address; }
	
	public String getEmailAddress() {   return emailAddress; }
	
	public void setEmailAddress(String emailAddress) {	this.emailAddress = emailAddress; }
	
	public void setTelephone(String telephone) { 	this.telephone = telephone; }	
	
	public void makeCall() {
    	// call using String telephone
    }

	private void sendEmail( String subject, String body) {
		// TODO Auto-generated method stub
		
	}
}








