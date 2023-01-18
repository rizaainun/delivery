package com.riza.delivery.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.riza.delivery.Activity.ShowDetailActivity;
import com.riza.delivery.Domain.CategoryDomain;
import com.riza.delivery.Domain.FoodDomain;
import com.riza.delivery.R;
import com.riza.delivery.data.PopularEntity;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ListViewHolder> {
    private ArrayList<PopularEntity> listPopular;

    public PopularAdapter(ArrayList<PopularEntity>list) { this.listPopular = list; }

    @NonNull
    @Override
    public PopularAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.ListViewHolder holder, int position) {
        final PopularEntity popularEntity = listPopular.get(position);
        Glide.with(holder.itemView.getContext())
                .load(popularEntity.getImage())
                .into(holder.imgPopuler);
        holder.tvName.setText(popularEntity.getName());
        holder.tvfee.setText(popularEntity.getFee());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(holder.itemView.getContext(), ShowDetailActivity.class);
                intent.putExtra("POPULAR",popularEntity);
                holder.itemView.getContext().startActivity(intent);
            }

        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

     class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPopuler;
        TextView tvName,tvfee;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPopuler = itemView.findViewById(R.id.pic);
            tvName = itemView.findViewById(R.id.title);
            tvfee = itemView.findViewById(R.id.fee);
        }
    }
}