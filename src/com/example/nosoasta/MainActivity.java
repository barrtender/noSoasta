package com.example.nosoasta;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        Button butt = (Button) findViewById(R.id.button1);

        OnClickListener buttListener = new myOnClickListener();
        butt.setOnClickListener(buttListener);
	}
    
    public class myOnClickListener implements OnClickListener {
        
		@Override
		public void onClick(View v) {
            TextView resultText = (TextView)findViewById(R.id.textView1);
            if(resultText.getText() != "Button pressed")
            	resultText.setText("Button pressed");
            else
            	resultText.setText("Button pressed again");
		}
    	
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
