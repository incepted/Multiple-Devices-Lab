package com.example.envy.multiple_devices_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CardListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);

        ListView listView = (ListView) findViewById(R.id.list_items);
        ArrayList<String> arrayListItems = new ArrayList<String>();
        arrayListItems.add("BMW M3");
        arrayListItems.add("BMW M3 GTR");
        arrayListItems.add("BMW M4");
        arrayListItems.add("BMW Z4");
        arrayListItems.add("BMW 335i");
        arrayListItems.add("BMW Z8");
        arrayListItems.add("BMW M6 GT3");

        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,arrayListItems);

        listView.setAdapter(mArrayAdapter);

        CardView cardView = (CardView)findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardListActivity.this, Calendar.class);
                startActivity(intent);
            }
        });

    }
}
