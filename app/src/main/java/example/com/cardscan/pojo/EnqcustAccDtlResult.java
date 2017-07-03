package example.com.cardscan.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by root on 29/6/17.
 */

public class EnqcustAccDtlResult {

    @SerializedName("accDtllist")
    private List<AccountData> accountDataList;


    public List<AccountData> getAccountDataList() {
        return accountDataList;
    }

    public void setAccountDataList(List<AccountData> accountDataList) {
        this.accountDataList = accountDataList;
    }

    @Override
    public String toString() {
        return "EnqcustAccDtlResult{" +
                "accountDataList=" + accountDataList +
                '}';
    }
}
