package org.ab.enums;

public enum Gender {
    FEMALE("Female"), MALE("Male"), NONBINARY("Non-Binary");
    private final String value;
    private Gender(String value){
        this.value=value;
    }
    public String getValue(){ return value; }
}
