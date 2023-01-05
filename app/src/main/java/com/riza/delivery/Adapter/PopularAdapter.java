package com.riza.delivery.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.riza.delivery.Domain.CategoryDomain;
import com.riza.delivery.Domain.FoodDomain;
import com.riza.delivery.R;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    ArrayList<PopularDomain> categoryDomains;
    private ArrayList<CategoryDomain> PopularDomains;

    public PopularAdapter(ArrayList<FoodDomain> categorylist) {
    }

    public void setCategoryDomains(ArrayList<CategoryDomain> categoryDomains) {
        this.PopularDomains = categoryDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate( R.layout.viewholder_category,parent,false);

        return new PopularAdapter.ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.ViewHolder holder,int position) {
        holder.title.setText(PopularDomains.get(position).getTitle());
        holder.fee.setText(String.valueOf(PopularDomains.get(position).getFee));


        int drawableResourceId=holder.itemView.getContext().getResources()
                .getIdentifier(PopularDomains.get(position).getPic(),"drawable",
                        holder.itemView.getContext().getPackageName());
    }

    @Override
    public int getItemCount() { return categoryDomains.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, fee;
        ImageView pic;
        ImageView addBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            pic = itemView.findViewById(R.id.pic);
            fee = itemView.findViewById(R.id.fee);
            addBtn = itemView.findViewById(R.id.addBtn);
        }
    }
}

