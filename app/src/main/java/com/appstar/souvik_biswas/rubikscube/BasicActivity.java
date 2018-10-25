package com.appstar.souvik_biswas.rubikscube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BasicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        final ArrayList<Menu> menus = new ArrayList<>();

        menus.add(new Menu("Stage 1", "Know Your Cube", R.drawable.stage_1, R.color.stage_1));
        menus.add(new Menu("Stage 2", "The White Cross", R.drawable.stage_2, R.color.stage_2));
        menus.add(new Menu("Stage 3", "The White Corners", R.drawable.stage_3, R.color.stage_3));
        menus.add(new Menu("Stage 4", "The Middle Layer", R.drawable.stage_4, R.color.stage_4));
        menus.add(new Menu("Stage 5", "The Yellow Face", R.drawable.stage_5, R.color.stage_5));
        menus.add(new Menu("Stage 6", "The Yellow Corners and Edges", R.drawable.stage_6, R.color.stage_6));

        MenuAdapter adapter = new MenuAdapter(this, menus);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position +1) {
                    case 1:
                        Intent intent = new Intent(BasicActivity.this, KnowYourCubeActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(BasicActivity.this, WhiteCrossActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(BasicActivity.this, WhiteCornerActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(BasicActivity.this, MiddleLayerActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(BasicActivity.this, YellowFaceOneActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(BasicActivity.this, YellowCornerOneActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

