package edu.upc.eetac.dsa.appminimo2.Entity;

import android.app.Application;
import android.content.res.Configuration;

import java.util.List;

/**
 * Created by pauli on 01/06/2017.
 */

public class GlobalData extends Application{

    private String token;
    private String username;
    private  Integer following;
    private  Integer public_repos;
    private List<Followers> followersList;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String tokenRec) {
        this.token = tokenRec;
    }


    public String getFollowing() {
        return String.valueOf(following);
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public String getPublic_repos() {
        return String.valueOf(public_repos);
    }

    public void setPublic_repos(Integer public_repos) {
        this.public_repos = public_repos;
    }

    public List<Followers> getFollowersList() {
        return followersList;
    }

    public void setFollowersList(List<Followers> followersList) {
        this.followersList = followersList;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
