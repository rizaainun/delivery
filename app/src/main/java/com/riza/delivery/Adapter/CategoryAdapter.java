package com.riza.delivery.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.riza.delivery.R;
import com.riza.delivery.data.CategoryEntity;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ListViewHloder> {
    private ArrayList<CategoryEntity> listCategory;

    public CategoryAdapter(ArrayList<CategoryEntity>list) {this.listCategory = list; }

    @NonNull
    @Override
    public CategoryAdapter.ListViewHloder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
       View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.viewholder_category,parent,false);
        return new ListViewHloder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ListViewHloder holder,int position) {
        final CategoryEntity categoryEntity = listCategory
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHloder extends RecyclerView.ViewHolder {
        public ListViewHloder(@NonNull View itemView) {
            super( itemView );
        }
    }
}

