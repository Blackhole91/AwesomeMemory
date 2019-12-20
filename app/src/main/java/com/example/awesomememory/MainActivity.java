package com.example.awesomememory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    MediaPlayer click,gameMusic;
    TextView textViewPlayer1, textViewPlayer2;
    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;

    Integer[] cardArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int p_101, p_102, p_103, p_104, p_105, p_106, p_201, p_202, p_203, p_204, p_205, p_206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;

    int cardNumber = 1;
    int turn = 1;

    int playerPoints = 0, player2Points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameMusic = MediaPlayer.create(MainActivity.this,R.raw.gamemusic);
        click = MediaPlayer.create(MainActivity.this,R.raw.click1);

        textViewPlayer1 =  findViewById(R.id.textView1);
        textViewPlayer2 =  findViewById(R.id.textView2);

        iv_11 =  findViewById(R.id._11);
        iv_12 =  findViewById(R.id._12);
        iv_13 =  findViewById(R.id._13);
        iv_14 =  findViewById(R.id._14);

        iv_21 =  findViewById(R.id._21);
        iv_22 =  findViewById(R.id._22);
        iv_23 =  findViewById(R.id._23);
        iv_24 =  findViewById(R.id._24);

        iv_31 =  findViewById(R.id._31);
        iv_32 =  findViewById(R.id._32);
        iv_33 =  findViewById(R.id._33);
        iv_34 =  findViewById(R.id._34);


        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        //load images
        frontOfCardsResources();

        //shuffle images
        Collections.shuffle(Arrays.asList(cardArray));

        //change color of player
        textViewPlayer2.setTextColor(Color.GRAY);
        textViewPlayer1.setTextColor(Color.BLACK);

        gameMusic.start();

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);
                click.start();

            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, theCard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, theCard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, theCard);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_32, theCard);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_33, theCard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_34, theCard);
            }
        });


    }

    private void doStuff(ImageView iv, int card) {
        // set correct image to image view
        if (cardArray[card] == 101) {
            iv.setImageResource(p_101);
        } else if (cardArray[card] == 102) {
            iv.setImageResource(p_102);
        } else if (cardArray[card] == 103) {
            iv.setImageResource(p_103);
        } else if (cardArray[card] == 104) {
            iv.setImageResource(p_104);
        } else if (cardArray[card] == 105) {
            iv.setImageResource(p_105);
        } else if (cardArray[card] == 106) {
            iv.setImageResource(p_106);
        } else if (cardArray[card] == 201) {
            iv.setImageResource(p_201);
        } else if (cardArray[card] == 202) {
            iv.setImageResource(p_202);
        } else if (cardArray[card] == 203) {
            iv.setImageResource(p_203);
        } else if (cardArray[card] == 204) {
            iv.setImageResource(p_204);
        } else if (cardArray[card] == 205) {
            iv.setImageResource(p_205);
        } else if (cardArray[card] == 206) {
            iv.setImageResource(p_206);
        }

        // check which image is selected and save it temporary

        if (cardNumber == 1) {

            firstCard = cardArray[card];

            if(firstCard > 200){

                firstCard = firstCard -100;

            }
            cardNumber = 2;
            clickedFirst = card;


            iv.setEnabled(false);

        } else if (cardNumber == 2) {

            secondCard = cardArray[card];

            if (secondCard > 200){

                secondCard = secondCard - 100;

            }
            cardNumber = 1;
            clickedSecond = card;


            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // check if selected image is equal

                        calculate();

                }
            }, 1000);
        }
    }

    private void calculate() {
        //if images are equal remove them and add point

        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                iv_11.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 1) {
                iv_12.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 2) {
                iv_13.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 3) {
                iv_14.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 4) {
                iv_21.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 5) {
                iv_22.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 6) {
                iv_23.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 7) {
                iv_24.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 8) {
                iv_31.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 9) {
                iv_32.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 10) {
                iv_33.setImageResource(View.INVISIBLE);

            } else if (clickedFirst == 11) {
                iv_34.setImageResource(View.INVISIBLE);
            }

            if (clickedSecond == 0) {
                iv_11.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 1) {
                iv_12.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 2) {
                iv_13.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 3) {
                iv_14.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 4) {
                iv_21.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 5) {
                iv_22.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 6) {
                iv_23.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 7) {
                iv_24.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 8) {
                iv_31.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 9) {
                iv_32.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 10) {
                iv_33.setImageResource(View.INVISIBLE);

            } else if (clickedSecond == 11) {
                iv_34.setImageResource(View.INVISIBLE);
            }


            //add points to the correct player
            if (turn == 1) {
                playerPoints++;
                textViewPlayer1.setText("Player 1: " + playerPoints);

            } else if (turn == 2) {
                player2Points++;
                textViewPlayer2.setText("Player 2: " + player2Points);

            }

        } else {
            iv_11.setImageResource(R.drawable.fz12);
            iv_12.setImageResource(R.drawable.fz12);
            iv_13.setImageResource(R.drawable.fz12);
            iv_14.setImageResource(R.drawable.fz12);

            iv_21.setImageResource(R.drawable.fz12);
            iv_22.setImageResource(R.drawable.fz12);
            iv_23.setImageResource(R.drawable.fz12);
            iv_24.setImageResource(R.drawable.fz12);

            iv_31.setImageResource(R.drawable.fz12);
            iv_32.setImageResource(R.drawable.fz12);
            iv_33.setImageResource(R.drawable.fz12);
            iv_34.setImageResource(R.drawable.fz12);


            //change player turn
            if (turn == 1) {
                turn = 2;
                textViewPlayer1.setTextColor(Color.GRAY);
                textViewPlayer2.setTextColor(Color.BLACK);
            } else if (turn == 2) {
                turn = 1;
                textViewPlayer2.setTextColor(Color.GRAY);
                textViewPlayer1.setTextColor(Color.BLACK);
            }
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);

        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);

        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        //check if game is over
        //checkEnd();
    }
    private void checkEnd () {
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE){

            AlertDialog.Builder alertDiologBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDiologBuilder.setMessage("Game Over!\nP1: "+ playerPoints + "\nP2: " + player2Points)
                              .setCancelable(false)
                              .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                                  @Override
                                  public void onClick(DialogInterface dialog, int which) {

                                      Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                      startActivity(intent);
                                      finish();
                                                                                         }
                                                                                                    })
                              .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialog, int which) {
                                  finish();
                              }

                              });
            AlertDialog alertDialog = alertDiologBuilder.create();
            alertDialog.show();
        }

     }



    private void frontOfCardsResources () {

            p_101 = R.drawable.i_101;
            p_102 = R.drawable.i_102;
            p_103 = R.drawable.i_103;
            p_104 = R.drawable.i_104;
            p_105 = R.drawable.i_105;
            p_106 = R.drawable.i_106;
            p_201 = R.drawable.i_201;
            p_202 = R.drawable.i_202;
            p_203 = R.drawable.i_203;
            p_204 = R.drawable.i_204;
            p_205 = R.drawable.i_205;
            p_206 = R.drawable.i_206;
        }

    }
