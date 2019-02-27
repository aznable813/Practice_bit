package com.Include_prac;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.view.View.*;
import android.text.*;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.*;


public class MainActivity extends Activity 
{
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        InitView();

    }
	

	private void setLSNRs(){

		//set BD1 button1
		findViewById(R.id.incl_BD1_btn1).setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				TextView tv1 = findViewById(R.id.incl_BD3).findViewById(R.id.incl_BD1_txt1);
				tv1.setText("Changed 1st!!");
				Button BtnTxt2 = findViewById(R.id.incl_BD2_btn1);
				BtnTxt2.setText("Initialize View");
				TextView tv2 = findViewById(R.id.incl_BD1_txt2);
				tv2.setText("Changed 2nd!!");
			}
		});
		
		//set BD2 button1 Initialize
		findViewById(R.id.incl_BD2_btn1).setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				InitView();
			}
		});
		
	}
	
	//Initial View
	private void InitView(){
		setContentView(R.layout.main);
		setLSNRs();
	}
	
	
	
}
