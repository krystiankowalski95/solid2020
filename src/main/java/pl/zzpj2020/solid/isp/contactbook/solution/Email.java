package pl.zzpj2020.solid.isp.contactbook.solution;

public interface Email {
    void sendMessage(String subject, String body);
    void sendEmail(String emailAddress, String subject, String body);
}
