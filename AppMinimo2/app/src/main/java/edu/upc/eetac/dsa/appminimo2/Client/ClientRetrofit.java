package edu.upc.eetac.dsa.appminimo2.Client;

import java.util.List;

import edu.upc.eetac.dsa.appminimo2.Entity.Followers;
import edu.upc.eetac.dsa.appminimo2.Entity.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by pauli on 01/06/2017.
 */

public interface ClientRetrofit {


    @GET("/users/{username}/followers")
    Call<List<Followers>> list_followers (@Path("username") String username);

    @GET("/{id}")
    Call<Followers> imageFollowers (@Path("id")Integer id);


   // @GET("/Users")
   // Call<List<Followers>> list_followers2 ();

    @GET("users/{username}")
    Call<User> usuarios (@Path("username") String username);
}
