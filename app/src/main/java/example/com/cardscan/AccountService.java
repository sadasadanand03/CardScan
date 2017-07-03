package example.com.cardscan;

import example.com.cardscan.pojo.AccountParams;
import example.com.cardscan.pojo.Result;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by root on 30/6/17.
 */

public interface AccountService {

    public static final String BASE_URL="http://121.241.54.136:8888/retailrestfulservices/enquiry.svc/";

    @POST("EnqcustAccDtl")
    Call<Result> getAccountDetails(@Body AccountParams accountParams);
}
