package org.ruel;

import java.math.BigDecimal;

public class Message {
    private MessageField firstName = MessageField.createStringField("Firtname", 1, 20);
    private MessageField lastName =  MessageField.createStringField( "Lastname", 1, 20);
    private MessageField age =  MessageField.createNumberField(new BigDecimal(12), 1, 15);

    public void setFirstName(String firstName) {
        this.firstName.setValue(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.setValue(lastName);
    }

    public String messageToString(){
        return firstName.paddedValue() +
                lastName.paddedValue() +
                age.paddedValue();
    }
}
