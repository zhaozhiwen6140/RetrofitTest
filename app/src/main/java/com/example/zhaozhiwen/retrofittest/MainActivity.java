package com.example.zhaozhiwen.retrofittest;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL="https://api.themoviedb.org";//指定Service的域名
    private TextView textView;
    private MovieData movieData;
    private int statusCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView=(TextView)findViewById(R.id.testView);

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestAPI service=retrofit.create(TestAPI.class);
        Call<MovieData> call=service.getDApplicationData("1d1cd40875197d9e76c870167c8aa3c9");//传递需要的参数
        call.enqueue(new Callback<MovieData>() {
            @Override
            public void onResponse(Response<MovieData> response, Retrofit retrofit) {
                if (response != null) {
                    statusCode = response.code();
                    movieData = response.body();//通过这句获得解析的数据结果，然后将拿到的数据赋值给MovieData的对象。
                    textView.setText(movieData.getOverview());//通过对象获得相应的数据，进行显示。

                }else{
                    Toast.makeText(MainActivity.this,"没有数据",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("errorMessage",t.getMessage());
                Toast.makeText(MainActivity.this,"请求未成功！",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
