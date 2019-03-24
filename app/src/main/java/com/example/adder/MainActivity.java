package com.example.adder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView name, gender, mail, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String sname = intent.getStringExtra("name");
        String sgender = intent.getStringExtra("gender");
        String smail = intent.getStringExtra("mail");
        String spassword = intent.getStringExtra("password");


        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        mail = findViewById(R.id.mail);
        password = findViewById(R.id.password);

        name.setText(sname);
        gender.setText(sgender);
        mail.setText(smail);
        password.setText(spassword);
    }
}
