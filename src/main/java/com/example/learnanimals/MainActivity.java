package com.example.learnanimals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    public List<listitem> listitem;

    private RecyclerView.Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((getApplicationContext()));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        listitem = new ArrayList<>();
        listitem item1 = new listitem("Cat","Cats are good pets for domestication",R.drawable.cat);
        listitem item2 = new listitem("Cow","Cows are animals suitable for home breeding and have many benefits",R.drawable.cow);
        listitem item3 = new listitem("Dog","Dogs are pets and man's best friend",R.drawable.dog);
        listitem item4 = new listitem("Lion","The lion is a predator and is called the king of the jungle",R.drawable.lionn);
        listitem item5 = new listitem("Sheep","Sheep are animals suitable for home breeding and have a lot of benefits",R.drawable.sheep);
        listitem item6 = new listitem("Horse","The horse is an animal that is suitable for domestic breeding and is used for transportation",R.drawable.horse);
        listitem.add(item1);
        listitem.add(item2);
        listitem.add(item3);
        listitem.add(item4);
        listitem.add(item5);
        listitem.add(item6);

        adapter = new MyAdapter(this,listitem);
        recyclerView.setAdapter(adapter);

    }

}