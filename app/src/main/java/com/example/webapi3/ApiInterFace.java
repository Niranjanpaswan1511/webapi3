package com.example.webapi3;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterFace {
    @FormUrlEncoded
    @POST("/api/users")
    Call<User> getUserInformtion(@Field("name") String name,@Field("job") String job);


}
