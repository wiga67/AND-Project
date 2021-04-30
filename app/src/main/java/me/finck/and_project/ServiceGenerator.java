package me.finck.and_project;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder().baseUrl("https://www.googleapis.com/books/v1/").addConverterFactory(GsonConverterFactory.create());
    private static Retrofit retrofit =retrofitBuilder.build();
    private static BookApi bookApi = retrofit.create(BookApi.class);
    public static BookApi getBookApi(){
    return bookApi;
    }
}
