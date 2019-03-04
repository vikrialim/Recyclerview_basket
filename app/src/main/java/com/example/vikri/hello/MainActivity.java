package com.example.vikri.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTeam;
    private ArrayList<BasketModel> listTeam = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv_team_list);
        rvTeam.setHasFixedSize(true);
        listTeam.addAll(BasketData.getListData());

        showRecyclerList();
    }
    private void showRecyclerList(){
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        BasketAdapter basketAdapter = new BasketAdapter(this);
        rvTeam.setAdapter(basketAdapter);
    }
}
