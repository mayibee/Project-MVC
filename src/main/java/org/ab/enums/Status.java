package org.ab.enums;


public enum Status {
    OPEN("Open"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"), SIT_TEST("SIT Testing"), COMPLETED("Completed");
    private final String value;
    private Status(String value){
        this.value=value;
    }
    public String getValue(){ return value; }
}
