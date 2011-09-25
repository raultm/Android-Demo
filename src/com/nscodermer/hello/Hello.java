package com.nscodermer.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Hello extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View neighbourButton = findViewById(R.id.action_button); 
        neighbourButton.setOnClickListener(this); 
    }

	@Override
	public void onClick(View v) {
		Log.v("Home","Id del Button : "+v.getId());
	}
}