package com.appfinder.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;


@Entity
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int player_id;
    private String name;
    private String password;
    private int credentials;
    private String email;

    private Timestamp creation_date;

    public Players(int player_id, int credentials, String name, String password, String email, Timestamp creation_date) {
        super();
        this.player_id = player_id;
        this.name = name;
        this.password = password;
        this.credentials = credentials;
        this.email = email;
        this.creation_date = creation_date;
    }

    public Players(){
        super();
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

    public int getPlayer_email() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Timestamp creation_date) {
        this.creation_date = creation_date;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
