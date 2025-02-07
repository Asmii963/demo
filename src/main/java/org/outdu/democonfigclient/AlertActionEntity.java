package org.outdu.democonfigclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "alertActionEntity")
@NoArgsConstructor
@AllArgsConstructor
public class AlertActionEntity {

    private String action;
    private Date actionTime;
    private int actionByUserId;
    private String actionByUserName;

//    public AlertActionEntity(String action, Date actionTime, int actionByUserId, String actionByUserName) {
//        this.action = action;
//        this.actionTime = actionTime;
//        this.actionByUserId = actionByUserId;
//        this.actionByUserName = actionByUserName;
//    }


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public String getActionByUserName() {
        return actionByUserName;
    }

    public void setActionByUserName(String actionByUserName) {
        this.actionByUserName = actionByUserName;

    }

    public int getActionByUserId() {
        return actionByUserId;
    }

    public void setActionByUserId(int actionByUserId) {
        this.actionByUserId = actionByUserId;
    }


}
