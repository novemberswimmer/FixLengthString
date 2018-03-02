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
        msg.setFirstName("Annie");
        msg.setLastName("Lucas");
        System.out.println( msg.messageToString() + ":");
    }
}
