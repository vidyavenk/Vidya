package com.jsp.log4j;

import java.lang.System.Logger;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.net.SMTPAppender;
import org.apache.log4j.xml.DOMConfigurator;

public class ConsoleaPPEMDER 
{
	static org.apache.log4j.Logger loger = org.apache.log4j.Logger.getLogger(ConsoleaPPEMDER.class);
 
public static void main(String[] args) 

{
	Date d = new Date();
	System.out.println(d.toString().replace("_:", "").replace(" ", "_"));
	System.setProperty("current.date", d.toString().replace("_:", "").replace(" ", "_"));
	//System.setProperty("current.date", );
	//PropertyConfigurator.configure("");
	loger.debug("this is for debug"); 
loger.info("conataing ");
loger.error("error");





}
}
