package com.mangium;

import javax.faces.bean.RequestScoped;
import java.util.*;

@javax.faces.bean.ManagedBean
@RequestScoped
public class EducationLoanBean {

    private ArrayList loan;

    public ArrayList getLoan() {

        loan = new ArrayList();

        EducationLoan e1 = new EducationLoan();
        e1.setSno("1");
        e1.setBankname("Allahabad Bank");
        e1.setMaxlimitindia("6 Lakhs");
        e1.setMaxlimititabroad("20 Lakhs");
        e1.setRate("6%");
        e1.setRepayment("Upto 10 years");

        loan.add(e1);

        EducationLoan e2 = new EducationLoan();
        e2.setSno("2");
        e2.setBankname("Bank of Baroda");
        e2.setMaxlimitindia("10 Lakhs");
        e2.setMaxlimititabroad("30 Lakhs");
        e2.setRate("7%");
        e2.setRepayment("Upto 6 years");

        loan.add(e2);

        EducationLoan e3 = new EducationLoan();
        e3.setSno("3");
        e3.setBankname("Canara Bank");
        e3.setMaxlimitindia("7 Lakhs");
        e3.setMaxlimititabroad("22 Lakhs");
        e3.setRate("6.5%");
        e3.setRepayment("Upto 8 years");

        loan.add(e3);

        EducationLoan e4 = new EducationLoan();
        e4.setSno("4");
        e4.setBankname("Indian Overseas Bank");
        e4.setMaxlimitindia("8 Lakhs");
        e4.setMaxlimititabroad("19 Lakhs");
        e4.setRate("7.2%");
        e4.setRepayment("Upto 11 years");

        loan.add(e4);

        EducationLoan e5 = new EducationLoan();
        e5.setSno("5");
        e5.setBankname("HDFC Bank");
        e5.setMaxlimitindia("7.5 Lakhs");
        e5.setMaxlimititabroad("15 Lakhs");
        e5.setRate("0%");
        e5.setRepayment("Upto 12 years");

        loan.add(e5);

        EducationLoan e6 = new EducationLoan();
        e6.setSno("6");
        e6.setBankname("Indian Bank");
        e6.setMaxlimitindia("8 Lakhs");
        e6.setMaxlimititabroad("22 Lakhs");
        e6.setRate("10.2%");
        e6.setRepayment("Upto 10 years");

        loan.add(e6);

        EducationLoan e7 = new EducationLoan();
        e7.setSno("7");
        e7.setBankname("Punjab National Bank");
        e7.setMaxlimitindia("7 Lakhs");
        e7.setMaxlimititabroad("18 Lakhs");
        e7.setRate("12.5%");
        e7.setRepayment("Upto 11 years");

        loan.add(e7);

        EducationLoan e8 = new EducationLoan();
        e8.setSno("8");
        e8.setBankname("Union Bank of India");
        e8.setMaxlimitindia("6.5 Lakhs");
        e8.setMaxlimititabroad("16 Lakhs");
        e8.setRate("11.5%");
        e8.setRepayment("Upto 8 years");

        loan.add(e8);

        EducationLoan e9 = new EducationLoan();
        e9.setSno("9");
        e9.setBankname("HSBC Bank");
        e9.setMaxlimitindia("8 Lakhs");
        e9.setMaxlimititabroad("22 Lakhs");
        e9.setRate("0%");
        e9.setRepayment("Upto 6 years");

        loan.add(e9);

        EducationLoan e10 = new EducationLoan();
        e10.setSno("10");
        e10.setBankname("State Bank of India");
        e10.setMaxlimitindia("5 Lakhs");
        e10.setMaxlimititabroad("14 Lakhs");
        e10.setRate("5%");
        e10.setRepayment("Upto 11 years");

        loan.add(e10);
        
        return loan;
    }

}
