package com.rosinante.belajarqiroati.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rosinante.belajarqiroati.R;
import com.rosinante.belajarqiroati.models.YoutubeVideosModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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

    List<YoutubeVideosModel> youtubeVideosModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.second_qiroati_text, R.id.first_qiroati_text, R.id.fourth_qiroati_text, R.id.third_qiroati_text, R.id.tajwid_text, R.id.tajwid_gharib_text})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.first_qiroati_text:
                //First video
                YoutubeVideosModel videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Second video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Third video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);

                Intent firstIntent = new Intent(MainActivity.this, ReaderActivity.class);
                firstIntent.putExtra("qiroatiPDF", "jilidsatu.pdf");
                firstIntent.putExtra("videoUrls", (Serializable) youtubeVideosModels);
                startActivity(firstIntent);
                break;
            case R.id.second_qiroati_text:
                //First video
                YoutubeVideosModel secondVideoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(secondVideoList);
                //Second video
                secondVideoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(secondVideoList);
                //Third video
                secondVideoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(secondVideoList);
                Intent secondIntent = new Intent(MainActivity.this, ReaderActivity.class);
                secondIntent.putExtra("qiroatiPDF", "jiliddua.pdf");
                secondIntent.putExtra("videoUrls", (Serializable) youtubeVideosModels);
                startActivity(secondIntent);
                break;
            case R.id.third_qiroati_text:
                //First video
                YoutubeVideosModel thirdVideoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(thirdVideoList);
                //Second video
                thirdVideoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(thirdVideoList);
                //Third video
                thirdVideoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(thirdVideoList);

                Intent thirdIntent = new Intent(MainActivity.this, ReaderActivity.class);
                thirdIntent.putExtra("qiroatiPDF", "jilidtiga.pdf");
                thirdIntent.putExtra("videoUrls", (Serializable) youtubeVideosModels);
                startActivity(thirdIntent);
                break;
            case R.id.fourth_qiroati_text:
                Toast.makeText(this, "Fourth", Toast.LENGTH_SHORT).show();
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
