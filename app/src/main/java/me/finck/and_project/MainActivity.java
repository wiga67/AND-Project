package me.finck.and_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnOffline;
    Button btnOnline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOffline = findViewById(R.id.btn_gooffline);
        btnOnline = findViewById(R.id.btn_login);
        btnOffline.setOnClickListener(v->
                                            {
                                                Context context = getApplicationContext();
                                                Class destination = OfflineModeActivity.class;
                                                Intent intent = new Intent(context, destination);
                                                startActivity(intent);
                                            });
        btnOnline.setOnClickListener(v->
        {
            Context context = getApplicationContext();
            Class destination = OnlineModeActivity.class;
            Intent intent = new Intent(context, destination);
            startActivity(intent);
        });
    }
}