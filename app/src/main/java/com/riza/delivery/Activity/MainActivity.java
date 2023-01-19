package com.riza.delivery.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.riza.delivery.Adapter.CategoryAdapter;
import com.riza.delivery.Adapter.PopularAdapter;
import com.riza.delivery.R;
import com.riza.delivery.data.CategoryData;
import com.riza.delivery.data.CategoryEntity;
import com.riza.delivery.data.PopularData;
import com.riza.delivery.data.PopularEntity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private RecyclerView rvPopular;
    private ArrayList<PopularEntity>listPopular = new ArrayList<>();
    private ArrayList<CategoryEntity>listCategory = new ArrayList<>();
    private ArrayList<PopularEntity>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rvCategory = findViewById(R.id.recyclerView2);
        rvCategory.setHasFixedSize(true);
        listCategory.addAll( CategoryData.getListCategory() );

        rvPopular = findViewById(R.id.recyclerView);
        rvPopular.setHasFixedSize(true);
        listPopular.addAll( PopularData.getListPopuler() );

        recyclerViewCategory();
        recyclerViewPopular();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState( outState );
        if (rvPopular.getVisibility() == View.VISIBLE){
            outState.putBoolean( "reply_visible", true );
        }
    }

    private void showRecyclerList(){
        rvPopular.setLayoutManager( new LinearLayoutManager( (this) ) );
        PopularAdapter popularAdapter = new PopularAdapter( list );
        rvPopular.setAdapter( popularAdapter );
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




