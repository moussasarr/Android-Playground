package com.example.adder;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class adding extends AppCompatActivity {
    Button addBtn;
    EditText num1, num2;
    TextView sumText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        addBtn = findViewById(R.id.button);
        sumText = findViewById(R.id.sumTxt);
        addBtn.setOnClickListener(v -> {
               int i = Integer.parseInt(num1.getText().toString());
               int j = Integer.parseInt(num2.getText().toString());
               int k = i + j;
               sumText.setText("Ans is: " + k);

            AlertDialog.Builder builder = new AlertDialog.Builder(adding.this);
            builder.setMessage("Are you sure ?").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(adding.this, "Thanks", Toast.LENGTH_SHORT).show();
                }
            }).setNegativeButton("Cancel", null);
            AlertDialog alert = builder.create();
            alert.show();
        });
    }

    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(adding.this);
        builder.setTitle("Really exit ?").setMessage("Are you sure ?").setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                adding.super.onBackPressed();
                //Toast.makeText(adding.this, "SOrry Not going anywhere", Toast.LENGTH_LONG);
            }
        }).setNegativeButton("Cancel", null);
        AlertDialog alert = builder.create();
        alert.show();
    }
//    public void setAddBtn (View v){
//        int i = Integer.parseInt(num1.getText().toString());
//        int j = Integer.parseInt(num2.getText().toString());
//        int k = i + j;
//        sumText.setText("Ans is: " + k);
//
//    }
}
