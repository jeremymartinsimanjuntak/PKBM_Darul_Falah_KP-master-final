package com.example.pkbmdarulfalah;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Info_Kelas extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_kelas);

        View back_home = findViewById(R.id.button_info);
        View to_window = findViewById(R.id.button_window);
        View to_window_mtk = findViewById(R.id.mtk_window);
        View to_window_ing = findViewById(R.id.inggris_window);
        View to_window_ipa = findViewById(R.id.ipa_window);
        View to_window_ppkn = findViewById(R.id.ppkn_window);
        View to_window_ips = findViewById(R.id.ips_window);
        View to_window_agama = findViewById(R.id.agama_window);
        View to_window_prakarya = findViewById(R.id.prakarya_window);
        View to_window_seni = findViewById(R.id.seni_window);

        back_home.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Dashboard.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window_mtk.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas_MTK.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window_ing.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas_Inggris.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window_ipa.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas_IPA.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window_ppkn.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas_PPKn.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window_ips.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas_IPS.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window_agama.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas_Agama.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window_prakarya.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas_Prakarya.class);
            startActivity(intentProfile_UserActivity);
        });
        to_window_seni.setOnClickListener(v -> {
            Intent intentProfile_UserActivity = new Intent (Info_Kelas.this, Window_Kelas_Seni.class);
            startActivity(intentProfile_UserActivity);
        });

    }
}