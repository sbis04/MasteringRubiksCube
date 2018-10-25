package com.appstar.souvik_biswas.rubikscube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection);

        TextView basicTextView = findViewById(R.id.basic_text);
        basicTextView.setText("BASIC METHOD"+"\n(recommended for beginners)");
        basicTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent basicIntent = new Intent (SelectionActivity.this,BasicActivity.class);
                startActivity(basicIntent);
            }
        });

        TextView fridrichTextView = findViewById(R.id.fridrich_text);
        fridrichTextView.setText("FRIDRICH METHOD"+"\n(advanced faster method)  ");
        fridrichTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fridrichIntent = new Intent(SelectionActivity.this,FridrichActivity.class);
                startActivity(fridrichIntent);
            }
        });
    }



}