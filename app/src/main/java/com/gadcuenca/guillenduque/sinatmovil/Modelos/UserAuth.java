package com.gadcuenca.guillenduque.sinatmovil.Modelos;

import com.gadcuenca.guillenduque.sinatmovil.Api.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by marioguillen on 28/8/17.
 */

public interface UserAuth {
    @GET("user_details")
    Call<User> getUser(@Header("Authorization") String authHeader);
}
