package com.example.lab11calc;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;



import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import expr.Expr;
import expr.Parser;
import expr.SyntaxException;

import static expr.Parser.*;


public class MainActivity extends AppCompatActivity {



  private TextView output;
  private   Expr expr;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



 Button one = (Button)findViewById(R.id.button1);
         Button two = (Button)findViewById(R.id.button2);
         Button three = (Button)findViewById(R.id.button3);
         Button four = (Button)findViewById(R.id.button4);
         Button five = (Button)findViewById(R.id.button5);
         Button six = (Button)findViewById(R.id.button6);
         Button seven = (Button)findViewById(R.id.button7);
         Button eight = (Button)findViewById(R.id.button8);
         Button nine = (Button)findViewById(R.id.button9);
         Button zero = (Button)findViewById(R.id.button0);

         Button add = (Button)findViewById(R.id.buttonadd);
         Button sub = (Button)findViewById(R.id.buttonsub);
         Button mult = (Button)findViewById(R.id.buttonmult);
         Button divid = (Button)findViewById(R.id.buttondivid);

         Button equal = (Button)findViewById(R.id.buttonequal);
        Button clear = (Button)findViewById(R.id.buttonclear);

         output = (TextView)findViewById(R.id.output);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "5");
            }
        });



        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "6");
            }
        });



        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "7");
            }
        });



        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "9");
            }
        });



        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "0");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "+");
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "-");
            }
        });


        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "*");
            }
        });


        divid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + "/");
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
            }
        });






        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                try {
                    expr = Parser.parse(output.getText().toString());


                    String convi = String.valueOf(expr.value()); //convert double to string

                    output.setText(convi);

                } catch (SyntaxException e) {
                    e.printStackTrace();
                }




            }});












    }
}
