package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private int value;
    private Date dateFrom;
    private Date dateTo;

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
