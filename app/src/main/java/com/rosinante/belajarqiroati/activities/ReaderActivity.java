package com.rosinante.belajarqiroati.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.listener.OnPageChangeListener;
import com.rosinante.belajarqiroati.R;
import com.rosinante.belajarqiroati.models.YoutubeVideosModel;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReaderActivity extends AppCompatActivity implements OnPageChangeListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fab_video)
    FloatingActionButton fabVideo;

    PDFView pdfView;
    List<YoutubeVideosModel> youtubeVideosModels;
    String pdfName;
    Integer pageNumber = 66;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pdfName = getIntent().getStringExtra("qiroatiPDF");
        pdfView = findViewById(R.id.pdfview);
        displayPDF(pdfName);
    }

    private void displayPDF(String assetsFileName) {
        pageNumber = 1;
        setTitle(pdfName = assetsFileName);
        pdfView.fromAsset(assetsFileName).defaultPage(pageNumber).onPageChange(this).enableSwipe(true).load();
    }

    @OnClick(R.id.fab_video)
    public void onClick() {
        youtubeVideosModels = (List<YoutubeVideosModel>) getIntent().getSerializableExtra("videoUrls");
        Intent intent = new Intent(ReaderActivity.this, VideoListPlayerActivity.class);
        intent.putExtra("videoUrlList", (Serializable) youtubeVideosModels);
        startActivity(intent);
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(pdfName = String.valueOf(pageNumber));
    }
}
