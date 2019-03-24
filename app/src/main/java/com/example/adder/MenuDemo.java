package com.example.adder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_demo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case (R.id.settings):
                Toast.makeText(this, "Settings Selected", Toast.LENGTH_LONG).show();
                break;

            case (R.id.contact):
                Toast.makeText(this, "Contact Selected", Toast.LENGTH_LONG).show();
                break;

            case (R.id.about):
                Toast.makeText(this, "About Selected", Toast.LENGTH_LONG).show();
                break;

                default:
                    break;
        }
        return true;
    }
}
