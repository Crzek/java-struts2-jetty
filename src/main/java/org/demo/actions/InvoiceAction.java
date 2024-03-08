package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            // hay que ir regysterForm.jsp, en el campo(fielname="invoiceBean") mostra el errormessage
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if (invoiceBean.getValue() == 0) {
            addFieldError("invoiceBean.value", "importe es Obligatorio");
//        }
        }
    }
}
