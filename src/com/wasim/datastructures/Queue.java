package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Queue extends Activity implements OnClickListener {

	ImageButton btnAnimation, btnTheory, btnInteractive, btnQuestion,
			btnReturn;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_queue);

		btnTheory = (ImageButton) findViewById(R.id.btnTheory);
		btnAnimation = (ImageButton) findViewById(R.id.btnQueueAnimation);
		btnInteractive = (ImageButton) findViewById(R.id.btnInteractive);
		btnQuestion = (ImageButton) findViewById(R.id.btnQuestion);
		btnReturn = (ImageButton) findViewById(R.id.btnReturn);

		btnTheory.setOnClickListener(this);
		btnAnimation.setOnClickListener(this);
		btnInteractive.setOnClickListener(this);
		btnQuestion.setOnClickListener(this);
		btnReturn.setOnClickListener(this);
	}

	public void showAnimation() {
		Queue.this.overridePendingTransition(android.R.anim.slide_in_left,
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
		case R.id.btnTheory:
			intent = new Intent(Queue.this, QueueTheory.class);
			startActivity(intent);
			showAnimation();
			break;
		case R.id.btnQueueAnimation:
			intent = new Intent(Queue.this, QueueAnimation.class);
			startActivity(intent);
			showAnimation();
			break;

		case R.id.btnInteractive:
			intent = new Intent(Queue.this, QueueInteractive.class);
			startActivity(intent);
			showAnimation();
			break;

		case R.id.btnQuestion:
			intent = new Intent(Queue.this, QueueQuestion.class);
			startActivity(intent);
			showAnimation();
			break;

		}
	}

}
