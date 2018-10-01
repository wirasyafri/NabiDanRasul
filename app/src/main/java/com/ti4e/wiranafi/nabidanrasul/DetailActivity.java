package com.ti4e.wiranafi.nabidanrasul;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        int a = extras.getInt("id");
        NabiDetailFragment frag = (NabiDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setResep(a);
    }

}
