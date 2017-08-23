package com.example.thagadur.android_session8_assignment3;

import android.content.Context;
import android.text.NoCopySpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Thagadur on 8/19/2017.
 */

public class ImageAdapter extends BaseAdapter {
    //1.Intialize and declare the variables
    private Context context;
    int[] imageId;
    private static LayoutInflater inflater = null;

    //2.call the constructor method of custom adapter
    public ImageAdapter(MainActivity mainActivity, int[] versrionImagesId) {
        context = mainActivity;
        imageId = versrionImagesId;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return imageId.length;
    }

    @Override

    public Object getItem(int i) {
        return imageId[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    //3.Decalew a holder class for one view in gridview
    public class Holder {
        ImageView img;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Holder holder = new Holder();
        View rootView;
        rootView = inflater.inflate(R.layout.version_list, null);
        //4.set the id for holders
        holder.img = (ImageView) rootView.findViewById(R.id.imageView1);
        //5.set the values for image view
        holder.img.setImageResource(imageId[i]);
        return rootView;
    }
}
