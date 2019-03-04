package com.example.vikri.hello;

import java.util.ArrayList;

public class BasketData {
    private static String[] title = new String[] {"Spurs","sixers","Bulls","Lakers","Thunder","Warriors","Dallas","hornets","Celtic"};

    private static int[] thumbnail = new int[]{R.drawable.spurs,R.drawable.sixers,R.drawable.bulls,
            R.drawable.lakers,R.drawable.thunder,R.drawable.warriors,R.drawable.dallas,R.drawable.hornets,R.drawable.celtic};
    public static ArrayList<BasketModel>getListData (){
        BasketModel basketmodel = null ;
        ArrayList<BasketModel> list = new ArrayList<>();
        for(int i =0 ; i <title.length;i++){
            basketmodel = new BasketModel();
            basketmodel.setLambangTeam(thumbnail[i]);
            basketmodel.setNamaTeam(title[i]);
            list.add(basketmodel);
        }
        return list;
    }
}
