package com.example.herotruth.rjt_cw_layoutprogramming;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;
import android.support.annotation.Nullable;

public class MyMusicService extends Service{

    MediaPlayer player;

    int [] tracks = {R.raw.gay, R.raw.gayer};



    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(MyMusicService.this, tracks[0]);

    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
