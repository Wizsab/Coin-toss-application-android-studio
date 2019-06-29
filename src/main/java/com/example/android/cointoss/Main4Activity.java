package com.example.android.cointoss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Main4Activity extends AppCompatActivity {
        ImageView imageView;
        Random r;
        Integer[] images = {
                R.drawable.head, R.drawable.tail
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageView = (ImageView) findViewById(R.id.imageView);

        r = new Random();

        imageView.setImageResource(images[r.nextInt(images.length)]);


        Button toToss = (Button)findViewById(R.id.toss);
        toToss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getBaseContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });

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
}
