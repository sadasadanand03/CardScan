package example.com.cardscan.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 29/6/17.
 */

public class Result {

    @SerializedName("EnqcustAccDtlResult")
    @Expose
    private EnqcustAccDtlResult enqcustAccDtlResult;

    public EnqcustAccDtlResult getEnqcustAccDtlResult() {
        return enqcustAccDtlResult;
    }

    public void setEnqcustAccDtlResult(EnqcustAccDtlResult enqcustAccDtlResult) {
        this.enqcustAccDtlResult = enqcustAccDtlResult;
    }
}
