package org.ruel;

import java.math.BigDecimal;

public class Message {

    private StringBuilder fixLengthString;

    public Message(){
        fixLengthString = new StringBuilder(String.format("%100s"," "));
    }
    private MessageField firstName = MessageField.createStringField("Firtname", 10, 20);
    private MessageField lastName =  MessageField.createStringField( "Lastname", 50, 20);
    private MessageField age =  MessageField.createNumberField(new BigDecimal(12), 85, 15);

    public String getFixLengthString() {
        return fixLengthString.toString();
    }

    public void setFirstName(String firstName) {
        this.firstName.setValue(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.setValue(lastName);
    }

    public String messageToString(){
        placeIntoFixLengthString(this.firstName);
        placeIntoFixLengthString(this.lastName);
        placeIntoFixLengthString(this.age);
        return fixLengthString.toString();
    }

    private StringBuilder placeIntoFixLengthString(MessageField messageField) {
        return fixLengthString
                .replace(messageField.getOffset()-1, messageField.getOffset()-1 + messageField.getLength(),
                        messageField.paddedValue().toString());
    }
}
