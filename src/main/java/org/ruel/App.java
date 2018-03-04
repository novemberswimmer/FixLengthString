package org.ruel;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageBlank messageBlank = (MessageBlank) context.getBean("messageBlank");

        Message msg = new Message(messageBlank.createBlankMessage());

        System.out.println("#" + msg.getFixLengthString() + "#");
        msg.setFirstName("Test");
        msg.setLastName("Lastname");
        msg.setGender("M");
        System.out.println("#"+ msg.messageToString() + "#");
    }
}
