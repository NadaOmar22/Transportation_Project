package com.company;

public class IUser {
    protected String userName ;
    
    protected String password ;

    public boolean verified;

    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
}