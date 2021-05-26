package com.example.w6_multithread;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countOdds(View view){
        Thread counting = new Thread(new Odds());
        counting.start();
    }

    public void countEvens(View view){
        Thread counting = new Thread(new Evens());
        counting.start();
    }


    class Odds implements Runnable {
        @Override
        public void run () {
                for (int z = 1; z <= 100; z+=2) {
                    System.out.println(z);
                }
            }
    }

    class Evens implements Runnable {

        @Override
        public void run() {
            for (int z = 0; z <= 100; z+=2) {
                System.out.println(z);
            }
        }
    }


}