package com.appfinder.players;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;


@Entity
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerId;
    private String name;
    private String password;
    private int credentials;
    private String email;
    private Timestamp creationDate;

    public Players(String name, String password, int credentials, String email, Timestamp creationDate) {
        this.name = name;
        this.password = password;
        this.credentials = credentials;
        this.email = email;
        this.creationDate = creationDate;
    }

    public Players(){
        super();
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }
}