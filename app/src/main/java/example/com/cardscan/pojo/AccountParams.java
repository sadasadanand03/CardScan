package example.com.cardscan.pojo;

/**
 * Created by root on 30/6/17.
 */

public class AccountParams {
    private String accountid;
    private String comp_code;
    private String main_code;

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getComp_code() {
        return comp_code;
    }

    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

    public String getMain_code() {
        return main_code;
    }

    public void setMain_code(String main_code) {
        this.main_code = main_code;
    }
}
