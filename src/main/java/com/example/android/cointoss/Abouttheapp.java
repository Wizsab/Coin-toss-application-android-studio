package com.example.android.cointoss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Abouttheapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abouttheapp);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String info = "\n\n\n\n\t\tThis application is called coin toss head or tail. " +
                "\n\tWe all know head or tails work toss on.";

        TextView display = (TextView)findViewById(R.id.info);
        display.setText(info);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_items,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.item2:
                Intent intent1 = new Intent(getBaseContext(), Abouttheapp.class);
                startActivityForResult(intent1, 0);
                break;
            case R.id.item3:
                Intent intent2 = new Intent(getBaseContext(), Aboutus.class);
                startActivityForResult(intent2, 0);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
    public void main(View view) {

        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivityForResult(intent, 0);
    }
}
