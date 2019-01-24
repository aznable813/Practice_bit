package com.Include_prac;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.view.View.*;
import android.text.*;

public class MainActivity extends Activity 
{
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		setLSNRs();
		//set listeners	
    }
	

	private void setLSNRs(){


		//set BD1 button1
		findViewById(R.id.incl_BD1_btn1).setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				TextView tv1 = findViewById(R.id.incl_BD3).findViewById(R.id.incl_BD1_txt1);
				tv1.setText("Changed 1st!!");
				TextView tv2 = findViewById(R.id.incl_BD1_txt2);
				tv2.setText("Changed 2nd!!");
				
			}
			
			
		});

	}
	
	
	
	
	
}
