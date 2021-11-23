package com.company;

import java.util.ArrayList;

public class admin extends IUser {
    ISaving saving = new arraySaving();

    public void suspend(IUser user) {
        for (IUser iuser : saving.retrieveUsers()) {
            if (iuser.equals(user)) {
                if(iuser instanceof User) ((User)iuser).setVerified(false);
                if(iuser instanceof Driver) ((Driver)iuser).setVerified(false);
                saving.retrievePended().add(user);
                saving.retrieveUsers().remove(user);
            }
        }
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return super.getPassword();
    }

    @Override
    public String getUserName() {
        // TODO Auto-generated method stub
        return super.getUserName();
    }

    @Override
    public void setPassword(String password) {
        // TODO Auto-generated method stub
        super.setPassword(password);
    }

    @Override
    public void setUserName(String userName) {
        // TODO Auto-generated method stub
        super.setUserName(userName);
    }

    @Override
    public String toString() {
        return "admin [name=" + this.userName + "pass"+ this.password+"]";
    }

    public void verify(IUser driver) {
        for (IUser itdriver : saving.retrievePended()) {
            System.out.println( "in loop"+itdriver.toString());
            if (driver.equals(itdriver) && itdriver instanceof Driver) {
                ((Driver) driver).setVerified(true);
                System.out.println( "in if");
                saving.retrievePended().remove(driver);
                saving.saveUser(driver);
                break;
            }
            
        }
    }

    

    public ArrayList<IUser> listPendingRegistration() {
        return saving.retrievePended();
    }

    public void loginAdmin(IUser iuser) {
        IUser result;
        result = saving.searchAdmin(iuser.getUserName(), iuser.getPassword());

        if (result == null) {
            System.out.println("You are not an admin!");
        } else {
            System.out.println("You logged in successfully.");
        }
    }


}