package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Contact extends Activity implements OnClickListener {

	ImageButton btnReturn;
	TextView txtContact;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);

		btnReturn = (ImageButton) findViewById(R.id.btnReturn);
		txtContact = (TextView) findViewById(R.id.txtContact);

		txtContact.setMovementMethod(new ScrollingMovementMethod());
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
