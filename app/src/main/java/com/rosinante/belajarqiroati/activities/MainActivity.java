package com.rosinante.belajarqiroati.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rosinante.belajarqiroati.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.second_qiroati_text)
    TextView secondQiroatiText;
    @BindView(R.id.first_qiroati_text)
    TextView firstQiroatiText;
    @BindView(R.id.fourth_qiroati_text)
    TextView fourthQiroatiText;
    @BindView(R.id.third_qiroati_text)
    TextView thirdQiroatiText;
    @BindView(R.id.tajwid_text)
    TextView tajwidText;
    @BindView(R.id.tajwid_gharib_text)
    TextView tajwidGharibText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.second_qiroati_text, R.id.first_qiroati_text, R.id.fourth_qiroati_text, R.id.third_qiroati_text, R.id.tajwid_text, R.id.tajwid_gharib_text})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.second_qiroati_text:
                Toast.makeText(this, "Second", Toast.LENGTH_SHORT).show();
                break;
            case R.id.first_qiroati_text:
                Toast.makeText(this, "First", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fourth_qiroati_text:
                Toast.makeText(this, "Fourth", Toast.LENGTH_SHORT).show();
                break;
            case R.id.third_qiroati_text:
                Toast.makeText(this, "Third", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tajwid_text:
                Toast.makeText(this, "Tajwid", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tajwid_gharib_text:
                Toast.makeText(this, "Gharib", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
