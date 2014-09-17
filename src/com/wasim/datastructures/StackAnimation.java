package com.wasim.datastructures;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;

public class StackAnimation extends Activity implements OnClickListener {

	WebView web1;
	WebSettings webSet;
	ImageButton btnReturn;

	@SuppressLint("SetJavaScriptEnabled")
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stack_animation);

		web1 = (WebView) findViewById(R.id.webViewStack);
		btnReturn = (ImageButton) findViewById(R.id.btnReturn);

		webSet = web1.getSettings();
		webSet.setJavaScriptEnabled(true);
		webSet.setPluginState(WebSettings.PluginState.ON);
		webSet.setPluginsEnabled(true);
		web1.loadUrl("file:///android_asset/stackAnim.html");

		btnReturn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		int id = v.getId();

		switch (id) {
		case R.id.btnReturn:
			finish();
			break;
		}
	}

}
