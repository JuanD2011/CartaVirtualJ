package com.restaurant.juandavid.cartavirtualj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<Product> products;

    public Adapter(Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Product product = (Product) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.product, null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        TextView textName = (TextView) convertView.findViewById(R.id.name);
        TextView textCost = (TextView) convertView.findViewById(R.id.cost);

        imageView.setImageResource(product.getProductImage());
        textName.setText(product.getProductName());
        textCost.setText(product.getProductCost());

        return convertView;
    }
}
