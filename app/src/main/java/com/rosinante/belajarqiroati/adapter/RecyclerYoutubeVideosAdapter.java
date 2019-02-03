package com.rosinante.belajarqiroati.adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.rosinante.belajarqiroati.R;
import com.rosinante.belajarqiroati.models.YoutubeVideosModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
 * Created by Rosinante24 on 26/01/19.
 */
public class RecyclerYoutubeVideosAdapter extends RecyclerView.Adapter<RecyclerYoutubeVideosAdapter.ViewHolder> {
    private List<YoutubeVideosModel> youtubeVideosModels;

    public RecyclerYoutubeVideosAdapter(List<YoutubeVideosModel> youtubeVideosModels) {
        this.youtubeVideosModels = youtubeVideosModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        viewHolder.videoWebView.loadData(youtubeVideosModels.get(position).getVideoUrls(), "text/html", "utf-8");

    }

    @Override
    public int getItemCount() {
        return youtubeVideosModels.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.videoWebView)
        WebView videoWebView;

        @SuppressLint("SetJavaScriptEnabled")
        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            videoWebView.getSettings().setJavaScriptEnabled(true);
            videoWebView.setWebChromeClient(new WebChromeClient());

        }
    }
}
