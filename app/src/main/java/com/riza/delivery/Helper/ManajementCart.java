package com.riza.delivery.Helper;

import android.content.Context;
import android.widget.Toast;

import com.riza.delivery.Domain.FoodDomain;
import com.riza.delivery.InterFace.ChageNumberitemsListener;

import java.util.ArrayList;

public class ManajementCart {
    private Context context;
    private TinyDB tinyDB;

    public ManajementCart(Context context, TinyDB tinyDB) {
        this.context = context;
        this.tinyDB = tinyDB;
    }
    public void insertFood(FoodDomain item){
        ArrayList<FoodDomain> listFood=getListCart();
        boolean exisAlready=false;
        int n=0;
        for (int i = 0; i < listFood.size(); i++){
            if(listFood.get(i).getTitle().equals(item.getTitle())){
                exisAlready=true;
                n=i;
                break;
            }
        }

        if(exisAlready) {
            listFood.get(n).setNumberInCart(item.getNumberInCart());
        }else {
            listFood.add(item);
        }

        tinyDB.putListObject( "CardList",listFood);
        Toast.makeText(context, "Added to you  cart", Toast.LENGTH_SHORT).show();
    }

    private ArrayList<FoodDomain> getListCart() {
        return tinyDB.getListObject("CardList");
    }

    public void minusNumberFood(ArrayList<FoodDomain> listfood, int possition, ChageNumberitemsListener chageNumberitemsListener) {
        if (listfood.get(possition).getNumberInCart() == 1) {
            listfood.remove(possition);
        } else {
            listfood.get(possition).setNumberInCart(listfood.get(possition).getNumberInCart() - 1);
        }
        tinyDB.putListObject("CardList", listfood);
        chageNumberitemsListener.changed();
    }
    public void plusNumberFood(ArrayList<FoodDomain> listfood, int postion, ChageNumberitemsListener chageNumberitemsListener) {
        listfood.get(postion).setNumberInCart(listfood.get(postion).getNumberInCart() + 1);
        tinyDB.putListObject("CardList", listfood);
        chageNumberitemsListener.changed();
    }

    public Double getTotalFee() {
        ArrayList<FoodDomain> listfood2 = getListCart();
        double fee = 0;
        for (int i = 0; i < listfood2.size(); i++) {
            fee = fee + (listfood2.get(i).getFee() * listfood2.get(i).getNumberInCart());
        }
        return fee;
    }

}

