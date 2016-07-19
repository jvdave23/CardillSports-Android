package com.cardillsports.vithushan.cardillsportsandroid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by vithushan on 7/18/16.
 */
public interface CardillSportsClient {
    @GET("/api/articles")
    Call<List<Article>> articles();
}
