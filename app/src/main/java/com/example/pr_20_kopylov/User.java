package com.example.pr_20_kopylov;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.ktx.Firebase;


public class User {
    public String  name, familia, email, male, age, height;
    public String id;
    public User(){

    }

    public User(String id,String name, String familia, String email, String male, String age, String height)
    {
        this.id = id;
        this.name = name;
        this.familia = familia;
        this.email = email;
        this.male = male;
        this.age = age;
        this.height= height;
    }
}
