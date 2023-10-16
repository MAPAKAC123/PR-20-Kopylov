package com.example.pr_20_kopylov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edName, edSName, edMail, edAge, edMale, edHeight;
    Button btnSave, btnRead;
    private DatabaseReference myDataBase;
    final String USER_KEY = "User";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave= findViewById(R.id.button);
        btnSave.setOnClickListener(this);

        btnRead= findViewById(R.id.button2);
        btnRead.setOnClickListener(this);

        edName=findViewById(R.id.editTextText);

        edSName=findViewById(R.id.editTextText2);

        edMail=findViewById(R.id.editTextText3);

        edAge=findViewById(R.id.editTextText4);

        edMale=findViewById(R.id.editTextText5);

        edHeight=findViewById(R.id.editTextText6);

        myDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);


    }
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button)
        {
            onSave();
            
        }
    }
    public void onSave(){
        String id = myDataBase.getKey();
        String name = edName.getText().toString();
        String familia = edSName.getText().toString();
        String email=edMail.getText().toString();
        String age = edAge.getText().toString();
        String male = edMale.getText().toString();
        String height = edHeight.getText().toString();
        User user = new User(id, name, familia, email, age, male, height);
        myDataBase.push().setValue(user);
    }

}