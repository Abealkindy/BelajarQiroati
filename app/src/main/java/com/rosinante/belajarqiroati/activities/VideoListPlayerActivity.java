package com.rosinante.belajarqiroati.activities;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rosinante.belajarqiroati.R;
import com.rosinante.belajarqiroati.adapter.RecyclerYoutubeVideosAdapter;
import com.rosinante.belajarqiroati.models.YoutubeVideosModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoListPlayerActivity extends AppCompatActivity {

    @BindView(R.id.recyclerYoutubeVideos)
    RecyclerView recyclerYoutubeVideos;
    @BindView(R.id.videoListRefresh)
    SwipeRefreshLayout videoListRefresh;

    private List<YoutubeVideosModel> youtubeVideosModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list_player);
        ButterKnife.bind(this);
        setTitle("Video Penjelasan");

        getVideoLists();
        videoListRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                videoListRefresh.setRefreshing(false);
                getVideoLists();
            }
        });

    }

    private void getVideoLists() {
        youtubeVideosModels = (List<YoutubeVideosModel>) getIntent().getSerializableExtra("videoUrlList");

        recyclerYoutubeVideos.setLayoutManager(new LinearLayoutManager(VideoListPlayerActivity.this));
        recyclerYoutubeVideos.setHasFixedSize(true);
        recyclerYoutubeVideos.setAdapter(new RecyclerYoutubeVideosAdapter(youtubeVideosModels));
    }
}
