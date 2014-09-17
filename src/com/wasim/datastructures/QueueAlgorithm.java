package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class QueueAlgorithm extends Activity implements OnClickListener {

	ImageButton btnReturn, btnNext;
	TextView txtAlgo;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_queue_algorithm);

		btnReturn = (ImageButton) findViewById(R.id.btnReturn);
		btnNext = (ImageButton) findViewById(R.id.btnNext);
		txtAlgo = (TextView) findViewById(R.id.queueAlgorithm);

		btnReturn.setOnClickListener(this);
		btnNext.setOnClickListener(this);
		txtAlgo.setMovementMethod(new ScrollingMovementMethod());

		txtAlgo.setText("Insert ( ):\n\nDescription: \n\nHere QUEUE is an array with N locations. FRONT and REAR points to the front and rear of the QUEUE. ITEM is the value to be inserted."
				+ "\n\n1.If (REAR == N) Then "
				+ "\n\t\t[Check for overflow] "
				+ "\n2."
				+ "\t\tPrint: Overflow "
				+ "\n3."
				+ "\tElse "
				+ "\n4."
				+ "\t\tIf (FRONT and REAR == 0) Then "
				+ "\n\t\t\t[Check if QUEUE is empty]"
				+ "\n\t\t\t\t(a) Set FRONT = 1"
				+ "\n\t\t\t\t(b) Set REAR = 1"
				+ "\n5."
				+ "\t\tElse "
				+ "\n6."
				+ "\t\t\tSet REAR = REAR + 1 "
				+ "\n\t\t\t[Increment REAR by 1]"
				+ "\n\t\t[End of Step 4 If] "
				+ "\n7."
				+ "\tQUEUE[REAR] = ITEM "
				+ "\n8."
				+ "\tPrint: ITEM inserted [End of Step 1 If] "
				+ "\n9.Exit"
				+ "\n\n\nDelete ( ):\n\nDescription: \n\nHere QUEUE is an array with N locations. FRONT and REAR points to the front and rear of the QUEUE."
				+ "\n\n1. If (FRONT == 0) Then "
				+ "\n\t\t[Check for underflow]"
				+ "\n2.\t\tPrint: Underflow"
				+ "\n3. Else"
				+ "\n4.\t\tITEM = QUEUE[FRONT]"
				+ "\n5.\tIf (FRONT == REAR) Then "
				+ "\n\t\t[Check if only one element is left]"
				+ "\n\t\t(a) Set FRONT = 0"
				+ "\n\t\t(b) Set REAR = 0"
				+ "\n6.\tElse"
				+ "\n7.\t\tSet FRONT = FRONT + 1 "
				+ "\n\t\t[Increment FRONT by 1]"
				+ "\n\t\t[End of Step 5 If]"
				+ "\n8.Print: ITEM deleted[End of Step 1 If]" + "\n9.Exit");

	}

	public void showAnim() {
		QueueAlgorithm.this.overridePendingTransition(
				android.R.anim.slide_in_left, android.R.anim.slide_out_right);
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
			intent = new Intent(QueueAlgorithm.this, QueueProgram.class);
			startActivity(intent);
			break;
		}
	}
}
