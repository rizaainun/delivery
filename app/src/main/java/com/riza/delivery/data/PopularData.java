package com.riza.delivery.data;

import com.riza.delivery.R;

import java.util.ArrayList;

public class PopularData {
    private static String[] populerName = {
            "Chicken and Cauliflower Rice Bowl",
            "Crispy Baked Honey Garlic Chicken",
            "Instant Pot Spaghetti and Meatballs",
    };

    private static int[] populerImage = {
            R.drawable.food_1,
            R.drawable.food_2,
            R.drawable.food_3
    };

    private static String[] populerfee = {
            "$2.00",
            "$5.00",
            "$1.00",
    };

    public static ArrayList<PopularEntity>getListPopuler(){
        ArrayList<PopularEntity>list = new ArrayList<>();
        for (int position = 0; position < populerName.length; position++){
            PopularEntity popularEntity = new PopularEntity();
            popularEntity.setName(populerName[position]);
            popularEntity.setImage(populerImage[position]);
            popularEntity.setFee(populerfee[position]);
            list.add(popularEntity);
        }
        return list;
    }
}
