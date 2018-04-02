package com.example.nguyenthanhxuan.thigiuakinguyenthanhxuann14dcpt205;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nguyen Thanh Xuan on 4/2/2018.
 */

public class AdapterMoney extends ArrayAdapter<Money> {
    public AdapterMoney(@NonNull Context context, @LayoutRes int resource, @NonNull List<Money> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            v = inflater.inflate(R.layout.hien_thi_ket_qua,null);
        }

        Money me = getItem(position);
        if (me!=null){
            ImageView img = (ImageView)v.findViewById(R.id.img);
            if (me.getHinhthuc()==0){
                img.setImageResource(R.drawable.chi);
            }else if (me.getHinhthuc()==1){
                img.setImageResource(R.drawable.thu);
            }

            TextView tv1 = (TextView)v.findViewById(R.id.tv1);
            tv1.setText(me.getNd().toString());
            TextView tv2 = (TextView)v.findViewById(R.id.tv2);
            tv2.setText(me.getSotien().toString());
            TextView tv3 = (TextView)v.findViewById(R.id.tv3);
            tv3.setText(me.getHinhthuc());
        }
        return v;
    }
}
