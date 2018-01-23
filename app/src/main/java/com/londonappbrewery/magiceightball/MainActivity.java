package com.londonappbrewery.magiceightball;
/*
ask about project :
making only portrait
not clicing but shakingg
when stop shaking choosing 1 or three sound files


*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
//tryingg adding timer
import java.util.Timer;
import java.util.TimerTask;
import android.os.Handler;
//end tryingg adding timer
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton;
        askButton = (Button)findViewById(R.id.button);
        final ImageView answer = (ImageView)findViewById(R.id.imageBall);
        final int[] ballArrey = {
                R.drawable.ball1h,
                R.drawable.ball2h,
                R.drawable.ball3h,
                R.drawable.ball4h,
                R.drawable.ball5h,

                        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//trying to add timer between pics - like animation

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        answer.setImageResource(R.drawable.ball_r);
                    }
                }, 100


                );
                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            answer.setImageResource(R.drawable.ball_l);
                                        }
                                    }, 200


                );
                final Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                                         @Override
                                         public void run() {
                                             answer.setImageResource(R.drawable.ball_r);
                                         }
                                     }, 300


                );
                final Handler handler3 = new Handler();
                handler3.postDelayed(new Runnable() {
                                         @Override
                                         public void run() {
                                             answer.setImageResource(R.drawable.ball_l);
                                         }
                                     }, 400


                );
                final Handler handler4 = new Handler();
                handler4.postDelayed(new Runnable() {
                                         @Override
                                         public void run() {
                                             Random randomBall = new Random();
                                             int numberBall = randomBall.nextInt(5);
                                             answer.setImageResource(ballArrey[numberBall]);
                                         }
                                     }, 600


                );
                //stop trial
              /*  Random randomBall = new Random();
                int numberBall = randomBall.nextInt(5);
                answer.setImageResource(ballArrey[numberBall]);
*/
            }

        });
    }
}
