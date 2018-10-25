package com.appstar.souvik_biswas.rubikscube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FridrichActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        final ArrayList<Menu> menus = new ArrayList<>();

        menus.add(new Menu("Stage 1", "Solving The Cross (C)", R.drawable.stage_2, R.color.stage_1));
        menus.add(new Menu("Stage 2", "Solving First Two Layers (F2L)", R.drawable.stage_4, R.color.stage_2));
        menus.add(new Menu("Stage 3", "Orienting Last Layer (O)", R.drawable.stage_6, R.color.stage_3));
        menus.add(new Menu("Stage 4", "Permuting Last Layer (P)", R.drawable.cfop_pll, R.color.stage_4));
        MenuAdapter adapter = new MenuAdapter(this, menus);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position +1) {
                    case 1:
                        Intent intent = new Intent(FridrichActivity.this, CrossActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(FridrichActivity.this, F2lActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(FridrichActivity.this, OllActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(FridrichActivity.this, PllActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
