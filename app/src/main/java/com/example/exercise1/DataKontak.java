package com.example.exercise1;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.widget.SearchView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class DataKontak extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener, View.OnClickListener {
    Bundle bundle = new Bundle();
    Intent intent;
    private SearchView tCari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kontak);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}
