package com.example.exercise1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Bramantyo":
                tvnama.setText("Bramantyo Adi");
                tvnomor.setText("082284299551");
                break;
            case "Adi" :
                tvnama.setText("Adi Bramantyo");
                tvnomor.setText("082284299542");
                break;
            case "Yoga" :
                tvnama.setText("Yoga Saputra");
                tvnomor.setText("082284299543");
                break;
            case "Tono" :
                tvnama.setText("Tono Ginting");
                tvnomor.setText("082284299544");
                break;
            case "Lutfi" :
                tvnama.setText("Lutfi Arif");
                tvnomor.setText("082284299545");
                break;
            case "Dono" :
                tvnama.setText("Dono Saputra");
                tvnomor.setText("082284299546");
                break;
            case "Santi" :
                tvnama.setText("Santi Dian");
                tvnomor.setText("082284299547");
                break;
            case "Nando" :
                tvnama.setText("Nando Jaya");
                tvnomor.setText("082284299548");
                break;
            case "Robin" :
                tvnama.setText("Robin Hood");
                tvnomor.setText("082284299549");
                break;
            case "Franky" :
                tvnama.setText("Frank Enstein");
                tvnomor.setText("082284288550");
                break;
        }
    }
}
