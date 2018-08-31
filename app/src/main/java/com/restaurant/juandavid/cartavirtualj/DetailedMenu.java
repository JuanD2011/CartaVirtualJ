package com.restaurant.juandavid.cartavirtualj;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailedMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_menu);

        ListView listView = (ListView) findViewById(R.id.listView);
        Adapter adapter = new Adapter(this, GetProducts());
        listView.setAdapter(adapter);
    }

    private ArrayList<Product> GetProducts(){

        ArrayList<Product> products = new ArrayList<>();

        switch (Menu.productSelected) {
            case 1:
                products.add(new Product(R.drawable.empanadas, "Empanadas", "$5900"));
                products.add(new Product(R.drawable.patacones, "Patacones", "$6900"));
                break;
            case 2:
                products.add(new Product(R.drawable.bandeja_paisa, "Bandeja Paisa", "$ 20500"));
                products.add(new Product(R.drawable.mondongo, "Mondongo", "$ 18000"));
                products.add(new Product(R.drawable.ajiaco, "Ajiaco", "$ 16500"));
                products.add(new Product(R.drawable.hamburguesa, "Hamburguesa", "$ 19900"));
                break;
            case 3:
                products.add(new Product(R.drawable.gaseosas, "Gaseosas", "$2900"));
                products.add(new Product(R.drawable.limonada, "Limonada", "$4900"));
                products.add(new Product(R.drawable.jugos, "Jugos", "$3900"));
                break;
            case 4:
                products.add(new Product(R.drawable.cheesecake, "Cheesecake Limón", "$8900"));
                products.add(new Product(R.drawable.torta, "Torta Chocolate", "$5900"));
                products.add(new Product(R.drawable.tiramisu, "Tiramisú", "$9900"));
                products.add(new Product(R.drawable.napo, "Napoleón", "$7900"));
        }
        return products;
    }
}
