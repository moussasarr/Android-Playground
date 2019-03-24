package com.example.adder;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class seekBar extends AppCompatActivity {
     TextView tv, tv1;
     SeekBar sb;
     RatingBar rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                View v = LayoutInflater.from(seekBar.this).inflate(R.layout.activity_main2, null);
                EditText username =  v.findViewById(R.id.username);
                EditText password = v.findViewById(R.id.password);
                AlertDialog.Builder buildr = new AlertDialog.Builder(seekBar.this);
                buildr.setTitle("Login").
                        setMessage("Enter username and password").
                        setView(v).
                        setPositiveButton("login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String uname = username.getText().toString();
                        String passw = password.getText().toString();
                       if(uname.equals("ms490") && passw.equals("0000")){
                           Toast.makeText(seekBar.this, "Successful Login", Toast.LENGTH_LONG).show();
                       }
                    }
                }).setNegativeButton("Cancel", null).setCancelable(false);

                AlertDialog myAlert = buildr.create();
                myAlert.show();
            }
        });

        tv = findViewById(R.id.textView);
        sb = findViewById(R.id.sbar);
        tv1 = findViewById(R.id.tview1);
        rb = findViewById(R.id.rbar);


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv.setTextSize(8 + progress*3);
                tv1.setText(progress + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekBar.this, "started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               Toast.makeText(seekBar.this, rating + "", Toast.LENGTH_LONG).show();
            }
        });
    }

}
