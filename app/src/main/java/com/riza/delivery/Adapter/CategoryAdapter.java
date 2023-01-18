package com.riza.delivery.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
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
        final CategoryEntity categoryEntity = listCategory.get(position);
        Glide.with( holder.itemView.getContext() )
                .load( categoryEntity.getImage() )
                .into( holder.imgPic );
        holder.tvName.setText( categoryEntity.getName() );

//        holder.itemView.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(holder.itemView.getContext(),DetailActivity)
//            }
//        } );
    }

    @Override
    public int getItemCount() {
        return listCategory.size();
    }

    class ListViewHloder extends RecyclerView.ViewHolder {
        ImageView imgPic;
        TextView tvName;
        public ListViewHloder(@NonNull View itemView) {
            super( itemView );
            imgPic = itemView.findViewById(R.id.categoryPic);
            tvName = itemView.findViewById(R.id.categoryName);
        }
    }
}

