package com.android.cat.my.app.mycat.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.cat.my.app.mycat.R;
import com.android.cat.my.app.mycat.view.RoundImage;

import java.util.ArrayList;

/**
 * Created by antonina on 07.04.15.
 */
public class CatsListAdapter extends BaseAdapter {
    private ArrayList mArrayList;
    private LayoutInflater layoutInflater;
    private Context mContext;
    private RoundImage roundedImage;
    public CatsListAdapter(ArrayList _array, Context _context) {
        mArrayList = _array;
        mContext   = _context;
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            layoutInflater = LayoutInflater.from(mContext);
            v = layoutInflater.inflate(R.layout.item_cats_list, null);
        }
        ImageView imageViewIcon = (ImageView) v.findViewById(R.id.ivCatIcon_ICL);
        TextView textViewName = (TextView) v.findViewById(R.id.tvCatName_ICL);
        textViewName.setText(mArrayList.get(position).toString());
        Bitmap bm = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.bla);
        roundedImage = new RoundImage(bm);
        imageViewIcon.setImageDrawable(roundedImage);
        return v;
    }

}
