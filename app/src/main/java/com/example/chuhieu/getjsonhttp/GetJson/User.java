package com.example.chuhieu.getjsonhttp.GetJson;

public class User {
    public String login;
    public int id;
    public String avatar_url;
    public String type;

    public User(String login, int id, String avatar_url, String type) {
        this.login = login;
        this.id = id;
        this.avatar_url = avatar_url;
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}