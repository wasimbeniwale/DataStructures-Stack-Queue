package com.wasim.datastructures;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class QueueInteractive extends Activity implements OnClickListener,
		OnTouchListener, OnDragListener {

	private static final String LOGCAT = null;
	int[] btnId = new int[7];
	public View[] vId = new View[7];
	public int i = 6;
	public int id = 0;
	public int flag = 0;
	public int al = 1;
	Button btnInsert, btnRemove;
	AlertDialog dialogInit;
	ImageButton btnReturn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_queue_interactive);

		dialogInit = new AlertDialog.Builder(QueueInteractive.this).create();
		dialogInit
				.setMessage("In this scenario you have to make queue of buttons\nFirst Click on the insert button then drag the buttons into the lime colored layout to make a Queue\nTo delete items click on Remove button.");
		dialogInit.setIcon(R.drawable.information);

		dialogInit.setButton(DialogInterface.BUTTON_POSITIVE,
				"Ok... I got it...!", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						return;
					}
				});

		dialogInit.show();

		btnInsert = (Button) findViewById(R.id.btnInsert);
		btnRemove = (Button) findViewById(R.id.btnRemove);
		btnReturn = (ImageButton) findViewById(R.id.btnReturn);
		btnRemove.setEnabled(false);

		findViewById(R.id.imageButton1).setOnTouchListener(this);
		findViewById(R.id.imageButton2).setOnTouchListener(this);
		findViewById(R.id.imageButton3).setOnTouchListener(this);
		findViewById(R.id.imageButton4).setOnTouchListener(this);
		findViewById(R.id.imageButton5).setOnTouchListener(this);
		findViewById(R.id.imageButton6).setOnTouchListener(this);
		findViewById(R.id.imageButton7).setOnTouchListener(this);
		findViewById(R.id.imageButton8).setOnTouchListener(this);

		findViewById(R.id.layout_queue).setOnDragListener(this);
		findViewById(R.id.layout_QueueItem).setOnDragListener(this);

		btnInsert.setOnClickListener(this);
		btnRemove.setOnClickListener(this);
		btnReturn.setOnClickListener(this);

		findViewById(R.id.imageButton1).setEnabled(false);
		findViewById(R.id.imageButton2).setEnabled(false);
		findViewById(R.id.imageButton3).setEnabled(false);
		findViewById(R.id.imageButton4).setEnabled(false);
		findViewById(R.id.imageButton5).setEnabled(false);
		findViewById(R.id.imageButton6).setEnabled(false);
		findViewById(R.id.imageButton7).setEnabled(false);
		findViewById(R.id.imageButton8).setEnabled(false);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		int id = v.getId();

		switch (id) {
		case R.id.btnReturn:
			finish();
			break;
		case R.id.btnRemove:
			if (i < 0) {
				btnRemove.setEnabled(false);
				Toast.makeText(QueueInteractive.this, "Empty Queue",
						Toast.LENGTH_SHORT).show();
			} else {
				vId[i].setVisibility(View.INVISIBLE);
				Toast.makeText(QueueInteractive.this, "Item deleted",
						Toast.LENGTH_SHORT).show();
				i--;
			}
			break;
		case R.id.btnInsert:
			findViewById(R.id.imageButton1).setEnabled(true);
			findViewById(R.id.imageButton2).setEnabled(true);
			findViewById(R.id.imageButton3).setEnabled(true);
			findViewById(R.id.imageButton4).setEnabled(true);
			findViewById(R.id.imageButton5).setEnabled(true);
			findViewById(R.id.imageButton6).setEnabled(true);
			findViewById(R.id.imageButton7).setEnabled(true);
			findViewById(R.id.imageButton8).setEnabled(true);
			btnInsert.setEnabled(false);
			break;

		}
		if ((id != R.id.btnReturn) && (id != R.id.btnRemove)
				&& (id != R.id.btnInsert)) {
			if (al == 0) {
				if (id == vId[i].getId()) {
					AlertDialog dialog = new AlertDialog.Builder(
							QueueInteractive.this).create();
					dialog.setMessage("You can remove this element because it is in front position\nClick on remove item button to remove.");
					dialog.setIcon(R.drawable.information);

					dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0,
										int arg1) {
									// TODO Auto-generated method stub
									return;
								}
							});
					dialog.show();
				} else {
					AlertDialog dialog = new AlertDialog.Builder(
							QueueInteractive.this).create();
					dialog.setMessage("You can't remove this item because it is not in front position.\nWe can remove only the element which is in front position.\nQueue only remove item in First In First Out (FIFO) manner.");
					dialog.setIcon(R.drawable.information);

					dialog.setButton(DialogInterface.BUTTON_POSITIVE,
							"Ok! I have Got It.",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0,
										int arg1) {
									// TODO Auto-generated method stub
									return;
								}
							});
					dialog.show();
				}
			} else {
				AlertDialog dialog = new AlertDialog.Builder(
						QueueInteractive.this).create();
				dialog.setMessage("Please insert items into the Queue...");
				dialog.setIcon(R.drawable.information);

				dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface arg0, int arg1) {
								// TODO Auto-generated method stub
								return;
							}
						});
				dialog.show();
			}
		}
	}

	@Override
	public boolean onDrag(View layoutview, DragEvent dragevent) {
		// TODO Auto-generated method stub
		int action = dragevent.getAction();
		switch (action) {
		case DragEvent.ACTION_DRAG_STARTED:
			Log.d(LOGCAT, "Drag event started");
			break;
		case DragEvent.ACTION_DRAG_ENTERED:
			Log.d(LOGCAT, "Drag event entered into " + layoutview.toString());
			break;
		case DragEvent.ACTION_DRAG_EXITED:
			Log.d(LOGCAT, "Drag event exited from " + layoutview.toString());
			break;
		case DragEvent.ACTION_DROP:
			int layId = layoutview.getId();
			if (flag == 1 && layId == R.id.layout_QueueItem) {
				Toast.makeText(QueueInteractive.this, "Queue is full...",
						Toast.LENGTH_SHORT).show();
			} else {
				Log.d(LOGCAT, "Dropped");
				View view = (View) dragevent.getLocalState();
				ViewGroup owner = (ViewGroup) view.getParent();
				owner.removeView(view);
				LinearLayout container = (LinearLayout) layoutview;
				container.addView(view);
				view.setVisibility(View.VISIBLE);
				// btnId[i] = view.getId();
				if (container == owner) {

				} else {
					view.setOnTouchListener(null);
					view.setOnClickListener(this);
					vId[i] = view;
					i--;
					if (i < 0) {
						btnRemove.setEnabled(true);
						al = 0;
						i = 6;
						flag = 1;
					}
				}
			}
			break;
		case DragEvent.ACTION_DRAG_ENDED:
			Log.d(LOGCAT, "Drag ended");
			break;
		default:
			break;
		}
		return true;
	}

	@Override
	public boolean onTouch(View view, MotionEvent motionEvent) {
		// TODO Auto-generated method stub
		if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
			DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
			view.startDrag(null, shadowBuilder, view, 0);
			view.setVisibility(View.INVISIBLE);
			return true;
		} else {
			return false;
		}
	}

}
