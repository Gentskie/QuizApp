package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hard extends AppCompatActivity {
    CardView cvq1, cvq2, cvq3, cvq4, cvq5, cvq6, cvq7, cvq8, cvq9, cvq10;
    CardView cvc1, cvc2, cvc3, cvc4, cvc5, cvc6, cvc7, cvc8, cvc9, cvc10;
    CardView cvw1, cvw2, cvw3, cvw4, cvw5, cvw6, cvw7, cvw8, cvw9, cvw10;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    Button obtn1, obtn2, obtn3, obtn4, obtn5, obtn6, obtn7, obtn8, obtn9, obtn10;
    Button cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9, cont10;
    EditText a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        //CardView Questions
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

        //Button Questions
        btn1 = (Button) findViewById(R.id.btnq1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvq1.setVisibility(View.VISIBLE);
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

        //EditText Answers
        a1 = (EditText) findViewById(R.id.a1);
        a1.setOnEditorActionListener(edit);
        a2 = (EditText) findViewById(R.id.a2);
        a2.setOnEditorActionListener(edit2);
        a3 = (EditText) findViewById(R.id.a3);
        a3.setOnEditorActionListener(edit3);
        a4 = (EditText) findViewById(R.id.a4);
        a4.setOnEditorActionListener(edit4);
        a5 = (EditText) findViewById(R.id.a5);
        a5.setOnEditorActionListener(edit5);
        a6 = (EditText) findViewById(R.id.a6);
        a6.setOnEditorActionListener(edit6);
        a7 = (EditText) findViewById(R.id.a7);
        a7.setOnEditorActionListener(edit7);
        a8 = (EditText) findViewById(R.id.a8);
        a8.setOnEditorActionListener(edit8);
        a9 = (EditText) findViewById(R.id.a9);
        a9.setOnEditorActionListener(edit9);
        a10 = (EditText) findViewById(R.id.a10);
        a10.setOnEditorActionListener(edit10);
    }

    private TextView.OnEditorActionListener edit = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #1
                    if(a1.getText().toString().contentEquals("Amino acid") || a1.getText().toString().contentEquals("amino acid") || a1.getText().toString().contentEquals("AMINO ACID")){
                        a1.setText("");
                        cvq1.setVisibility(View.INVISIBLE);
                        cvc1.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a1.setText("");
                        cvq1.setVisibility(View.INVISIBLE);
                        cvw1.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };
    private TextView.OnEditorActionListener edit2 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/


                    //VALIDATION #2
                    if(a2.getText().toString().contentEquals("Gastrin") || a2.getText().toString().contentEquals("gastrin") || a2.getText().toString().contentEquals("GASTRIN")){
                        a2.setText("");
                        cvq2.setVisibility(View.INVISIBLE);
                        cvc2.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a2.setText("");
                        cvq2.setVisibility(View.INVISIBLE);
                        cvw2.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

    private TextView.OnEditorActionListener edit3 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #3
                    if(a3.getText().toString().contentEquals("secretin") || a3.getText().toString().contentEquals("Secretin") || a3.getText().toString().contentEquals("SECRETIN")){
                        a3.setText("");
                        cvq3.setVisibility(View.INVISIBLE);
                        cvc3.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a3.setText("");
                        cvq3.setVisibility(View.INVISIBLE);
                        cvw3.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

    private TextView.OnEditorActionListener edit4 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #4
                    if(a4.getText().toString().contentEquals("Motilin") || a4.getText().toString().contentEquals("motilin") || a4.getText().toString().contentEquals("MOTILIN")){
                        a4.setText("");
                        cvq4.setVisibility(View.INVISIBLE);
                        cvc4.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a4.setText("");
                        cvq4.setVisibility(View.INVISIBLE);
                        cvw4.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

    private TextView.OnEditorActionListener edit5 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #5
                    if(a5.getText().toString().contentEquals("hormones") || a5.getText().toString().contentEquals("Hormones") || a5.getText().toString().contentEquals("HORMONES")){
                        a5.setText("");
                        cvq5.setVisibility(View.INVISIBLE);
                        cvc5.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a5.setText("");
                        cvq5.setVisibility(View.INVISIBLE);
                        cvw5.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

    private TextView.OnEditorActionListener edit6 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #6
                    if(a6.getText().toString().contentEquals("Circulatory") || a6.getText().toString().contentEquals("circulatory") || a6.getText().toString().contentEquals("CIRCULATORY")){
                        a6.setText("");
                        cvq6.setVisibility(View.INVISIBLE);
                        cvc6.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a6.setText("");
                        cvq6.setVisibility(View.INVISIBLE);
                        cvw6.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

    private TextView.OnEditorActionListener edit7 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #7
                    if(a7.getText().toString().contentEquals("Bronchioles") || a7.getText().toString().contentEquals("bronchioles") || a7.getText().toString().contentEquals("BRONCHIOLES")){
                        a7.setText("");
                        cvq7.setVisibility(View.INVISIBLE);
                        cvc7.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a7.setText("");
                        cvq7.setVisibility(View.INVISIBLE);
                        cvw7.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

    private TextView.OnEditorActionListener edit8 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #8
                    if(a8.getText().toString().contentEquals("Illnesses") || a8.getText().toString().contentEquals("illnesses") || a8.getText().toString().contentEquals("ILLNESSES")){
                        a8.setText("");
                        cvq8.setVisibility(View.INVISIBLE);
                        cvc8.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else if(a8.getText().toString().contentEquals("Diseases") || a8.getText().toString().contentEquals("diseases") || a8.getText().toString().contentEquals("DISEASES")){
                        a8.setText("");
                        cvq8.setVisibility(View.INVISIBLE);
                        cvc8.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a8.setText("");
                        cvq8.setVisibility(View.INVISIBLE);
                        cvw8.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

    private TextView.OnEditorActionListener edit9 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #9
                    if(a9.getText().toString().contentEquals("Inhalation") || a9.getText().toString().contentEquals("inhalation") || a9.getText().toString().contentEquals("INHALATION")){
                        a9.setText("");
                        cvq9.setVisibility(View.INVISIBLE);
                        cvc9.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a9.setText("");
                        cvq9.setVisibility(View.INVISIBLE);
                        cvw9.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

    private TextView.OnEditorActionListener edit10 = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            switch(actionId){
                case EditorInfo.IME_ACTION_SEND:
                    /*a1.setText("");
                    a1.setSelected(false);*/

                    //VALIDATION #10
                    if(a10.getText().toString().contentEquals("Not Present") || a10.getText().toString().contentEquals("not present") || a10.getText().toString().contentEquals("NOT PRESENT")){
                        a10.setText("");
                        cvq10.setVisibility(View.INVISIBLE);
                        cvc10.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
                    else{
                        a10.setText("");
                        cvq10.setVisibility(View.INVISIBLE);
                        cvw10.setVisibility(View.VISIBLE);
                        InputMethodManager close = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if(close != null){
                            close.hideSoftInputFromWindow(a1.getWindowToken(), 0);
                        }
                    }
            }
            return false;
        }
    };

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
            //Wrong Answer
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