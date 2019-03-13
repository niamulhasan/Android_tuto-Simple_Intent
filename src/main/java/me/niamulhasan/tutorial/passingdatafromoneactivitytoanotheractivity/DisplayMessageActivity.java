package me.niamulhasan.tutorial.passingdatafromoneactivitytoanotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Getting the intent passed from MainActivity
        Intent intent = getIntent();                                            //Getting the intent passed from the previous activity
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);     //Extracting the message with key "EXTRA_MESSAGE" from the intent of MainActivity

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}
