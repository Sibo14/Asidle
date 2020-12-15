package com.vogella.asidle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.vogella.asidle.adapter.PopularFoodAdapter;
import com.vogella.asidle.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Pizza", "R85.00",R.drawable.pizza));
        popularFoodList.add(new PopularFood("Lasagna", "R100.00",R.drawable.lasagna));
        popularFoodList.add(new PopularFood("Nachos", "R135.00",R.drawable.nachos));
        popularFoodList.add(new PopularFood("Burger", "R60.00",R.drawable.burger));
        popularFoodList.add(new PopularFood("Ribs", "R120.00",R.drawable.ribs));
        popularFoodList.add(new PopularFood("Wings", "R55.00",R.drawable.wings));
        popularFoodList.add(new PopularFood("Fish & Chips", "R85.00",R.drawable.fish));

        setPopularRecycler(popularFoodList);
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList){

        popularRecycler = findViewById(R.id.popular_rcycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this,popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }
}