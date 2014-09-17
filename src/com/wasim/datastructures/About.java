package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class About extends Activity implements OnClickListener {

	TextView txtAbout;
	ImageButton btnReturn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);

		txtAbout = (TextView) findViewById(R.id.txtAbout);
		btnReturn = (ImageButton) findViewById(R.id.btnReturn);

		txtAbout.setMovementMethod(new ScrollingMovementMethod());
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
