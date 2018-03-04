package org.ruel;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageBlank  implements InitializingBean {

    private static final Integer FULL_MESSAGE_LENGTH = 150;


    @Value("${application.id}")
    private  String applicationIdProp;
    @Value("${service.name}")
    private  String serviceNameProp;


    private  String  applicationId;
    private  String serviceName;
    private  String field1;
    private  String field2;
    private  String field3;
    private  String field4;
    private  String field5;
    private  String field6;
    private  String field7;

    private String messageBlank;


    public  String createBlankMessage(){
        return messageBlank;
    }


    public void afterPropertiesSet() throws Exception {
        initializedMessageFields();

        StringBuilder builder = new StringBuilder();
        builder.append(serviceName)
                .append(applicationId)
                .append(field1)
                .append(field2)
                .append(field3)
                .append(field4)
                .append(field5)
                .append(field6)
                .append(field7);

        messageBlank = builder.toString();
    }

    private void initializedMessageFields() {
        serviceName = String.format("%-20s", serviceNameProp);
        applicationId = String.format("%-10s", applicationIdProp);
        field1 = String.format("%-10s"," ");
        field2 = String.format("%020d", 0);
        field3 = String.format("%-20s"," ");
        field4 = String.format("%020d", 0);
        field5 = String.format("%-20s"," ");
        field6 = String.format("%020d", 0);
        field7 = String.format("%-10s"," ");
    }


}
