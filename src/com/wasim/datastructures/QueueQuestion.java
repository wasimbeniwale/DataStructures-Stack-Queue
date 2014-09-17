package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QueueQuestion extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	ImageButton btnNext;
	TextView txtQuest;
	RadioButton rdo1, rdo2, rdo3, rdo4;
	RadioGroup rdoGroup;
	int i = 1;
	int score = 0;
	int flag = 0;
	int rdoChecked;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_queue_question);

		btnNext = (ImageButton) findViewById(R.id.btnQuestion);
		txtQuest = (TextView) findViewById(R.id.txtQuestion);
		rdo1 = (RadioButton) findViewById(R.id.rdoQueue1);
		rdo2 = (RadioButton) findViewById(R.id.rdoQueue2);
		rdo3 = (RadioButton) findViewById(R.id.rdoQueue3);
		rdo4 = (RadioButton) findViewById(R.id.rdoQueue4);

		rdoGroup = (RadioGroup) findViewById(R.id.rdoGroupQueue);

		rdo1.setOnCheckedChangeListener(this);
		rdo2.setOnCheckedChangeListener(this);
		rdo3.setOnCheckedChangeListener(this);
		rdo4.setOnCheckedChangeListener(this);

		btnNext.setOnClickListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		int id = buttonView.getId();
		flag = 1;

		switch (id) {
		case R.id.rdoQueue1:
			if (i == 1)
				score++;
			rdo2.setEnabled(false);
			rdo3.setEnabled(false);
			rdo4.setEnabled(false);
			break;
		case R.id.rdoQueue2:
			if (i == 3)
				score++;
			rdo1.setEnabled(false);
			rdo3.setEnabled(false);
			rdo4.setEnabled(false);
			break;
		case R.id.rdoQueue3:
			if (i == 4)
				score++;
			rdo1.setEnabled(false);
			rdo2.setEnabled(false);
			rdo4.setEnabled(false);
			break;
		case R.id.rdoQueue4:
			if (i == 2)
				score++;
			rdo1.setEnabled(false);
			rdo2.setEnabled(false);
			rdo3.setEnabled(false);
			break;
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();

		if (id == R.id.btnQuestion) {
			if (flag == 1) {
				rdo1.setEnabled(true);
				rdo2.setEnabled(true);
				rdo3.setEnabled(true);
				rdo4.setEnabled(true);
				flag = 0;
				switch (i) {
				case 1:

					txtQuest.setText(R.string.question_queue2);
					rdo1.setText(R.string.queue2_a);
					rdo2.setText(R.string.queue2_b);
					rdo3.setText(R.string.queue2_c);
					rdo4.setText(R.string.queue2_d);
					break;
				case 2:

					txtQuest.setText(R.string.question_queue3);
					rdo1.setText(R.string.queue3_a);
					rdo2.setText(R.string.queue3_b);
					rdo3.setText(R.string.queue3_c);
					rdo4.setText(R.string.queue3_d);
					break;
				case 3:

					txtQuest.setText(R.string.question_queue4);
					rdo1.setText(R.string.queue4_a);
					rdo2.setText(R.string.queue4_b);
					rdo3.setText(R.string.queue4_c);
					rdo4.setText(R.string.queue4_d);
					break;

				case 4:
					rdoGroup.setVisibility(View.INVISIBLE);
					btnNext.setVisibility(View.INVISIBLE);
					txtQuest.setText("Your score is : " + (((float) score / 4))
							* 100 + " %");
				}
				i++;
			} else {
				Toast.makeText(QueueQuestion.this,
						"Please select your answer...", Toast.LENGTH_SHORT)
						.show();
			}
		}
	}
}
