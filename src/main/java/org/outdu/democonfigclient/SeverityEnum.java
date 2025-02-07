package org.outdu.democonfigclient;

public enum SeverityEnum {

    Four(4), Three(3), Two(2), One(1);

    private int value;
    SeverityEnum(int value) {
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }
}
