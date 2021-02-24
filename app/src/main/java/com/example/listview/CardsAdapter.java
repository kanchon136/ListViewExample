package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CardsAdapter extends ArrayAdapter {
    public CardsAdapter(@NonNull Context context) {
        super(context, R.layout.card_view);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder  viewHolder;
        if(convertView ==null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.card_view, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        CardModel model = (CardModel) getItem(position);
        viewHolder.imageView.setImageResource(model.getImageId());
        viewHolder.tvTitle.setText(model.getTitle());
        viewHolder.tvSubtitle.setText(model.getSubTitle());
        return convertView;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView tvTitle;
        TextView tvSubtitle;
        ViewHolder(View view){
            imageView = view.findViewById(R.id.image);
            tvTitle = view.findViewById(R.id.title);
            tvSubtitle = view.findViewById(R.id.sub_title);
        }
    }
}
