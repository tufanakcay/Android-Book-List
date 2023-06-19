package com.tufanakcay.booklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class KitapAdapter extends BaseAdapter {

    List<KitapModel> list;
    Context context;

    public KitapAdapter(List<KitapModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View layout = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);

        ImageView img = layout.findViewById(R.id.imageview_resim);
        TextView k_Adi = layout.findViewById(R.id.textview_name);
        TextView k_Yazari = layout.findViewById(R.id.textview_yazar);
        TextView k_YayimEvi = layout.findViewById(R.id.textview_yayimevi);
        TextView k_Fiyat = layout.findViewById(R.id.textview_fiyat);
        TextView k_Yil = layout.findViewById(R.id.textview_yil);


        img.setImageResource(list.get(position).getKitapResim());
        k_Adi.setText(list.get(position).getKitapAdi());
        k_Yazari.setText(list.get(position).getKitapYazari());
        k_YayimEvi.setText(list.get(position).getKitapYayinEvi());
        k_Fiyat.setText(list.get(position).getKitapFiyati());
        k_Yil.setText(list.get(position).getKitapIlkBasimYili());

        return layout;
    }
}
