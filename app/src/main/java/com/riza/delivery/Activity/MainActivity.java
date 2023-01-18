package com.riza.delivery.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.riza.delivery.Adapter.CategoryAdapter;
import com.riza.delivery.Adapter.PopularAdapter;
import com.riza.delivery.R;
import com.riza.delivery.data.CategoryEntity;
import com.riza.delivery.data.PopularEntity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private RecyclerView rvPopular;
    private ArrayList<PopularEntity>listPopular = new ArrayList<>();
    private ArrayList<CategoryEntity>listCategory = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.recyclerView2);
        rvCategory.setHasFixedSize(true);

        rvPopular = findViewById(R.id.recyclerView);
        rvPopular.setHasFixedSize(true);

        recyclerViewCategory();
        recyclerViewPopular();
    }


    private void recyclerViewCategory() {
        rvCategory.setLayoutManager( new LinearLayoutManager( this,LinearLayoutManager.HORIZONTAL,false ));
        CategoryAdapter categoryAdapter = new CategoryAdapter( listCategory );
        rvCategory.setAdapter( categoryAdapter );
    }
    private void recyclerViewPopular() {
        rvPopular.setLayoutManager( new LinearLayoutManager( this,LinearLayoutManager.HORIZONTAL,false ));
        PopularAdapter popularAdapter = new PopularAdapter( listPopular );
        rvPopular.setAdapter( popularAdapter );
    }
}




