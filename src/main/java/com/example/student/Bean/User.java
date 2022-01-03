package com.example.student.Bean;

public class User {
    private String iduser;
    private String account;
    private String password;

    public User(String iduser, String account, String password) {
        this.iduser = iduser;
        this.account = account;
        this.password = password;
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "iduser='" + iduser + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
