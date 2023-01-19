package com.riza.delivery.data;

import com.riza.delivery.R;

import java.util.ArrayList;

public class PopularData {
    private static final String[] popularName = {
            "Chicken and Cauliflower Rice Bowl",
            "Crispy Baked Honey Garlic Chicken",
            "Instant Pot Spaghetti and Meatballs",
    };

    private static final int[] popularImage = {
            R.drawable.food_1,
            R.drawable.food_2,
            R.drawable.food_3,
    };

    private static final String[] popularFee = {
            "$2.00",
            "$5.00",
            "$1.00",
    };

    public static ArrayList<PopularEntity>getListPopuler(){
        ArrayList<PopularEntity>list = new ArrayList<>();
        for (int position = 0; position < popularName.length; position++){
            PopularEntity popularEntity = new PopularEntity();
            popularEntity.setName(popularName[position]);
            popularEntity.setImage(popularImage[position]);
            popularEntity.setFee( popularFee[position]);
            list.add(popularEntity);
        }
        return list;
    }
}
