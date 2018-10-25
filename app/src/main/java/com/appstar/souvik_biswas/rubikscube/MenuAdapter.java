package com.appstar.souvik_biswas.rubikscube;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends ArrayAdapter<Menu> {

    public MenuAdapter(Activity context, ArrayList<Menu> menus) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, menus);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.menu_item, parent, false);
        }

        Menu currentMenu = getItem(position);

        TextView stageTextView = listItemView.findViewById(R.id.stage_text_view);
        stageTextView.setText(currentMenu.getStage());

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentMenu.getName());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentMenu.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),currentMenu.getColorResourceId());
        textContainer.setBackgroundColor(color);

        // Returns the whole list (containing 2 TextView)
        return listItemView;
    }
}
