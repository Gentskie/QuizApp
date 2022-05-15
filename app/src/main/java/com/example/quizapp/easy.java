package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class easy extends AppCompatActivity {

    CardView cvq1, cvq2, cvq3, cvq4, cvq5, cvq6, cvq7, cvq8, cvq9, cvq10;
    CardView cvc1, cvc2, cvc3, cvc4, cvc5, cvc6, cvc7, cvc8, cvc9, cvc10;
    CardView cvw1, cvw2, cvw3, cvw4, cvw5, cvw6, cvw7, cvw8, cvw9, cvw10;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    Button abtn1, abtn2, abtn3, abtn4, abtn5, abtn6, abtn7, abtn8, abtn9, abtn10;
    Button bbtn1, bbtn2, bbtn3, bbtn4, bbtn5, bbtn6, bbtn7, bbtn8, bbtn9, bbtn10;
    Button cbtn1, cbtn2, cbtn3, cbtn4, cbtn5, cbtn6, cbtn7, cbtn8, cbtn9, cbtn10;
    Button dbtn1, dbtn2, dbtn3, dbtn4, dbtn5, dbtn6, dbtn7, dbtn8, dbtn9, dbtn10;
    Button obtn1, obtn2, obtn3, obtn4, obtn5, obtn6, obtn7, obtn8, obtn9, obtn10;
    Button cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9, cont10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        //Questions
        cvq1 = (CardView) findViewById(R.id.cvq1);
        cvq1.setVisibility(View.INVISIBLE);
        cvq2 = (CardView) findViewById(R.id.cvq2);
        cvq2.setVisibility(View.INVISIBLE);
        cvq3 = (CardView) findViewById(R.id.cvq3);
        cvq3.setVisibility(View.INVISIBLE);
        cvq4 = (CardView) findViewById(R.id.cvq4);
        cvq4.setVisibility(View.INVISIBLE);
        cvq5 = (CardView) findViewById(R.id.cvq5);
        cvq5.setVisibility(View.INVISIBLE);
        cvq6 = (CardView) findViewById(R.id.cvq6);
        cvq6.setVisibility(View.INVISIBLE);
        cvq7 = (CardView) findViewById(R.id.cvq7);
        cvq7.setVisibility(View.INVISIBLE);
        cvq8 = (CardView) findViewById(R.id.cvq8);
        cvq8.setVisibility(View.INVISIBLE);
        cvq9 = (CardView) findViewById(R.id.cvq9);
        cvq9.setVisibility(View.INVISIBLE);
        cvq10 = (CardView) findViewById(R.id.cvq10);
        cvq10.setVisibility(View.INVISIBLE);

        btn1 = (Button) findViewById(R.id.btnq1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { cvq1.setVisibility(View.VISIBLE);
            }
        });
        btn2 = (Button) findViewById(R.id.btnq2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq2.setVisibility(View.VISIBLE);
            }
        });
        btn3 = (Button) findViewById(R.id.btnq3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq3.setVisibility(View.VISIBLE);
            }
        });
        btn4 = (Button) findViewById(R.id.btnq4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq4.setVisibility(View.VISIBLE);
            }
        });
        btn5 = (Button) findViewById(R.id.btnq5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq5.setVisibility(View.VISIBLE);
            }
        });
        btn6 = (Button) findViewById(R.id.btnq6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq6.setVisibility(View.VISIBLE);
            }
        });
        btn7 = (Button) findViewById(R.id.btnq7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq7.setVisibility(View.VISIBLE);
            }
        });
        btn8 = (Button) findViewById(R.id.btnq8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq8.setVisibility(View.VISIBLE);
            }
        });
        btn9 = (Button) findViewById(R.id.btnq9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq9.setVisibility(View.VISIBLE);
            }
        });
        btn10 = (Button) findViewById(R.id.btnq10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq10.setVisibility(View.VISIBLE);
            }
        });
        // Answers card

        cvc1 = (CardView) findViewById(R.id.cvc1);
        cvc1.setVisibility(View.INVISIBLE);
        cvc2 = (CardView) findViewById(R.id.cvc2);
        cvc2.setVisibility(View.INVISIBLE);
        cvc3 = (CardView) findViewById(R.id.cvc3);
        cvc3.setVisibility(View.INVISIBLE);
        cvc4 = (CardView) findViewById(R.id.cvc4);
        cvc4.setVisibility(View.INVISIBLE);
        cvc5 = (CardView) findViewById(R.id.cvc5);
        cvc5.setVisibility(View.INVISIBLE);
        cvc6 = (CardView) findViewById(R.id.cvc6);
        cvc6.setVisibility(View.INVISIBLE);
        cvc7 = (CardView) findViewById(R.id.cvc7);
        cvc7.setVisibility(View.INVISIBLE);
        cvc8 = (CardView) findViewById(R.id.cvc8);
        cvc8.setVisibility(View.INVISIBLE);
        cvc9 = (CardView) findViewById(R.id.cvc9);
        cvc9.setVisibility(View.INVISIBLE);
        cvc10 = (CardView) findViewById(R.id.cvc10);
        cvc10.setVisibility(View.INVISIBLE);

        //Correct Answers
        cbtn1 = (Button) findViewById(R.id.cbtn1);
        cbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc1.setVisibility(View.VISIBLE);
                cvq1.setVisibility(View.INVISIBLE);
                /*cvc1.setVisibility(View.INVISIBLE);
                btn1.setEnabled(false);
                btn1.setSelected(true);
                btn1.setClickable(false);*/

            }
        });
        cbtn2 = (Button) findViewById(R.id.cbtn2);
        cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc2.setVisibility(View.VISIBLE);
                cvq2.setVisibility(View.INVISIBLE);

            }
        });
        abtn3 = (Button) findViewById(R.id.abtn3);
        abtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc3.setVisibility(View.VISIBLE);
                cvq3.setVisibility(View.INVISIBLE);

            }
        });
        abtn4 = (Button) findViewById(R.id.abtn4);
        abtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc4.setVisibility(View.VISIBLE);
                cvq4.setVisibility(View.INVISIBLE);

            }
        });
        dbtn5 = (Button) findViewById(R.id.dbtn5);
        dbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc5.setVisibility(View.VISIBLE);
                cvq5.setVisibility(View.INVISIBLE);

            }
        });
        bbtn6 = (Button) findViewById(R.id.bbtn6);
        bbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc6.setVisibility(View.VISIBLE);
                cvq6.setVisibility(View.INVISIBLE);

            }
        });
        cbtn7 = (Button) findViewById(R.id.cbtn7);
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc7.setVisibility(View.VISIBLE);
                cvq7.setVisibility(View.INVISIBLE);

            }
        });
        abtn8 = (Button) findViewById(R.id.abtn8);
        abtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc8.setVisibility(View.VISIBLE);
                cvq8.setVisibility(View.INVISIBLE);

            }
        });
        abtn9 = (Button) findViewById(R.id.abtn9);
        abtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc9.setVisibility(View.VISIBLE);
                cvq9.setVisibility(View.INVISIBLE);

            }
        });
        cbtn10 = (Button) findViewById(R.id.cbtn10);
        cbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc10.setVisibility(View.VISIBLE);
                cvq10.setVisibility(View.INVISIBLE);

            }
        });

        //continue correct answers
        obtn1 = (Button) findViewById(R.id.obtn1);
        obtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc1.setVisibility(View.INVISIBLE);
                btn1.setEnabled(false);
                cvq2.setVisibility(View.VISIBLE);
            }
        });
        obtn2 = (Button) findViewById(R.id.obtn2);
        obtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc2.setVisibility(View.INVISIBLE);
                btn2.setEnabled(false);
                cvq3.setVisibility(View.VISIBLE);
            }
        });
        obtn3 = (Button) findViewById(R.id.obtn3);
        obtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc3.setVisibility(View.INVISIBLE);
                btn3.setEnabled(false);
                cvq4.setVisibility(View.VISIBLE);
            }
        });
        obtn4 = (Button) findViewById(R.id.obtn4);
        obtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc4.setVisibility(View.INVISIBLE);
                btn4.setEnabled(false);
                cvq5.setVisibility(View.VISIBLE);
            }
        });
        obtn5 = (Button) findViewById(R.id.obtn5);
        obtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc5.setVisibility(View.INVISIBLE);
                btn5.setEnabled(false);
                cvq6.setVisibility(View.VISIBLE);
            }
        });
        obtn6 = (Button) findViewById(R.id.obtn6);
        obtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc6.setVisibility(View.INVISIBLE);
                btn6.setEnabled(false);
                cvq7.setVisibility(View.VISIBLE);
            }
        });
        obtn7 = (Button) findViewById(R.id.obtn7);
        obtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc7.setVisibility(View.INVISIBLE);
                btn7.setEnabled(false);
                cvq8.setVisibility(View.VISIBLE);
            }
        });
        obtn8 = (Button) findViewById(R.id.obtn8);
        obtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc8.setVisibility(View.INVISIBLE);
                btn8.setEnabled(false);
                cvq9.setVisibility(View.VISIBLE);
            }
        });
        obtn9 = (Button) findViewById(R.id.obtn9);
        obtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc9.setVisibility(View.INVISIBLE);
                btn9.setEnabled(false);
                cvq10.setVisibility(View.VISIBLE);
            }
        });
        obtn10 = (Button) findViewById(R.id.obtn10);
        obtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvc10.setVisibility(View.INVISIBLE);
                btn10.setEnabled(false);
            }
        });

        //Wrong answer consequences
        cvw1 = (CardView) findViewById(R.id.cvw1);
        cvw1.setVisibility(View.INVISIBLE);
        cvw2 = (CardView) findViewById(R.id.cvw2);
        cvw2.setVisibility(View.INVISIBLE);
        cvw3 = (CardView) findViewById(R.id.cvw3);
        cvw3.setVisibility(View.INVISIBLE);
        cvw4 = (CardView) findViewById(R.id.cvw4);
        cvw4.setVisibility(View.INVISIBLE);
        cvw5 = (CardView) findViewById(R.id.cvw5);
        cvw5.setVisibility(View.INVISIBLE);
        cvw6 = (CardView) findViewById(R.id.cvw6);
        cvw6.setVisibility(View.INVISIBLE);
        cvw7 = (CardView) findViewById(R.id.cvw7);
        cvw7.setVisibility(View.INVISIBLE);
        cvw8 = (CardView) findViewById(R.id.cvw8);
        cvw8.setVisibility(View.INVISIBLE);
        cvw9 = (CardView) findViewById(R.id.cvw9);
        cvw9.setVisibility(View.INVISIBLE);
        cvw10 = (CardView) findViewById(R.id.cvw10);
        cvw10.setVisibility(View.INVISIBLE);

        //Wrong choices
        //Choice As
        abtn1 = (Button) findViewById(R.id.abtn1);
        abtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw1.setVisibility(View.VISIBLE);
                cvq1.setVisibility(View.INVISIBLE);

            }
        });
        abtn2 = (Button) findViewById(R.id.abtn2);
        abtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw2.setVisibility(View.VISIBLE);
                cvq2.setVisibility(View.INVISIBLE);

            }
        });
        abtn5 = (Button) findViewById(R.id.abtn5);
        abtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw5.setVisibility(View.VISIBLE);
                cvq5.setVisibility(View.INVISIBLE);

            }
        });
        abtn6 = (Button) findViewById(R.id.abtn6);
        abtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw6.setVisibility(View.VISIBLE);
                cvq6.setVisibility(View.INVISIBLE);

            }
        });
        abtn7 = (Button) findViewById(R.id.abtn7);
        abtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw7.setVisibility(View.VISIBLE);
                cvq7.setVisibility(View.INVISIBLE);

            }
        });
        abtn10 = (Button) findViewById(R.id.abtn10);
        abtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw10.setVisibility(View.VISIBLE);
                cvq10.setVisibility(View.INVISIBLE);

            }
        });

        //choice Bs
        bbtn1 = (Button) findViewById(R.id.bbtn1);
        bbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw1.setVisibility(View.VISIBLE);
                cvq1.setVisibility(View.INVISIBLE);

            }
        });
        bbtn2 = (Button) findViewById(R.id.bbtn2);
        bbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw2.setVisibility(View.VISIBLE);
                cvq2.setVisibility(View.INVISIBLE);

            }
        });
        bbtn3 = (Button) findViewById(R.id.bbtn3);
        bbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw3.setVisibility(View.VISIBLE);
                cvq3.setVisibility(View.INVISIBLE);

            }
        });
        bbtn4 = (Button) findViewById(R.id.bbtn4);
        bbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw4.setVisibility(View.VISIBLE);
                cvq4.setVisibility(View.INVISIBLE);

            }
        });
        bbtn5 = (Button) findViewById(R.id.bbtn5);
        bbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw5.setVisibility(View.VISIBLE);
                cvq5.setVisibility(View.INVISIBLE);

            }
        });
        bbtn7 = (Button) findViewById(R.id.bbtn7);
        bbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw7.setVisibility(View.VISIBLE);
                cvq7.setVisibility(View.INVISIBLE);

            }
        });
        bbtn8 = (Button) findViewById(R.id.bbtn8);
        bbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw8.setVisibility(View.VISIBLE);
                cvq8.setVisibility(View.INVISIBLE);

            }
        });
        bbtn9 = (Button) findViewById(R.id.bbtn9);
        bbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw9.setVisibility(View.VISIBLE);
                cvq9.setVisibility(View.INVISIBLE);

            }
        });
        bbtn10 = (Button) findViewById(R.id.bbtn10);
        bbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw10.setVisibility(View.VISIBLE);
                cvq10.setVisibility(View.INVISIBLE);

            }
        });

        //choice Cs

        cbtn3 = (Button) findViewById(R.id.cbtn3);
        cbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw3.setVisibility(View.VISIBLE);
                cvq3.setVisibility(View.INVISIBLE);

            }
        });
        cbtn4 = (Button) findViewById(R.id.cbtn4);
        cbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw4.setVisibility(View.VISIBLE);
                cvq4.setVisibility(View.INVISIBLE);

            }
        });
        cbtn5 = (Button) findViewById(R.id.cbtn5);
        cbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw5.setVisibility(View.VISIBLE);
                cvq5.setVisibility(View.INVISIBLE);

            }
        });
        cbtn6 = (Button) findViewById(R.id.cbtn6);
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw6.setVisibility(View.VISIBLE);
                cvq6.setVisibility(View.INVISIBLE);

            }
        });
        cbtn8 = (Button) findViewById(R.id.cbtn8);
        cbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw8.setVisibility(View.VISIBLE);
                cvq8.setVisibility(View.INVISIBLE);

            }
        });
        cbtn9 = (Button) findViewById(R.id.cbtn9);
        cbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw9.setVisibility(View.VISIBLE);
                cvq9.setVisibility(View.INVISIBLE);

            }
        });

        //choice Ds

        dbtn1 = (Button) findViewById(R.id.dbtn1);
        dbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw1.setVisibility(View.VISIBLE);
                cvq1.setVisibility(View.INVISIBLE);

            }
        });
        dbtn2 = (Button) findViewById(R.id.dbtn2);
        dbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw2.setVisibility(View.VISIBLE);
                cvq2.setVisibility(View.INVISIBLE);

            }
        });
        dbtn3 = (Button) findViewById(R.id.dbtn3);
        dbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw3.setVisibility(View.VISIBLE);
                cvq3.setVisibility(View.INVISIBLE);

            }
        });
        dbtn4 = (Button) findViewById(R.id.dbtn4);
        dbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw4.setVisibility(View.VISIBLE);
                cvq4.setVisibility(View.INVISIBLE);

            }
        });
        dbtn6 = (Button) findViewById(R.id.dbtn6);
        dbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw6.setVisibility(View.VISIBLE);
                cvq6.setVisibility(View.INVISIBLE);

            }
        });
        dbtn7 = (Button) findViewById(R.id.dbtn7);
        dbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw7.setVisibility(View.VISIBLE);
                cvq7.setVisibility(View.INVISIBLE);

            }
        });
        dbtn8 = (Button) findViewById(R.id.dbtn8);
        dbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw8.setVisibility(View.VISIBLE);
                cvq8.setVisibility(View.INVISIBLE);

            }
        });
        dbtn9 = (Button) findViewById(R.id.dbtn9);
        dbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw9.setVisibility(View.VISIBLE);
                cvq9.setVisibility(View.INVISIBLE);

            }
        });
        dbtn10 = (Button) findViewById(R.id.dbtn10);
        dbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw10.setVisibility(View.VISIBLE);
                cvq10.setVisibility(View.INVISIBLE);

            }
        });

        //continue wrong answers
        cont1 = (Button) findViewById(R.id.cont1);
        cont1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw1.setVisibility(View.INVISIBLE);
                btn1.setSelected(true);
                btn1.setClickable(false);
                cvq2.setVisibility(View.VISIBLE);
            }
        });
        cont2 = (Button) findViewById(R.id.cont2);
        cont2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw2.setVisibility(View.INVISIBLE);
                btn2.setSelected(true);
                btn2.setClickable(false);
                cvq3.setVisibility(View.VISIBLE);
            }
        });
        cont3 = (Button) findViewById(R.id.cont3);
        cont3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw3.setVisibility(View.INVISIBLE);
                btn3.setSelected(true);
                btn3.setClickable(false);
                cvq4.setVisibility(View.VISIBLE);
            }
        });
        cont4 = (Button) findViewById(R.id.cont4);
        cont4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw4.setVisibility(View.INVISIBLE);
                btn4.setSelected(true);
                btn4.setClickable(false);
                cvq5.setVisibility(View.VISIBLE);
            }
        });
        cont5 = (Button) findViewById(R.id.cont5);
        cont5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw5.setVisibility(View.INVISIBLE);
                btn5.setSelected(true);
                btn5.setClickable(false);
                cvq6.setVisibility(View.VISIBLE);
            }
        });
        cont6 = (Button) findViewById(R.id.cont6);
        cont6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw6.setVisibility(View.INVISIBLE);
                btn6.setSelected(true);
                btn6.setClickable(false);
                cvq7.setVisibility(View.VISIBLE);
            }
        });
        cont7 = (Button) findViewById(R.id.cont7);
        cont7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw7.setVisibility(View.INVISIBLE);
                btn7.setSelected(true);
                btn7.setClickable(false);
                cvq8.setVisibility(View.VISIBLE);
            }
        });
        cont8 = (Button) findViewById(R.id.cont8);
        cont8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw8.setVisibility(View.INVISIBLE);
                btn8.setSelected(true);
                btn8.setClickable(false);
                cvq9.setVisibility(View.VISIBLE);
            }
        });
        cont9 = (Button) findViewById(R.id.cont9);
        cont9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw9.setVisibility(View.INVISIBLE);
                btn9.setSelected(true);
                btn9.setClickable(false);
                cvq10.setVisibility(View.VISIBLE);
            }
        });
        cont10 = (Button) findViewById(R.id.cont10);
        cont10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvw10.setVisibility(View.INVISIBLE);
                btn10.setSelected(true);
                btn10.setClickable(false);
            }
        });


    }

    @Override
    public void onBackPressed() {

        int counter = 0;

        counter ++;

        if(counter == 1){
            //questions
            cvq1.setVisibility(View.INVISIBLE);
            cvq2.setVisibility(View.INVISIBLE);
            cvq3.setVisibility(View.INVISIBLE);
            cvq4.setVisibility(View.INVISIBLE);
            cvq5.setVisibility(View.INVISIBLE);
            cvq6.setVisibility(View.INVISIBLE);
            cvq7.setVisibility(View.INVISIBLE);
            cvq8.setVisibility(View.INVISIBLE);
            cvq9.setVisibility(View.INVISIBLE);
            cvq10.setVisibility(View.INVISIBLE);
            //correct answer
            cvc1.setVisibility(View.INVISIBLE);
            cvc2.setVisibility(View.INVISIBLE);
            cvc3.setVisibility(View.INVISIBLE);
            cvc4.setVisibility(View.INVISIBLE);
            cvc5.setVisibility(View.INVISIBLE);
            cvc6.setVisibility(View.INVISIBLE);
            cvc7.setVisibility(View.INVISIBLE);
            cvc8.setVisibility(View.INVISIBLE);
            cvc9.setVisibility(View.INVISIBLE);
            cvc10.setVisibility(View.INVISIBLE);
            //Wrong answer
            cvw1.setVisibility(View.INVISIBLE);
            cvw2.setVisibility(View.INVISIBLE);
            cvw3.setVisibility(View.INVISIBLE);
            cvw4.setVisibility(View.INVISIBLE);
            cvw5.setVisibility(View.INVISIBLE);
            cvw6.setVisibility(View.INVISIBLE);
            cvw7.setVisibility(View.INVISIBLE);
            cvw8.setVisibility(View.INVISIBLE);
            cvw9.setVisibility(View.INVISIBLE);
            cvw10.setVisibility(View.INVISIBLE);

        }
        else if(counter == 2){
            super.onBackPressed();
        }
    }
}