package pl.zzpj2020.solid.isp.contactbook.solution;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
class Emailer implements Email {
	private Contact contact;

	public void sendMessage(String subject, String body) {
		
		String emailAddress = contact.getEmailAddress();
		sendEmail(emailAddress, subject, body);
	}
	public void sendEmail(String emailAddress, String subject, String body) {
		// TODO Auto-generated method stub
		
	}
}