package com.restaurant.juandavid.cartavirtualj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Menu extends Activity {

    public static int productSelected = 0;

    private String[] menu = new String[]{"Entradas", "Platos Fuertes", "Bebidas", "Postres"};

    private ListView listView = null;
    private ListAdapter listAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView = (ListView) findViewById(R.id.listViewMenu);
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        productSelected = 1;
                        break;
                    case 1:
                        productSelected = 2;
                        break;
                    case 2:
                        productSelected = 3;
                        break;
                    case 3:
                        productSelected = 4;
                    default:
                        break;
                }
                Intent intent = new Intent(Menu.this, DetailedMenu.class);
                startActivity(intent);
            }
        });
    }
}
