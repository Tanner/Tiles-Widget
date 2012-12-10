package com.antarcticapps.tiles;

import android.os.Bundle;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AppWidgetConfigure extends Activity {
	private int mAppWidgetId;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_widget_configure);
		
		Intent intent = getIntent();
		Bundle extras = intent.getExtras();
		if (extras != null) {
		    mAppWidgetId = extras.getInt(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
		}
        
        Button cancelButton = (Button) findViewById(R.id.cancel);
        cancelButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
		        Intent resultValue = new Intent();
		        resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
		        setResult(RESULT_CANCELED, resultValue);
		        finish();
			}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return false;
	}
}
