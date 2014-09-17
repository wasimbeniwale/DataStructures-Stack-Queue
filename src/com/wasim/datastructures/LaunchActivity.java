package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;

public class LaunchActivity extends Activity implements Runnable {

	AlertDialog dialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launch);

		dialog = new AlertDialog.Builder(LaunchActivity.this).create();
		dialog.setMessage("Do you want to exit ?");
		dialog.setIcon(R.drawable.question);

		dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Yes",
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						System.exit(0);
					}
				});

		dialog.setButton(DialogInterface.BUTTON_NEGATIVE, "No",
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						return;
					}
				});

		new Thread(this).start();

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			// your code here
			dialog.show();
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}

	public void callActivity() {
		Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
		startActivity(intent);
		LaunchActivity.this.overridePendingTransition(android.R.anim.fade_in,
				android.R.anim.fade_out);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4000);
			callActivity();
			finish();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
