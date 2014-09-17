package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class StackAlgorithm extends Activity implements OnClickListener {

	ImageButton btnReturn, btnNext;
	TextView txtAlgorithm;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stack_algorithm);

		btnReturn = (ImageButton) findViewById(R.id.btnReturn);
		btnNext = (ImageButton) findViewById(R.id.btnNext);
		txtAlgorithm = (TextView) findViewById(R.id.stackAlgorithm);

		txtAlgorithm.setMovementMethod(new ScrollingMovementMethod());
		btnReturn.setOnClickListener(this);
		btnNext.setOnClickListener(this);

		txtAlgorithm
				.setText("\nPush ( ):\nDescription: \n\nHere STACK is an array with MAX locations. TOP points to the top most element and ITEM is the value to be inserted."
						+ "\n\n1. If (TOP == MAX) Then "
						+ "\n\t\t[Check for overflow]"
						+ "\n2.\t\tPrint: Overflow"
						+ "\n3. Else"
						+ "\n4.\t\tSet TOP = TOP + 1 "
						+ "\n\t\t[Increment TOP by 1]"
						+ "\n5.\t\tSet STACK[TOP] = ITEM "
						+ "\n\t\t[Assign ITEM to top of STACK]"
						+ "\n6.\t\tPrint: ITEM inserted"
						+ "\n\t [End of If]"
						+ "\n7. Exit"
						+ "\n\n\nPop ( ):\nDescription: \n\nHere STACK is an array with MAX locations. TOP points to the top most element."
						+ "\n\n1. If (TOP == 0) Then "
						+ "\n\t\t[Check for underflow]"
						+ "\n2.\t\tPrint: Underflow"
						+ "\n3. Else"
						+ "\n4.\t\tSet ITEM = STACK[TOP] "
						+ "\n\t\t[Assign top of STACK to ITEM]"
						+ "\n5.\t\tSet TOP = TOP - 1 "
						+ "\n\t\t[Decrement TOP by 1]"
						+ "\n6.\t\tPrint: ITEM deleted"
						+ "\n\t [End of If]"
						+ "\n7. Exit");

	}

	public void showAnim() {
		StackAlgorithm.this.overridePendingTransition(
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
			intent = new Intent(StackAlgorithm.this, StackProgram.class);
			startActivity(intent);
			showAnim();
			break;
		}
	}

}
