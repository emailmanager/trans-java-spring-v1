package com.emailmanager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.mail.MailParseException;
import org.springframework.mail.SimpleMailMessage;

import com.google.gson.GsonBuilder;
import com.emailmanager.EmailmanagerMailSender.SimpleMailMessageAdapter;

public class SimpleMailMessageAdapterTest {

    private static GsonBuilder gsonBuilder = new GsonBuilder();

    static {
    	gsonBuilder.disableHtmlEscaping();
        gsonBuilder.registerTypeAdapter(SimpleMailMessage.class, new SimpleMailMessageAdapter());
        gsonBuilder.registerTypeAdapter(EmailmanagerMessage.class, new SimpleMailMessageAdapter());
    }



	@Test
	public void testSerializeSimpleMailMessage() {
		SimpleMailMessage m = new SimpleMailMessage();
		m.setSubject("Test");
		m.setText("This is a test email");
		m.setFrom("nicolas@gmail.com");
		m.setTo(new String[]{"you@gmail.com", "him@gmail.com"});
		assertEquals("{\"From\":\"nicolas@gmail.com\",\"To\":\"you@gmail.com,him@gmail.com\",\"Subject\":\"Test\",\"TextBody\":\"This is a test email\"}",
				gsonBuilder.create().toJson(m));
	}

	@Test(expected=MailParseException.class)
	public void testMissingParam() {
		SimpleMailMessage m = new SimpleMailMessage();
		m.setSubject("Test");
		m.setText("This is a test email");
		m.setFrom("nicolas@gmail.com");
		gsonBuilder.create().toJson(m);
	}

	@Test
	public void testSerializeEmailManagerMessage() {
		EmailmanagerMessage m = new EmailmanagerMessage();
		m.setSubject("Test");
		m.setText("This is a test email");
		m.setFrom("nicolas@gmail.com");
		m.setTag("test");
		m.setTo(new String[]{"<Your name here> you@gmail.com", "him@gmail.com"});
		assertEquals("{\"From\":\"nicolas@gmail.com\",\"To\":\"<Your name here> you@gmail.com,him@gmail.com\",\"Subject\":\"Test\",\"Tag\":\"test\",\"TextBody\":\"This is a test email\"}",
				gsonBuilder.create().toJson(m));
	}
	
}
