package com.example.srivi.recyclerviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_card );
        setTitle( "Card" );
    }
}
