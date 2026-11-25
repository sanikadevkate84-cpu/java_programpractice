package Encapsulation;

import java.util.Objects;

public class User {
    private String username;
    private int passwords;

    public void setUsername(String username) {
        this.username = username;

    }

    public void setPassword(int p) {
        this.passwords = p;

    }

    void validatePassword(int p) {
        System.out.println(passwords ==p);
    }

        public static void main (String[]args){
            User u = new User();
            u.setPassword(1234);
            u.setUsername("sanika");
            u.validatePassword(1234);

        }

    }





