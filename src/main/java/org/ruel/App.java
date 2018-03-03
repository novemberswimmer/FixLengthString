package org.ruel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Message msg = new Message();
        System.out.println("#" + msg.getFixLengthString() + "#");
        msg.setFirstName("Test");
        msg.setLastName("Lastname");
        System.out.println("#"+ msg.messageToString() + "#");
    }
}
