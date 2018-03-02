package org.ruel;

import java.math.BigDecimal;

public class MessageField {
    private String stringValue;
    private BigDecimal numberValue;
    private ValueType valueType;
    private Integer offset;
    private Integer length;


    private MessageField(ValueType valueType, String value, BigDecimal numberValue, Integer offset, Integer length){
        this.stringValue = value;
        this.numberValue = numberValue;
        this.valueType = valueType;
        this.offset = offset;
        this.length = length;
    }

    public static MessageField createStringField(String value, Integer offset, Integer length){
        return new MessageField(ValueType.CHARACTER, value, null, offset, length);
    }

    public static MessageField createNumberField(BigDecimal value, Integer offset, Integer length){
        return new MessageField(ValueType.NUMBER, null, value, offset, length);
    }

    public void setValue(Object value) {
        if (ValueType.CHARACTER.equals(valueType)){
            stringValue = (String) value;
        }else {
            numberValue= new BigDecimal(String.valueOf(numberValue));
        }
    }

    public String paddedValue(){
        if (ValueType.NUMBER.equals(this.valueType)){
            return String.format("%0" + this.length + "f", this.numberValue);
        }
        return String.format("%-" + this.length +"s", this.stringValue);
    }

    enum ValueType {
        CHARACTER,
        NUMBER;
    }
}
