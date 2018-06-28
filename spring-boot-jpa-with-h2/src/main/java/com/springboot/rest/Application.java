package com.springboot.rest;

import java.sql.Date;



public class Application {

//    private Long id;

    private Long applicationId;
//    private Contact contact;
    private Long contactId;
    private Date dtCreated;
//    private Product product;
    private String productName;



    public Application (){};
    public Application ( Long contactId, Long applicationId, Date dtCreated, String productName){

        this.applicationId = applicationId;
//        this.contact = new Contact(contactId);
        this.contactId = contactId;
        this.dtCreated = dtCreated;
//        this.product= new Product(productName);
        this.productName = productName;

    }

    /**
     * get  и set методы используются для вывда полей в json формате
     * поле id оставляем закрытым
     */


    public Long getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getContactId() {
        return contactId;
    }
    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }
//    public Contact getContact() {
//        return contact;
//    }
//
//    public void setContact(Long contactId) {
//        this.contact.setContactId(contactId);
//    }
//    public void setContact(Contact contact) {
//        this.contact.setContactId(contact.getContactId());
//    }



    public Date getDtCreated(){
        return dtCreated;
    }
    public void setDtCreated(Date dtCreated) {
        this.dtCreated = dtCreated;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

//    public Product getProduct(){
//        return product;
//    }
//
//    public void setProduct(String productName){
//        this.product.setProductName(productName);
//
//    }
//
//    public void setProduct(Product product) {
//        this.product.setProductName(product.getProductName());
//    }






}
