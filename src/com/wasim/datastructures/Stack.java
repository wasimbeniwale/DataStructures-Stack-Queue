package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Stack extends Activity implements OnClickListener {

	ImageButton btnAnimation, btnTheory, btnInteractive, btnQuestion,
			btnReturn;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stack);

		btnAnimation = (ImageButton) findViewById(R.id.btnStackAnimation);
		btnReturn = (ImageButton) findViewById(R.id.btnReturn);
		btnTheory = (ImageButton) findViewById(R.id.btnTheory);
		btnInteractive = (ImageButton) findViewById(R.id.btnInteractive);
		btnQuestion = (ImageButton) findViewById(R.id.btnQuestion);

		btnAnimation.setOnClickListener(this);
		btnReturn.setOnClickListener(this);
		btnTheory.setOnClickListener(this);
		btnInteractive.setOnClickListener(this);
		btnQuestion.setOnClickListener(this);
	}

	public void showAnim() {
		Stack.this.overridePendingTransition(android.R.anim.slide_in_left,
				android.R.anim.slide_out_right);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		int id = v.getId();

		switch (id) {
		case R.id.btnReturn:
			finish();
			break;
		case R.id.btnStackAnimation:
			intent = new Intent(Stack.this, StackAnimation.class);
			startActivity(intent);
			showAnim();
			break;
		case R.id.btnTheory:
			intent = new Intent(Stack.this, StackTheory.class);
			startActivity(intent);
			showAnim();
			break;
		case R.id.btnInteractive:
			intent = new Intent(Stack.this, StackInteractive.class);
			startActivity(intent);
			showAnim();
			break;
		case R.id.btnQuestion:
			intent = new Intent(Stack.this, StackQuestion.class);
			startActivity(intent);
			showAnim();
			break;

		}
	}

}
