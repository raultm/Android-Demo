package com.nscodermer.hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
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
		mostrarMensajeConfirmación();
		mostrarSaludoAntonioRecio();
		ponerImageAntonioRecio();
	}

	private void mostrarSaludoAntonioRecio() {
		TextView bocadillo = (TextView)findViewById(R.id.bocadillo);
		bocadillo.setText(R.string.mensaje_antonio);
	}

	private void ponerImageAntonioRecio() {
		ImageView characterImage = (ImageView)findViewById(R.id.character_image);
		characterImage.setImageResource(R.drawable.rancio_cigala);
	}

	private void mostrarMensajeConfirmación() {
		EditText inputName = (EditText) findViewById(R.id.input_name);
		Toast.makeText(Hello.this, inputName.getText() + ", ya eres un nuevo vecino.", 5).show();
	}
}