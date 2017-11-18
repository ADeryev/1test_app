package com.example.myfirstapp;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public  static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private String dispFieldText="";
    private double displayValue=0;
    private double currentResult=0;
    private char selectedAction=' ';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textview = findViewById(R.id.TextView);

   // метод для передачи текста в другую activity
   /* public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String dispFieldText = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, dispFieldText);
        startActivity(intent);
    }  */

        final Button button0 = findViewById(R.id.button0);
         button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"0");

            }
        });

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"1");

            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"2");

            }
        });

        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"3");

            }
        });

        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"4");

            }
        });

        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"5");

            }
        });

        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"6");


            }
        });

        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"7");

            }
        });

        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"8");

            }
        });

        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+"9");

            }
        });

        final Button buttonmin = findViewById(R.id.buttonmin);
        buttonmin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                if (!"".equals(dispFieldText)){
                    try {
                        displayValue=Double.parseDouble(dispFieldText);
                        currentResult=displayValue;
                        selectedAction = '-';
                    } catch (NumberFormatException e1) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Пустое поле, операция невозможна", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    } finally {
                        textview.setText("");

                    }
                }
            }
        });

        final Button buttonpl = findViewById(R.id.buttonpl);
        buttonpl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                if (!"".equals(dispFieldText)){
                    try {
                        displayValue=Double.parseDouble(dispFieldText);
                        currentResult=displayValue;
                        selectedAction = '+';
                    } catch (NumberFormatException e1) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Пустое поле, операция невозможна", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    } finally {
                        textview.setText("");
                    }
                }
            }
        });

        final Button buttonym = findViewById(R.id.buttonym);
        buttonym.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                if (!"".equals(dispFieldText)){
                    try {
                        displayValue=Double.parseDouble(dispFieldText);
                        currentResult=displayValue;
                        selectedAction = '*';
                    } catch (NumberFormatException e1) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Пустое поле, операция невозможна", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    } finally {
                        textview.setText("");
                    }
                }
            }
        });

        final Button buttondel = findViewById(R.id.buttondel);
        buttondel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                if (!"".equals(dispFieldText)){
                    try {
                        displayValue=Double.parseDouble(dispFieldText);
                        currentResult=displayValue;
                        selectedAction = '/';
                    } catch (NumberFormatException e1) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Пустое поле, операция невозможна", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    }   finally {
                        textview.setText("");

                    }
                }
            }
        });

        final Button buttontch = findViewById(R.id.buttontch);
        buttontch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                dispFieldText = textview.getText().toString();
                textview.setText(dispFieldText+".");
            }
        });

        final Button buttonrv = findViewById(R.id.buttonrv);
        buttonrv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispFieldText = textview.getText().toString();
                try {
                    displayValue = Double.parseDouble(dispFieldText);
                } catch (NumberFormatException e1) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Делим на пустое поле? :)", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    return;
                } finally {
                    textview.setText("");

                }
                if (selectedAction == '+'){
                    currentResult+=displayValue;
                    textview.setText(""+currentResult);
                } else if (selectedAction == '-') {
                    currentResult-=displayValue;
                    textview.setText(""+currentResult);
                } else if (selectedAction == '*') {
                    currentResult*=displayValue;
                    textview.setText(""+currentResult);
                } else if (selectedAction == '/') {
                      if (displayValue == 0) {
                          textview.setText("");
                          selectedAction = ' ';
                          displayValue = 0;
                          currentResult = 0;
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Деление на ноль!", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();

                    }
                    else if (displayValue != 0){
                        currentResult/=displayValue;
                        textview.setText(""+currentResult);
                    }
                }
            }
        });

        final Button buttonclear = findViewById(R.id.buttonclear);
        buttonclear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText("");
                selectedAction = ' ';
            }
        });
    }


}