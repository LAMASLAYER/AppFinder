package com.appfinder.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String player_oid;
    private int player_id;
    private String username;
    private String password;
    private int credentials;

    public Players(String player_oid, int player_id, int credentials, String name, String password) {
        super();
        this.player_oid = player_oid;
        this.player_id = player_id;
        this.username = name;
        this.password = password;
        this.credentials = credentials;
    }

    public Players(){
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String usrename) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredentials() {
        return credentials;
    }

    public void setCredentials(int credentials) {
        this.credentials = credentials;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_oid() {
        return player_oid;
    }

    public void setPlayer_oid(String player_oid) {
        this.player_oid = player_oid;
    }

}
