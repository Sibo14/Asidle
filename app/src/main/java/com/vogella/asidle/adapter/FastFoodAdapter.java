package com.vogella.asidle.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vogella.asidle.R;
import com.vogella.asidle.model.FastFood;

import java.util.List;

    public class FastFoodAdapter extends RecyclerView.Adapter<FastFoodAdapter.FastFoodViewHolder> {

        Context context;
        List<FastFood> fastFoodList;

        public FastFoodAdapter (Context context, List<FastFood> fastFoodList) {
            this.context = context;
            this.fastFoodList = fastFoodList;
        }

        @NonNull
        @Override
        public FastFoodAdapter.FastFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.fast_food_row_item,parent,false);
            return new FastFoodViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull FastFoodAdapter.FastFoodViewHolder holder, int position) {

            holder.foodImage.setImageResource(fastFoodList.get(position).getImageUrl());
            holder.name.setText(fastFoodList.get(position).getName());
            holder.price.setText(fastFoodList.get(position).getPrice());
            holder.rating.setText(fastFoodList.get(position).getRating());
            holder.restaurant.setText(fastFoodList.get(position).getResturantname());
        }

        @Override
        public int getItemCount() {
            return fastFoodList.size();
        }

        public static class FastFoodViewHolder extends RecyclerView.ViewHolder{

            ImageView foodImage;
            TextView name,price,rating, restaurant;

            public FastFoodViewHolder(@NonNull View itemView) {
                super(itemView);

                foodImage = itemView.findViewById(R.id.food_images);
                name = itemView.findViewById(R.id.name);
                price = itemView.findViewById(R.id.price);
                restaurant = itemView.findViewById(R.id.restaurantname);
                rating = itemView.findViewById(R.id.rating);


            }
        }
    }


