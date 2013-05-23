package com.example.helloandroid2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	private EditText text1;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		Button button1 =(Button) this.findViewById(R.id.button2);
//		button1.setOnClickListener(new ButtonClickListener());
		text1=(EditText)this.findViewById(R.id.edit_message);
		//add by shiyb
		//add by shiyb2
	}
	@Override
	protected void onStart() {
		super.onStart();

	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onRestart() {
		super.onRestart();

	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendMessage(View view)
	{
		Intent intent = new Intent(this, SubActivityTest.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);

//		Toast.makeText(MainActivity.this,text1.getText()+"xx", Toast.LENGTH_LONG).show();
	}
//	private class ButtonClickListener implements View.OnClickListener{  
//		  
//		       public void onClick(View v) {  
//		    	   Toast.makeText(MainActivity.this,text1.getText(), Toast.LENGTH_LONG).show();
//
//		       }  
//		       }


	
	
}
