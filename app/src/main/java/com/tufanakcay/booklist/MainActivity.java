package com.tufanakcay.booklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<KitapModel> bookList;
    KitapAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSet();
        booksList();

    }

    private void initSet() {

        listView = findViewById(R.id.listview);

    }

    public void booksList(){

        bookList = new ArrayList<>();

        KitapModel kt1 = new KitapModel(R.drawable.beyaz_zambaklar,"Beyaz Zambaklar Ülkesinde","Grigory Petrov","İndigo Kitap","19.20","2018");
        KitapModel kt2 = new KitapModel(R.drawable.martin_eden,"Martin Eden"," Jack London","İş Bankası Kültür Yayınları","42.25","2014");
        KitapModel kt3 = new KitapModel(R.drawable.fareler_insanlar,"Fareler ve İnsanlar"," John Steinbeck"," İletişim Yayınları","45.30","2023");
        KitapModel kt4 = new KitapModel(R.drawable.kucuk_prens,"Küçük Prens","Antoine de Saint-Exupery","İş Bankası Kültür Yayınları","14.30","2020");
        KitapModel kt5 = new KitapModel(R.drawable.beyaz_zambaklar,"Denizler Altında Yirmi Bin Fersah","Jules Verne"," İş Bankası Kültür Yayınları","57.20","2019");

        bookList.add(kt1);
        bookList.add(kt2);
        bookList.add(kt3);
        bookList.add(kt4);
        bookList.add(kt5);

        bookList.add(kt1);
        bookList.add(kt2);
        bookList.add(kt3);
        bookList.add(kt4);
        bookList.add(kt5);

        bookList.add(kt1);
        bookList.add(kt2);
        bookList.add(kt3);
        bookList.add(kt4);
        bookList.add(kt5);

        adp = new KitapAdapter(bookList, this);

        listView.setAdapter(adp);

    }

}