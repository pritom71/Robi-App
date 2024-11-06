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

public class RecyclerViewShop2 extends RecyclerView.Adapter<RecyclerViewShop2.ViewHolder> {


    private ArrayList<String> ImageNames2 ;

    public RecyclerViewShop2(Context context, ArrayList<String> imageUrls, ArrayList<String> names, ArrayList<String> prices, ArrayList<String> discounts) {
        ImageNames2 = names;
        Images2 = imageUrls;
        Price2 = prices;
        Dis2 = discounts;
        mcontext2 = context;
    }

    private ArrayList<String> Images2;
    private ArrayList<String> Price2;
    private ArrayList<String> Dis2;
    private Context mcontext2;

    @NonNull
    @Override
    public RecyclerViewShop2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_phone_hd, parent, false);
        RecyclerViewShop2.ViewHolder holder = new ViewHolder(view);
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
    public void onBindViewHolder(@NonNull RecyclerViewShop2.ViewHolder holder, int position) {
        holder.imageName2.setText(ImageNames2.get(position));
        holder.dis2.setText(Dis2.get(position));
        holder.price2.setText(Price2.get(position));

        Glide.with(mcontext2)
                .asBitmap()
                .load(Images2.get(position))
                .into(holder.image2);
    }
    @Override
    public int getItemCount() {
        return Math.min(Math.min(Dis2.size(), ImageNames2.size()), Price2.size());
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image2;
        TextView imageName2;
        TextView dis2;
        TextView price2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image2 = itemView.findViewById(R.id.card_view_shop);
            imageName2 = itemView.findViewById(R.id.tv_shop1_name);
            price2 = itemView.findViewById(R.id.tv_shop1_price);
            dis2 = itemView.findViewById(R.id.tv_shop1_discount);
        }
        //RelativeLayout parentLayout;

    }
}
