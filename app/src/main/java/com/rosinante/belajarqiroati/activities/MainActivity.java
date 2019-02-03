package com.rosinante.belajarqiroati.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.rosinante.belajarqiroati.R;
import com.rosinante.belajarqiroati.models.YoutubeVideosModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.jilid_satu_icon)
    ImageView jilidSatuIcon;
    @BindView(R.id.jilid_dua_icon)
    ImageView jilidDuaIcon;
    @BindView(R.id.jilid_tiga_icon)
    ImageView jilidTigaIcon;
    @BindView(R.id.jilid_empat_icon)
    ImageView jilidEmpatIcon;
    @BindView(R.id.tajwid_icon)
    ImageView tajwidIcon;
    @BindView(R.id.ghorib_icon)
    ImageView ghoribIcon;

    List<YoutubeVideosModel> youtubeVideosModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.jilid_satu_icon, R.id.jilid_dua_icon, R.id.jilid_tiga_icon, R.id.jilid_empat_icon, R.id.tajwid_icon, R.id.ghorib_icon})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.jilid_satu_icon:
                youtubeVideosModels.clear();
                //First video
                YoutubeVideosModel videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/djtRQyA6KJw\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Second video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Gz0AY1DITTM\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Third video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HwRpacCaGQg\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Fourth video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Te7qK3T3VrA\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Fifth video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WjzfKAhrrG0\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Sixth video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WwA_EjViB7E\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Seventh video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TeVpOsNqpAI\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);
                //Eighth video
                videoList = new YoutubeVideosModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tongatuyF3k\" frameborder=\"0\" allowfullscreen></iframe>");
                youtubeVideosModels.add(videoList);

                Intent firstIntent = new Intent(MainActivity.this, ReaderActivity.class);
                firstIntent.putExtra("qiroatiPDF", "jilidsatu.pdf");
                firstIntent.putExtra("videoUrls", (Serializable) youtubeVideosModels);
                startActivity(firstIntent);
                break;
            case R.id.jilid_dua_icon:
                youtubeVideosModels.clear();
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
            case R.id.jilid_tiga_icon:
                youtubeVideosModels.clear();
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
            case R.id.jilid_empat_icon:
                Toast.makeText(this, "Fourth", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tajwid_icon:
                Toast.makeText(this, "Tajwid", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ghorib_icon:
                Toast.makeText(this, "Gharib", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
