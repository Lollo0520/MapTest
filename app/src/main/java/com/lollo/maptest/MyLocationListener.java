package com.lollo.maptest;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.orhanobut.logger.Logger;

public class MyLocationListener extends BDAbstractLocationListener {

    private RecLocCallback recLocCallback;

    public MyLocationListener(RecLocCallback callback) {
        this.recLocCallback = callback;
    }

    @Override
    public void onReceiveLocation(BDLocation location) {
        if (recLocCallback != null) {
            recLocCallback.handleRecLocation(location);
        }
    }

    interface RecLocCallback {
        void handleRecLocation(BDLocation location);
    }
}
