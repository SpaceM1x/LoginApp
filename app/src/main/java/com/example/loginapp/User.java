package com.example.loginapp;

import android.widget.Toast;

public class User
{
    private String Login = "";
    private String Password = "";
    private static int UserCount=0;
    private boolean Logged = false;


    public User(){
        UserCount++;
        System.out.println("User created");
    }

    public User(String Login, String Password){
        UserCount++;
        this.Login=Login;
        this.Password=Password;
        System.out.println("User created");
    }


    public String logUserIn(String Login, String Password){
        StringBuilder output = new StringBuilder("");
        if (this.Login.equals(Login) ){
            output.append("Верный Логин");
        }
        else {
            output.append("Неверный Логин");
        }
        if (this.Password.equals(Password)){
            output.append(", Верный Пароль");

        }
        else{
            output.append(", Неверный Пароль");
        }
        return output.toString();
    };
    public boolean logged(String Login, String Password) {
        if (this.Login.equals(Login)&&this.Password.equals(Password)){
            return true;
        }
        else {
            return false;
        }
    };

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
