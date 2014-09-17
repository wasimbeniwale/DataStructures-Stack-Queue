package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Help extends Activity implements OnClickListener {

	ImageButton btnReturn;
	TextView txtHelp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);

		btnReturn = (ImageButton) findViewById(R.id.btnReturn);
		txtHelp = (TextView) findViewById(R.id.txtHelp);

		btnReturn.setOnClickListener(this);
		txtHelp.setMovementMethod(new ScrollingMovementMethod());
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
