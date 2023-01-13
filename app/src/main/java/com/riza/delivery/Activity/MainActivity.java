package com.riza.delivery.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.riza.delivery.Adapter.CategoryAdapter;
import com.riza.delivery.Adapter.PopularAdapter;
import com.riza.delivery.Domain.CategoryDomain;
import com.riza.delivery.Domain.FoodDomain;
import com.riza.delivery.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter,adapter2;
private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList=findViewById(R.id.view2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> FoodList = new ArrayList<>();
        FoodList.add(new FoodDomain("Chicken and Cauliflower Rice Bowl","R.drawable.food_1","This is an EXCELLENT quick & healthy dinner idea",13.0,5,20,1000));
        FoodList.add(new FoodDomain("Crispy Baked Honey Garlic Chicken","R.drawable.food_2","Sriracha sauce make the perfect weeknight meal or party appetizer",15.20,4,18,1500));
        FoodList.add(new FoodDomain("Instant Pot Spaghetti and Meatballs","R.drawable.food_3","Simply Happy Foodie",11.0,3,14,800));


    adapter2 = new PopularAdapter(FoodList);
    recyclerViewPopularList.setAdapter(adapter2);

    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.view1);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> CategoryList = new ArrayList<>();
        CategoryList.add(new CategoryDomain("Drink","R.drawable.cat_1"));
        CategoryList.add(new CategoryDomain("Snack","R.drawable.cat_2"));
        CategoryList.add(new CategoryDomain("FastFood","R.drawable.cat_3"));
        CategoryList.add(new CategoryDomain("Dessert","R.drawable.cat_4"));
        CategoryList.add(new CategoryDomain("Donut","R.drawable.cat_5"));

        adapter = new CategoryAdapter(CategoryList);
        recyclerViewCategoryList.setAdapter(adapter);
    }
}