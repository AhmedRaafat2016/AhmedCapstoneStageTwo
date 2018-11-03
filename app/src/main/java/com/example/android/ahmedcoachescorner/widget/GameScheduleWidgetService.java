package com.example.android.ahmedcoachescorner.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;



public class GameScheduleWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {

        return (new GameScheduleListProvider(this.getApplicationContext(), intent));

    }
}
