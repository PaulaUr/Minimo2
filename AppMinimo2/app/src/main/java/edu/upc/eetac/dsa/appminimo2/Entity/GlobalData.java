package edu.upc.eetac.dsa.appminimo2.Entity;

import android.app.Application;
import android.content.res.Configuration;

import java.util.List;

/**
 * Created by pauli on 01/06/2017.
 */

public class GlobalData extends Application{

    private String username;
    private String avatar_url;
    private  Integer following;
    private  Integer public_repos;
    private List<Followers> followersList;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
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
