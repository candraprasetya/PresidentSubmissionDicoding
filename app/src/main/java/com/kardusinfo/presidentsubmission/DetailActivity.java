package com.kardusinfo.presidentsubmission;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static String DESCRIPTION = "DESCRIPTION";
    public static String GAMBAR = "GAMBAR";
    public static String NAMA = "NAMA";

    ImageView image_load;
    TextView description;
    TextView namanya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setupEnv();
    }

    private void setupEnv() {
        String imgPath = getIntent().getStringExtra(GAMBAR);
        String desc = getIntent().getStringExtra(DESCRIPTION);
        String nama = getIntent().getStringExtra(NAMA);

        image_load = (ImageView) findViewById(R.id.image_load);
        namanya = (TextView) findViewById(R.id.tv_nama);
        description = (TextView) findViewById(R.id.tv_description);

        if (imgPath.isEmpty()) {
            image_load.setVisibility(View.GONE);
        } else {
            Glide.with(this)
                    .load(imgPath)
                    .into(image_load);
        }

        description.setText(desc);
        namanya.setText(nama);
    }
}
