package com.example.adder;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    Button reg;
    EditText name, email, password;
    RadioButton r1,r2;
    RadioGroup rg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        reg = findViewById(R.id.regButton);
        name = findViewById(R.id.input_name);
        email = findViewById(R.id.input_email);
        password = findViewById(R.id.input_password);
        r1 = findViewById(R.id.m);
        r2 = findViewById(R.id.f);
        rg = findViewById(R.id.radioGroup);

        reg.setOnClickListener(view -> {
            String salute = "";
//            if (r1.isChecked()){
//                salute = "Mr.";
//            } else {
//                salute = "Ms.";
//            }

            int i = rg.getCheckedRadioButtonId();
            RadioButton rb = rg.findViewById(i);
            final String uname = name.getText().toString();
            final String uemail = email.getText().toString();
            final String upassword = password.getText().toString();

            Intent intent = new Intent(signup.this, MainActivity.class);
            intent.putExtra("name", uname);
            intent.putExtra("mail", uemail);
            intent.putExtra("password", upassword);
            intent.putExtra("gender", rb.getText().toString());
            startActivity(intent);
//            Toast.makeText(this,   "Gender: " + rb.getText().toString() + " \n Name: " + " " + uname + "\n Email: " + uemail + "\nPassword: " + upassword, Toast.LENGTH_LONG).show();
//            System.out.println("Gender: " + rb.getText().toString() + "Name: "  + uname + "\n Email: " + uemail + "\nPassword: " + upassword );
        });
    }

}
