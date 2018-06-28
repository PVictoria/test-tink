package com.springboot.rest;


public class Contact {



    private Long contactId;

    public Contact(){}
    public Contact(Long contactId){
        this.contactId = contactId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId (Long contactId) {
        this.contactId = contactId;
    }

    @Override
    public String toString(){
        return  contactId.toString();
    }
}
