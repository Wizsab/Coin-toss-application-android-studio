package com.example.android.cointoss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    Button toToss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView imageView = (ImageView) findViewById(R.id.tosses);
        Button toToss = (Button) findViewById(R.id.toss);


        Glide.with(Main2Activity.this)
                .load(R.drawable.spin)
                .into(imageView);


            toToss.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(getBaseContext(), Main3Activity.class);
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
