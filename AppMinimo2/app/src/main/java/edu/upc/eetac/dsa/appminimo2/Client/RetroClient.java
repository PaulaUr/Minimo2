package edu.upc.eetac.dsa.appminimo2.Client;

import java.io.IOException;

import edu.upc.eetac.dsa.appminimo2.Entity.GlobalData;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetroClient {

    public static final String BASE_URL = "https://api.github.com/";
    public static  final  String BASE_URL2 = "https://avatars3.githubusercontent.com/u/";


    //Get Retrofit Instance
    private static Retrofit getRetrofitInstance(){

            return new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

    }
    //Get API service
    public static ClientRetrofit getClientRetrofit(){

        return getRetrofitInstance().create(ClientRetrofit.class);
    }


}
