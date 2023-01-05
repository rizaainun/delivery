package com.riza.delivery.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.riza.delivery.Adaptor.CategoryAdaptor;
import com.riza.delivery.Domain.CategoryDomain;
import com.riza.delivery.Domain.FoodDomain;
import com.riza.delivery.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Drink","R.drawable.cat_1"));
        category.add(new CategoryDomain("Snack","R.drawable.cat_2"));
        category.add(new CategoryDomain("FastFood","R.drawable.cat_3"));
        category.add(new CategoryDomain("Dessert","R.drawable.cat_4"));
        category.add(new CategoryDomain("Donut","R.drawable.cat_5"));

        adapter=new CategoryAdaptor(category);
           recyclerViewCategoryList.setAdapter(adapter);
    }
    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("R.drawable.food_1","Chicken and Cauliflower"));
        foodList.add(new FoodDomain("R.drawable.food_2","Crispy Baked Honey"));
        foodList.add(new FoodDomain("R.drawable.food_3","Instant Pot Spaghetti"));

        adapter2=new PopularAdaptor(foodList);
        recyclerViewPopularList.setAdapter(adapter2);
    }
}
