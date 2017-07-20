package com.rellis.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Create the random number
    Random rand = new Random();
    int number = rand.nextInt(20) + 1;


    public void getGuessNumber(View view){

        EditText guessEditText = (EditText) findViewById(R.id.guessText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (number < guessInt) {
            Toast.makeText(MainActivity.this, "Lower" Toast.LENGTH_SHORT).show();
        } else if (number > guessInt) {
            Toast.makeText(MainActivity.this, "Higher" Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "I guess you did a good job...Your Mom would probably be proud of you, but I'm not so...", Toast.LENGTH_LONG).show();

            Random rand = new Random();
            number =rand.nextInt(20) + 1;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(MainActivity.this, number, Toast.LENGTH_LONG).show();


    }
}
