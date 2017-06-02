package edu.upc.eetac.dsa.appminimo2.Entity;



public class User {

    private String login;
    private Integer repos;
    private Integer followers;
    private Integer following;
    private Integer public_repos;
    private String avatar_url;

    public User() {
    }

    public User(String login, Integer repos, Integer followers, Integer following, Integer public_repos, String avatar_url) {
        this.login = login;
        this.repos = repos;
        this.followers = followers;
        this.following = following;
        this.public_repos = public_repos;
        this.avatar_url = avatar_url;
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

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
}
