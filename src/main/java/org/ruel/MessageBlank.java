package org.ruel;

public class MessageBlank {
    private static final Integer FULL_MESSAGE_LENGTH = 150;

    private static final String serviceName = "WS_SERVICE";
    private static final String field1 = String.format("%-20s"," ");
    private static final String field2 = String.format("%020d", 0);
    private static final String field3 = String.format("%-20s"," ");
    private static final String field4 = String.format("%020d", 0);
    private static final String field5 = String.format("%-20s"," ");
    private static final String field6 = String.format("%020d", 0);
    private static final String field7 = String.format("%-20s"," ");

    public static String createBlankMessage(){
        StringBuilder builder = new StringBuilder();
        builder.append(serviceName)
                .append(field1)
                .append(field2)
                .append(field3)
                .append(field4)
                .append(field5)
                .append(field6)
                .append(field7);

        return builder.toString();
    }
}
