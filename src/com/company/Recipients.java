package com.company;

public abstract  class Recipients {
    private String name;
    private String recipientType;
    private String email;

    public Recipients(String recipientType,String name,String email){
        this.recipientType=recipientType;
        this.name=name;
        this.email=email;
    }
}
