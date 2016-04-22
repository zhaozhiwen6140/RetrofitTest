package com.example.zhaozhiwen.retrofittest;


import android.graphics.Movie;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by zhaozhiwen on 2016/4/21.
 */
public interface TestAPI {
      /*
      数据用的是themovie.db中的数据
       */
     @GET("/3/movie/550")
     Call<MovieData> getDApplicationData(
             @Query("api_key")String api_key);
}
