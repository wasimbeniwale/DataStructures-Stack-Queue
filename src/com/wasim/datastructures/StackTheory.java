package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class StackTheory extends Activity implements OnClickListener {

	ImageButton btnReturn, btnNext;
	TextView txtTheory;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stack_theory);

		btnReturn = (ImageButton) findViewById(R.id.btnReturn);
		btnNext = (ImageButton) findViewById(R.id.btnNext);
		txtTheory = (TextView) findViewById(R.id.txtCoreConcept);

		txtTheory.setMovementMethod(new ScrollingMovementMethod());
		btnNext.setOnClickListener(this);
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
		case R.id.btnNext:
			intent = new Intent(StackTheory.this, StackAlgorithm.class);
			startActivity(intent);
			showAnim();
			break;
		}
	}

	public void showAnim() {
		StackTheory.this.overridePendingTransition(
				android.R.anim.slide_in_left, android.R.anim.slide_out_right);
	}

}
