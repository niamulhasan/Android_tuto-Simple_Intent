package me.niamulhasan.tutorial.passingdatafromoneactivitytoanotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Adding an extra message
    public static final String EXTRA_MESSAGE = "me.niamulhasan.tutorial.passingdatafromoneactivitytoanotheractivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Call method is called when user tap this button
    //It is linked to the button in the xml file
    public void sendMessage(View view){
        //Intent is used to pass data and other things between activies
        Intent intent = new Intent(this, DisplayMessageActivity.class);         //Linking 'this' activity with 'DisplayMessageActivity.class' activity
        EditText editText = (EditText) findViewById(R.id.editText);                          //setting the variable for the Edit text form input
        String message = editText.getText().toString();                                      //Getting the text from the form, convert it to string and putting it in the message variable
        intent.putExtra(EXTRA_MESSAGE, message);                                             //Passing the data in the intent. First param is the key of data, second param is the data
        startActivity(intent);                                                               //Staring the new activity
    }
}
