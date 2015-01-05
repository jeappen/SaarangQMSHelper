package org.saarang.qmshelper;

import org.saarang.qmshelper.R;

import org.saarang.qmshelper.reused.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	Button pbut,ebut,fbut;
	String user,pass;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		user = null;//getIntent().getStringExtra("user");
		pass = null;//getIntent().getStringExtra("pass");
		user = "test";//getIntent().getStringExtra("user");
		pass = "test";
		Log.i("chooseUser", user);
		Log.i("choosePass", pass);
		setContentView(R.layout.main);

		pbut = (Button) findViewById(R.id.button1);
		ebut= (Button) findViewById(R.id.button2);
        fbut= (Button) findViewById(R.id.button3);
		pbut.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
						Intent intent = new Intent(Main.this, Passport.class);
						intent.putExtra("user", user);
						intent.putExtra("pass", pass);
						// i.putExtra("myStrings",myStrings);
						startActivity(intent);
					}
				});
		ebut.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Main.this, Choose.class);
				intent.putExtra("user", user);
				intent.putExtra("pass", pass);
				startActivity(intent);
					}
				});
	
fbut.setVisibility(View.GONE);
        fbut.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View arg0) {
            Intent intent = new Intent(Main.this, FeedbackMain.class);
            intent.putExtra("user", user);
            intent.putExtra("pass", pass);
            startActivity(intent);
        }
    });

}

}
