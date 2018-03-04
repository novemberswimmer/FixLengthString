package org.ruel;

import java.math.BigDecimal;

public class Message {

    private StringBuilder fixLengthString;


    private MessageField firstName = MessageField.createStringField("", 11, 30);
    private MessageField lastName =  MessageField.createStringField( "", 31, 50);
    private MessageField gender = MessageField.createStringField("", 70,1);
    private MessageField age =  MessageField.createNumberField(new BigDecimal(0), 136, 15);


    public Message(String messageBlank){
        fixLengthString = new StringBuilder(messageBlank);
    }

    public String getFixLengthString() {
        return fixLengthString.toString();
    }

    public void setFirstName(String firstName) {
        this.firstName.setValue(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.setValue(lastName);
    }

    public void setGender(String gender){
        this.gender.setValue(gender);
    }

    public String messageToString(){
        placeIntoFixLengthString(this.firstName);
        placeIntoFixLengthString(this.lastName);
        placeIntoFixLengthString(this.age);
        placeIntoFixLengthString(this.gender);
        return fixLengthString.toString();
    }

    private StringBuilder placeIntoFixLengthString(MessageField messageField) {
        return fixLengthString
                .replace(messageField.getOffset()-1, messageField.getOffset()-1 + messageField.getLength(),
                        messageField.paddedValue().toString());
    }
}
