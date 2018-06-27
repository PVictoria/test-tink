package com.springboot.rest;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
//import java.util.Date;

@Entity
public class Application {
    @Id
//    @GeneratedValue
    private Long id;
    private Long contactId;
    private Long applicationId;
    private Date dtCreated;
    private String productName;

    /**
     * get  и set методы используются для вывда полей в json формате
     * поле id оставляем закрытым
     */

    protected Long getId() {
        return id;
    }
    protected void setId(Long id) {
        this.id = id;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }



    public Long getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
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
    //    @Override
//    public String toString (){
//        return "Appliction{ id: " + id + " }";
//    }




}
