package example.com.cardscan.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 30/6/17.
 */

public class AccountData {
    @SerializedName("AgreementTotalAmt")
    @Expose
    private String agreementTotalAmt;
    @SerializedName("DueInstallments")
    @Expose
    private String dueInstallments;
    @SerializedName("InstallEndDt")
    @Expose
    private String installEndDt;
    @SerializedName("InstallmentAmt")
    @Expose
    private String installmentAmt;
    @SerializedName("InstallmentDueDt")
    @Expose
    private String installmentDueDt;
    @SerializedName("TotInstallments")
    @Expose
    private String totInstallments;
    @SerializedName("acctno")
    @Expose
    private String acctno;
    @SerializedName("arrears")
    @Expose
    private String arrears;
    @SerializedName("outstandingAmt")
    @Expose
    private String outstandingAmt;

    public String getAgreementTotalAmt() {
        return agreementTotalAmt;
    }

    public void setAgreementTotalAmt(String agreementTotalAmt) {
        this.agreementTotalAmt = agreementTotalAmt;
    }

    public String getDueInstallments() {
        return dueInstallments;
    }

    public void setDueInstallments(String dueInstallments) {
        this.dueInstallments = dueInstallments;
    }

    public String getInstallEndDt() {
        return installEndDt;
    }

    public void setInstallEndDt(String installEndDt) {
        this.installEndDt = installEndDt;
    }

    public String getInstallmentAmt() {
        return installmentAmt;
    }

    public void setInstallmentAmt(String installmentAmt) {
        this.installmentAmt = installmentAmt;
    }

    public String getInstallmentDueDt() {
        return installmentDueDt;
    }

    public void setInstallmentDueDt(String installmentDueDt) {
        this.installmentDueDt = installmentDueDt;
    }

    public String getTotInstallments() {
        return totInstallments;
    }

    public void setTotInstallments(String totInstallments) {
        this.totInstallments = totInstallments;
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    public String getArrears() {
        return arrears;
    }

    public void setArrears(String arrears) {
        this.arrears = arrears;
    }

    public String getOutstandingAmt() {
        return outstandingAmt;
    }

    public void setOutstandingAmt(String outstandingAmt) {
        this.outstandingAmt = outstandingAmt;
    }

    @Override
    public String toString() {
        return "AccountData{" +
                "agreementTotalAmt='" + agreementTotalAmt + '\'' +
                ", dueInstallments='" + dueInstallments + '\'' +
                ", installEndDt='" + installEndDt + '\'' +
                ", installmentAmt='" + installmentAmt + '\'' +
                ", installmentDueDt='" + installmentDueDt + '\'' +
                ", totInstallments='" + totInstallments + '\'' +
                ", acctno='" + acctno + '\'' +
                ", arrears='" + arrears + '\'' +
                ", outstandingAmt='" + outstandingAmt + '\'' +
                '}';
    }
}
