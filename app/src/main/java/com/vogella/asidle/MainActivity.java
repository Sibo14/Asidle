package com.vogella.asidle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.vogella.asidle.adapter.FastFoodAdapter;
import com.vogella.asidle.adapter.PopularFoodAdapter;
import com.vogella.asidle.model.FastFood;
import com.vogella.asidle.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler,fastFoodRecycler;
    PopularFoodAdapter popularFoodAdapter;
    FastFoodAdapter fastFoodAdapter;
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

        List<FastFood> fastFoodList = new ArrayList<>();
        fastFoodList.add(new FastFood("Wacky Wednesday","R50.00",R.drawable.steers,"4.5","Steers"));
        fastFoodList.add(new FastFood("Boxmaster","R65.00",R.drawable.boxmaster,"4.0","KFC"));
        fastFoodList.add(new FastFood("Full Chicken","R185.00",R.drawable.nandos,"4.8","Nandos"));
        fastFoodList.add(new FastFood("Big Mac","R55.00",R.drawable.big_mac,"4.0","McDonald's"));
        setFastfoodRecycler(fastFoodList);
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList){

        popularRecycler = findViewById(R.id.popular_rcycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this,popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setFastfoodRecycler(List<FastFood> fastFoodList){

        fastFoodRecycler = findViewById(R.id.fast_food_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        fastFoodRecycler.setLayoutManager(layoutManager);
        fastFoodAdapter = new FastFoodAdapter(this,fastFoodList);
        fastFoodRecycler.setAdapter(fastFoodAdapter);
    }
}