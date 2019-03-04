package com.example.vikri.hello;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BasketAdapter extends RecyclerView.Adapter<BasketAdapter.ViewHolder> {

    private Context context;
    private ArrayList<BasketModel> basketModels;

    public BasketAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<BasketModel> getBasketList () {
        return basketModels;
    }

    public void setBasketModels (ArrayList<BasketModel> basketModels) {
        this.basketModels = basketModels;
    }
    @NonNull
    @Override
    public BasketAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_basket,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull BasketAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getBasketList().get(i).getLambangTeam()).into(viewHolder.ivLambangTeam);
        viewHolder.tvNamaTeam.setText(getBasketList().get(i).getNamaTeam());
    }

    @Override
    public int getItemCount() {
        return getBasketList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivLambangTeam ;
        private TextView tvNamaTeam;
        public ViewHolder (@NonNull View itemView){
            super(itemView);
            ivLambangTeam = itemView.findViewById(R.id.lambang);
            tvNamaTeam = itemView.findViewById(R.id.namateam);
        }
    }
}
