package com.pace.cs639spring.hw2.cs639springhw2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by kachi on 2/7/18.
 */

public class AnimalDisplayListViewAdapter extends BaseAdapter {


    Context mContext;
    List<ListViewObject> mExamples;


    AnimalDisplayListViewAdapter(Context context, List<ListViewObject> exampleObjectList) {
        mContext = context;
        mExamples = exampleObjectList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.custom_rows, null);
            ViewHolder viewHolder = new ViewHolder((ImageView) convertView.findViewById(R.id.imageView),
                    (TextView) convertView.findViewById(R.id.textView),(Button)convertView.findViewById(R.id.nextBtn),(Button)convertView.findViewById(R.id.deleteBtn),(Button)convertView.findViewById(R.id.addBtn));
            convertView.setTag(viewHolder);
        }

        final ListViewObject object = (ListViewObject) getItem(position);
        final ViewHolder viewHolder = (ViewHolder) convertView.getTag();

        //viewHolder.mImageView.setBackgroundColor(object.mImage);
        viewHolder.mImageView.setBackgroundResource(object.mImage);
        viewHolder.mTextView.setText(object.mNames.get(object.position));
       // viewHolder.mTextView.setText(object.name);
        /*if(!object.isSelectedForadd()) {

        }*/


        if(object.isSelected()){
            viewHolder.mTextView.setVisibility(View.VISIBLE);
            viewHolder.deleteBtn.setVisibility(View.VISIBLE);
            viewHolder.nextBtn.setVisibility(View.VISIBLE);
        }else{
            viewHolder.mTextView.setVisibility(View.INVISIBLE);
            viewHolder.deleteBtn.setVisibility(View.INVISIBLE);
            viewHolder.nextBtn.setVisibility(View.INVISIBLE);
        }

        viewHolder.nextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                if(object.position<object.mNames.size()){
                    Toast.makeText(mContext,"Next Button Clicked at"+object.position,Toast.LENGTH_LONG).show();
                    object.position=object.position+1;
                    viewHolder.mTextView.setText(object.mNames.get(object.position));
                }else{
                    Toast.makeText(mContext,"Only one item in list"+object.position,Toast.LENGTH_LONG).show();
                }
            }

        });

        viewHolder.deleteBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(object.position == 0){
                    Toast.makeText(mContext,"Cannot delete from List,Only one item present"+object.position,Toast.LENGTH_LONG).show();
                }
                object.mNames.remove(object.position);
                viewHolder.mTextView.setText(object.mNames.get(object.position-1));
                Toast.makeText(mContext,"Deleted"+object.position,Toast.LENGTH_LONG).show();
            }

        });


        final ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        imageView.setTag(new Integer(position));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "ImageView clicked for the row = "+view.getTag().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    @Override
    public int getCount() {
        return mExamples.size();
    }

    @Override
    public Object getItem(int position) {
        return mExamples.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        ImageView mImageView;
        TextView mTextView;
        Button nextBtn;
        Button deleteBtn;
        Button addBtn;

        ViewHolder(ImageView imageView, TextView textView, Button nexBtn, Button deleteButton,Button addButton) {
            mImageView = imageView;
            mTextView = textView;
            nextBtn = nexBtn;
            deleteBtn= deleteButton;
            addBtn= addButton;
        }

    }
}
