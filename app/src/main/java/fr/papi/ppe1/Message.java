package fr.papi.ppe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Message extends AppCompatActivity {

    TextView messageAafficher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        messageAafficher = findViewById(R.id.reception);

        Intent unIntent = getIntent();
        String monMessageRecup = unIntent.getStringExtra(MainActivity.MESSAGE_PASSER);


    }
}