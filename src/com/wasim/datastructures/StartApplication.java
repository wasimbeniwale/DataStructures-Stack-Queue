package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class StartApplication extends Activity implements OnClickListener {

	ImageButton btnStack, btnQueue, btnReturn;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_application);

		btnStack = (ImageButton) findViewById(R.id.btnStack);
		btnQueue = (ImageButton) findViewById(R.id.btnQueue);
		btnReturn = (ImageButton) findViewById(R.id.btnReturn);

		btnStack.setOnClickListener(this);
		btnQueue.setOnClickListener(this);
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
		case R.id.btnStack:
			intent = new Intent(StartApplication.this, Stack.class);
			startActivity(intent);
			showAnim();
			break;
		case R.id.btnQueue:
			intent = new Intent(StartApplication.this, Queue.class);
			startActivity(intent);
			showAnim();
			break;
		}
	}

	public void showAnim() {
		StartApplication.this.overridePendingTransition(
				android.R.anim.slide_in_left, android.R.anim.slide_out_right);
	}

}
