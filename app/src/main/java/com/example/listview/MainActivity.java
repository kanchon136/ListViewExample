package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_cards);
        CardsAdapter adapter = new CardsAdapter(this);
        listView.setAdapter(adapter);
        adapter.addAll(new CardModel(R.drawable.bg,"Nature", "Beautiful")
        , new CardModel(R.drawable.bg, "good", "Bery Bad"));


    }
}