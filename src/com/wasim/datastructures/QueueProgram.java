package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageButton;

public class QueueProgram extends Activity implements OnClickListener {

	ImageButton btnReturn;
	WebView web1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_queue_program);

		btnReturn = (ImageButton) findViewById(R.id.btnReturn);
		web1 = (WebView) findViewById(R.id.queueProg);
		web1.loadUrl("file:///android_asset/QueuePro.html");

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
