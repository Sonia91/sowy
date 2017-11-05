package com.sonja.sowy;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DescriptionAdapter extends ArrayAdapter<Description> {

    private int mColorResourceId;

    public DescriptionAdapter(Context context, ArrayList<Description> descriptions, int colorResourceId) {
        super(context, 0, descriptions);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.description_item, parent, false);
        }


        Description currentDescription = getItem(position);
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentDescription.getDescriptionId());


        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentDescription.getTitleId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentDescription.hasImage()) {
            imageView.setImageResource(currentDescription.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
