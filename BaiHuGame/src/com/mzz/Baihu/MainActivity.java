package com.mzz.Baihu;

import com.mzz.Baihu.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private float size1=0;
	
	private int mzz1=0;
	private int mzz2=0;
	private int mzz3=0;
	private int mzz4=0;
	
	private int cm1=0;
	private int cm2=0;
	private int cm3=0;
	private int cm4=0;
	
	private int merce1=0;
	private int merce2=0;
	private int merce3=0;
	private int merce4=0;
	
	int scm1=0;
	int scm2=0;
	int scm3=0;
	int scm4=0;
	
	
	float smzz1=0;
	float smzz2=0;
	float smzz3=0;
	float smzz4=0;
	
	float ss1=0;
	float ss2=0;
	float ss3=0;
	float ss4=0;
	
	private TextView rs1,rs2,rs3,rs4;
	
	private EditText 
	size,
	mzztext1,
	mzztext2,
	mzztext3,
	mzztext4,
	cmtext1,
	cmtext2,
	cmtext3,
	cmtext4,
	mercetext1,
	mercetext2,
	mercetext3,
	mercetext4;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rs1=(TextView)findViewById(R.id.result1);
		rs2=(TextView)findViewById(R.id.result2);
		rs3=(TextView)findViewById(R.id.result3);
		rs4=(TextView)findViewById(R.id.result4);
		size=(EditText)findViewById(R.id.edSize);
	 mzztext1=(EditText)findViewById(R.id.mzz1);
	 mzztext2=(EditText)findViewById(R.id.mzz2);
	 mzztext3=(EditText)findViewById(R.id.mzz3);	
	 mzztext4=(EditText)findViewById(R.id.mzz4);
	 cmtext1=(EditText)findViewById(R.id.cm1);
	 cmtext2=(EditText)findViewById(R.id.cm2);
	 cmtext3=(EditText)findViewById(R.id.cm3);
	 cmtext4=(EditText)findViewById(R.id.cm4);
	 mercetext1=(EditText)findViewById(R.id.merce1);
	 mercetext2=(EditText)findViewById(R.id.merce2);
	 mercetext3=(EditText)findViewById(R.id.merce3);
	 mercetext4=(EditText)findViewById(R.id.merce4);
	}
	
	
	public void getResult(View view){
	
	size1= Float.parseFloat(size.getText().toString());
	

	mzz1=Integer.parseInt(mzztext1.getText().toString());	
	mzz2=Integer.parseInt(mzztext2.getText().toString());
	mzz3=Integer.parseInt(mzztext3.getText().toString());
	mzz4=Integer.parseInt(mzztext4.getText().toString());
	

	cm1=Integer.parseInt(cmtext1.getText().toString());
	cm2=Integer.parseInt(cmtext2.getText().toString());
	cm3=Integer.parseInt(cmtext3.getText().toString());
	cm4=Integer.parseInt(cmtext4.getText().toString());

	merce1=Integer.parseInt(mercetext1.getText().toString());
	merce2=Integer.parseInt(mercetext2.getText().toString());
	merce3=Integer.parseInt(mercetext3.getText().toString());
	merce4=Integer.parseInt(mercetext4.getText().toString());
	
	
	int []mzz={mzz1,mzz2,mzz3,mzz4};
	
	int []cm= {cm1,cm2,cm3,cm4};
	
	int []merce={merce1,merce2,merce3,merce4};
	
	int []scm={scm1,scm2,scm3,scm4};
	
	float []smzz={smzz1,smzz2,smzz3,smzz4};
			
			
	
	for(int i=0;i<4;i++){
		if(merce[i]%10<5){
			merce[i]=merce[i]/10*10;
		}
		else {if(merce[i]<0){
			merce[i]=(merce[i]/10-1)*10;
		}else{
			merce[i]=(merce[i]/10+1)*10;
			}
		}
	}
	
	
	for(int j=0;j<4;j++){
		for(int i=0;i<4;i++){
			smzz[j]+=(merce[j]-merce[i])*size1*(mzz[j]+1)*(mzz[i]+1);
		}
	}

	for(int j=0;j<4;j++){
		for(int i=0;i<4;i++){
			if(cm[j]-cm[i]<0){
				scm[j]+=-cm[j]-cm[i];
			}else if(cm[j]-cm[i]>0){
				scm[j]+=cm[j]+cm[i];
			}else continue;
			}
		}
	
	
	ss1=smzz[0]+scm[0];
	
		ss2=smzz[1]+scm[1];
		
		ss3=smzz[2]+scm[2];
		
		ss4=smzz[3]+scm[3];
	/*	System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		System.out.println(ss4);*/
		rs1.setText(ss1+"");
		rs2.setText(ss2+"");
		rs3.setText(ss3+"");
		rs4.setText(ss4+"");
	}
	

	public void clean(View view){
		size.setText("0");
		mzztext1.setText("0");
		mzztext2.setText("0");
		mzztext3.setText("0");
		mzztext4.setText("0");
		cmtext1.setText("0");
		cmtext2.setText("0");
		cmtext3.setText("0");
		cmtext4.setText("0");
		mercetext1.setText("0");
		mercetext2.setText("0");
		mercetext3.setText("0");
		mercetext4.setText("0");
		rs1.setText("0");
		rs2.setText("0");
		rs3.setText("0");
		rs4.setText("0");
	}
	
	public void exit(View view){
		finish();
	}

}
