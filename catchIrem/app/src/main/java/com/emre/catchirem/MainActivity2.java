package com.emre.catchirem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int a;
    TextView textView;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView3);
        Intent intent=getIntent();
        a=intent.getIntExtra("skor",0);
        textView.setText("SON SKOR:"+a);
        player=MediaPlayer.create(MainActivity2.this,R.raw.songrem);

            player.start();
    }
    public void kolay(View view){
        player.start();
        Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        intent.putExtra("süre",850);
        startActivity(intent);
    }
    public void orta(View view){
        player.start();
        Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        intent.putExtra("süre",500);
        startActivity(intent);
    }
    public void zor(View view){
        player.start();
        Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        intent.putExtra("süre",300);
        startActivity(intent);
    }
}