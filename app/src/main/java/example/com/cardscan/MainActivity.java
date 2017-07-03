package example.com.cardscan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import example.com.cardscan.pojo.AccountData;
import example.com.cardscan.pojo.AccountParams;
import example.com.cardscan.pojo.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AccountParams accountParams = new AccountParams();
        accountParams.setComp_code("55");
        accountParams.setMain_code("55");
        accountParams.setAccountid("093000024807");

        new Retrofit.Builder().baseUrl(AccountService.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(AccountService.class).getAccountDetails(accountParams).enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                if(response.isSuccessful())
                {
                    List<AccountData> list = response.body().getEnqcustAccDtlResult().getAccountDataList();
                   // Toast.makeText(MainActivity.this, "this is call from onResponse  "+list.size(), Toast.LENGTH_SHORT).show();
                    for(AccountData ac:list){
                        Toast.makeText(MainActivity.this,ac.toString(), Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Data not found.", Toast.LENGTH_SHORT).show();
                }


            }
            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });

    }


}

