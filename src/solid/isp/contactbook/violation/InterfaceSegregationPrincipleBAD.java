package pl.zzpj2020.solid.isp.contactbook.violation;

class InterfaceSegregationPrincipleBAD {
	
	public static void main(String[] args) {
		
		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");		
		contact.sendEmail("Pamela","Hola");
		contact.makeCall();
	}
}


