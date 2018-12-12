package com.kardusinfo.presidentsubmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kardusinfo.presidentsubmission.adapter.adapter;
import com.kardusinfo.presidentsubmission.database.database;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvItems;
    private List<database> list;
    private RecyclerView.ItemDecoration decoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEnv();
        setupList();
        loadDataDummy();
    }

    private void setupEnv() {
        rvItems = (RecyclerView) findViewById(R.id.rv_item);
        list = new ArrayList<>();
        decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
    }

    private void setupList() {
        adapter adapter = new adapter(list);
        rvItems.setLayoutManager(new LinearLayoutManager(this));
        rvItems.addItemDecoration(decoration);
        rvItems.setAdapter(adapter);
    }

    private void loadDataDummy() {
        list.add(new database(
                R.drawable.mantan1,
                "Alisha",
                "20 Tahun",
                "Yogyakarta",
                "https://kardusinfo.com/share/mantan1.jpeg",
                "Cantik banget coy"
        ));

        list.add(new database(
                R.drawable.mantan2,
                "Chaira",
                "20 Tahun",
                "Yogyakarta",
                "https://kardusinfo.com/share/mantan2.jpg",
                "Manis kalau yang ini"
        ));

        list.add(new database(
                R.drawable.mantan3,
                "Prasetya",
                "20 Tahun",
                "Yogyakarta",
                "https://kardusinfo.com/share/mantan3.jpeg",
                "Kalau yang ini kaya raya"
        ));

        list.add(new database(
                R.drawable.mantan4,
                "Vika",
                "20 Tahun",
                "Yogyakarta",
                "https://kardusinfo.com/share/mantan4.jpg",
                "kalau yang ini penghianat"
        ));

        list.add(new database(
                R.drawable.mantan5,
                "Laras",
                "20 Tahun",
                "Yogyakarta",
                "https://kardusinfo.com/share/mantan5.jpeg",
                "kalau yang ini yang terindah"
        ));

        list.add(new database(
                R.drawable.mantan6,
                "Asa",
                "20 Tahun",
                "Yogyakarta",
                "https://kardusinfo.com/share/mantan6.jpeg",
                "ini siapa ya?"
        ));
    }
}