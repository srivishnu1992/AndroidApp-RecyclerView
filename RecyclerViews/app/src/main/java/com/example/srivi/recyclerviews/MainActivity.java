package com.example.srivi.recyclerviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ArrayList<Email> emailArrayList = new ArrayList<>(  );
        emailArrayList.add(new Email("Summary1", "Sender1", "Subject1"));
        emailArrayList.add(new Email("Summary2", "Sender2", "Subject2"));
        emailArrayList.add(new Email("Summary3", "Sender3", "Subject3"));
        recyclerView = findViewById( R.id.recyclerView );
        recyclerView.setHasFixedSize( true );
        layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager( layoutManager );
        adapter = new EmailAdapter( MainActivity.this, emailArrayList );
        recyclerView.setAdapter( adapter );
    }
}
