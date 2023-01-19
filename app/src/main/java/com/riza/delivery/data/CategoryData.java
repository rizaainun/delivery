package com.riza.delivery.data;

import com.riza.delivery.R;

import java.util.ArrayList;

public class CategoryData {
    private static String[] categoryName = {
            "Drink",
            "Snack",
            "Fast food",
            "Dessert",
            "Donut"
    };

    private static int[] categoryImage = {
            R.drawable.cat_1,
            R.drawable.cat_2,
            R.drawable.cat_3,
            R.drawable.cat_4,
            R.drawable.cat_5,
    };

    public static ArrayList<CategoryEntity>getListCategory(){
        ArrayList<CategoryEntity>list = new ArrayList<>();
        for (int position = 0; position < categoryName.length; position++){
            CategoryEntity categoryEntity = new CategoryEntity();
            categoryEntity.setName(categoryName[position]);
            categoryEntity.setImage(categoryImage[position]);
            list.add(categoryEntity);
        }
        return list;
    }
}
