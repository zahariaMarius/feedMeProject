package it.itspiemonte.feedmeproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void bottonClickFunction (View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }



}
