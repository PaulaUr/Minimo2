package edu.upc.eetac.dsa.appminimo2.Entity;

/**
 * Created by pauli on 01/06/2017.
 */

public class User {

    private String login;
    private Integer repos;
    private Integer followers;
    private Integer following;
    private Integer public_repos;
    public User() {
    }

    public User(String login, Integer repos, Integer followers, Integer following, Integer public_repos) {
        this.login = login;
        this.repos = repos;
        this.followers = followers;
        this.following = following;
        this.public_repos = public_repos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getRepos() {
        return repos;
    }

    public void setRepos(Integer repos) {
        this.repos = repos;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public Integer getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(Integer public_repos) {
        this.public_repos = public_repos;
    }
}
