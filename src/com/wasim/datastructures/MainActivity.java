package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener {

	ImageButton btnStart, btnAbout, btnContact, btnHelp, btnInformation,
			btnExit;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnStart = (ImageButton) findViewById(R.id.btnStart);
		btnAbout = (ImageButton) findViewById(R.id.btnAbout);
		btnContact = (ImageButton) findViewById(R.id.btnContact);
		btnHelp = (ImageButton) findViewById(R.id.btnHelp);
		btnInformation = (ImageButton) findViewById(R.id.btnInformation);
		btnExit = (ImageButton) findViewById(R.id.btnExit);

		btnStart.setOnClickListener(this);
		btnAbout.setOnClickListener(this);
		btnContact.setOnClickListener(this);
		btnHelp.setOnClickListener(this);
		btnInformation.setOnClickListener(this);
		btnExit.setOnClickListener(this);

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			// your code here
			AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
					.create();
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
			dialog.show();
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}

	public void showAnim() {
		MainActivity.this.overridePendingTransition(
				android.R.anim.slide_in_left, android.R.anim.slide_out_right);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();

		switch (id) {

		case R.id.btnStart:
			intent = new Intent(MainActivity.this, StartApplication.class);
			startActivity(intent);
			showAnim();
			break;

		case R.id.btnAbout:
			intent = new Intent(MainActivity.this, About.class);
			startActivity(intent);
			showAnim();
			break;

		case R.id.btnContact:
			intent = new Intent(MainActivity.this, Contact.class);
			startActivity(intent);
			showAnim();
			break;

		case R.id.btnHelp:
			intent = new Intent(MainActivity.this, Help.class);
			startActivity(intent);
			showAnim();
			break;

		case R.id.btnInformation:
			intent = new Intent(MainActivity.this, Information.class);
			startActivity(intent);
			showAnim();
			break;

		case R.id.btnExit:
			AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
					.create();
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
			dialog.show();
			break;
		}
	}

}
