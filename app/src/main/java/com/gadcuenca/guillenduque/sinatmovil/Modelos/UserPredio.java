package com.gadcuenca.guillenduque.sinatmovil.Modelos;
import com.gadcuenca.guillenduque.sinatmovil.Api.Predio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Url;

/**
 * Created by marioguillen on 23/10/17.
 */

public interface UserPredio {
    @GET
    Call<List<Predio>> getPredio (@Url String url, @Header("Authorization") String authHeader);
//    Call<List<Predio>> getPredio (@Url String url);
}
