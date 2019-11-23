package com.example.jucia_semana6.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String usuario;
    public String contrasenia;

    public static  Boolean passwordisValid(String user,
                                           String password){
        for (User i : getUser() ) {
            if (i.usuario.equals(user))
            {
                if (i.contrasenia.equals(password)){
                    return true;
                }

            }
        }
        return false;

    }

    public static ArrayList<User> getUser(){
        ArrayList<User> list = new ArrayList<User>();
        User o = new User();
        o.usuario = "elmer";
        o.contrasenia = "123456";
        list.add(o);

        User t = new User();
        t.usuario = "jucia";
        t.contrasenia = "elmer";
        list.add(t);
        return list;
    }

}
