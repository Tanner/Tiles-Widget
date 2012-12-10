package com.antarcticapps.tiles;

import com.antarcticapps.tiles.R;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;

public class TilesAppWidgetProvider extends AppWidgetProvider {
	public void onReceive (Context context, Intent intent) {
		Toast.makeText(context, intent.getAction(), Toast.LENGTH_SHORT).show();
	}
	
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		for (int i = 0; i < appWidgetIds.length; i++) {
	        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
	        appWidgetManager.updateAppWidget(appWidgetIds[i], remoteViews);
		}
    }
}
