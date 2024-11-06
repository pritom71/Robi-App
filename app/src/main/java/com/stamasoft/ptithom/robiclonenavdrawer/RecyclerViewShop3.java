package com.stamasoft.ptithom.robiclonenavdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewShop3 extends RecyclerView.Adapter<RecyclerViewShop3.ViewHolder> {

//Product
    private ArrayList<String> ImageNames3 ;

    public RecyclerViewShop3(Context context, ArrayList<String> imageUrls, ArrayList<String> names, ArrayList<String> prices, ArrayList<String> discounts) {
        ImageNames3 = names;
        Images3 = imageUrls;
        Price3 = prices;
        Dis3 = discounts;
        mcontext3 = context;
    }

    private ArrayList<String> Images3;
    private ArrayList<String> Price3;
    private ArrayList<String> Dis3;
    private Context mcontext3;

    @NonNull
    @Override
    public RecyclerViewShop3.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_design_shop, parent, false);
        RecyclerViewShop3.ViewHolder holder = new ViewHolder(view);
        return holder;
    }
  /*  public RecyclerViewShop2(Context context, ArrayList<String> imageUrls, ArrayList<String> names, ArrayList<String> prices, ArrayList<String> discounts) {
        ImageNames2 = names;
        Images2 = imageUrls;
        Price2 = prices;
        Dis2 = discounts;
        mcontext2 = context;
    }*/
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewShop3.ViewHolder holder, int position) {
        holder.imageName3.setText(ImageNames3.get(position));
        holder.dis3.setText(Dis3.get(position));
        holder.price3.setText(Price3.get(position));

        Glide.with(mcontext3)
                .asBitmap()
                .load(Images3.get(position))
                .into(holder.image3);
    }
    @Override
    public int getItemCount() {
        return Math.min(Math.min(Dis3.size(), ImageNames3.size()), Price3.size());
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image3;
        TextView imageName3;
        TextView dis3;
        TextView price3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image3 = itemView.findViewById(R.id.card_view_shop);
            imageName3 = itemView.findViewById(R.id.tv_shop1_name);
            price3 = itemView.findViewById(R.id.tv_shop1_price);
            dis3 = itemView.findViewById(R.id.tv_shop1_discount);
        }
        //RelativeLayout parentLayout;

    }
}
