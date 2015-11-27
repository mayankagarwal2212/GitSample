package com.example.scientificcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calculator extends Activity{
	EditText ref;
	float num1=0,num2=0,ans=0;
	char ch;
	int ctr=0,temp=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		ref=(EditText)findViewById(R.id.editText1);
		ref.setText("0");
		
	}
	public void del(View v){
		if(ref.getText().toString()!="0"){
			ref.setText("0");
		}
		ctr=0;
		ch='=';
	}
	public void power(View v){
		finish();
	}
	public void one(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("1");
			temp=0;
		}
		else{
			ref.append("1");
			temp=0;
		}
	}
	public void two(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("2");
			temp=0;
		}
		else{
			ref.append("2");
			temp=0;
		}
	}
	public void three(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("3");
			temp=0;
		}
		else{
			ref.append("3");
			temp=0;
		}
	}
	public void four(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("4");
			temp=0;
		}
		else{
			ref.append("4");
			temp=0;
		}
	}
	public void five(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("5");
			temp=0;
		}
		else{
			ref.append("5");
			temp=0;
		}
	}
	public void six(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("6");
			temp=0;
		}
		else{
			ref.append("6");
			temp=0;
		}
	}
	public void seven(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("7");
			temp=0;
		}
		else{
			ref.append("7");
			temp=0;
		}
	}
	public void eight(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("8");
			temp=0;
		}
		else{
			ref.append("8");
			temp=0;
		}
	}
	public void nine(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if(temp==1){
			ref.setText("9");
			temp=0;
		}
		else{
			ref.append("9");
			temp=0;
		}
	}
	public void decimal(View v){
		if(temp==1){
			ref.setText("0.");
			temp=0;
		}
		else{
			ref.append(".");
			temp=0;
		}
	}
	public void zero(View v){
		if(ref.getText().toString().length()==1&&Integer.parseInt(ref.getText().toString())==0){
			ref.setText("");
		}
		if((ref.getText().toString())=="0"){	
		}
		else if(temp==1){
			ref.setText("0");
			temp=0;
		}
		else{
			ref.append("0");
			temp=0;
		}
	}
	public void add(View v){		
		if(ctr==0){
			num1=Float.parseFloat(ref.getText().toString());
			ch='+';
			ctr=1;
			ref.setText("0");
		}
		else if(ctr==1){
			num2=Float.parseFloat(ref.getText().toString());
			if(ch=='+'){
				num1+=num2;
				ref.setText(""+num1);
			}
			else if(ch=='-'){
				num1-=num2;
				ref.setText(""+num1);
			}
			else if(ch=='*'){
				num1*=num2;
				ref.setText(""+num1);
			}
			else if(ch=='%'){
				num1%=num2;
				ref.setText(""+num1);
			}
			else if(ch=='/'){
				num1/=num2;
				ref.setText(""+num1);
			}
			num2=0;
			ch='+';
			ref.setText("0");
		}
	}
	public void subtract(View v){
		if(ctr==0){
			num1=Float.parseFloat(ref.getText().toString());
			ch='-';
			ctr=1;
			ref.setText("0");
		}
		else if(ctr==1){
			num2=Float.parseFloat(ref.getText().toString());
			if(ch=='+'){
				num1+=num2;
				ref.setText(""+num1);
			}
			else if(ch=='-'){
				num1-=num2;
				ref.setText(""+num1);
			}
			else if(ch=='*'){
				num1*=num2;
				ref.setText(""+num1);
			}
			else if(ch=='%'){
				num1%=num2;
				ref.setText(""+num1);
			}
			else if(ch=='/'){
				num1/=num2;
				ref.setText(""+num1);
			}
			num2=0;
			ch='-';
			ref.setText("0");
		}
	}
	public void multiply(View v){
		if(ctr==0){
			num1=Float.parseFloat(ref.getText().toString());
			ch='*';
			ctr=1;
			ref.setText("0");
		}
		else if(ctr==1){
			num2=Float.parseFloat(ref.getText().toString());
			if(ch=='+'){
				num1+=num2;
				ref.setText(""+num1);
			}
			else if(ch=='-'){
				num1-=num2;
				ref.setText(""+num1);
			}
			else if(ch=='*'){
				num1*=num2;
				ref.setText(""+num1);
			}
			else if(ch=='%'){
				num1%=num2;
				ref.setText(""+num1);
			}
			else if(ch=='/'){
				num1/=num2;
				ref.setText(""+num1);
			}
			num2=0;
			ch='*';
			ref.setText("0");
		}
	}
	public void divide(View v){
		if(ctr==0){
			num1=Float.parseFloat(ref.getText().toString());
			ch='/';
			ctr=1;
			ref.setText("0");
		}
		else if(ctr==1){
			num2=Float.parseFloat(ref.getText().toString());
			if(ch=='+'){
				num1+=num2;
				ref.setText(""+num1);
			}
			else if(ch=='-'){
				num1-=num2;
				ref.setText(""+num1);
			}
			else if(ch=='*'){
				num1*=num2;
				ref.setText(""+num1);
			}
			else if(ch=='%'){
				num1%=num2;
				ref.setText(""+num1);
			}
			else if(ch=='/'){
				num1/=num2;
				ref.setText(""+num1);
			}
			num2=0;
			ch='/';
			ref.setText("0");
		}
	}
	public void remainder(View v){
		if(ctr==0){
			num1=Float.parseFloat(ref.getText().toString());
			ch='%';
			ctr=1;
			ref.setText("0");
		}
		else if(ctr==1){
			num2=Float.parseFloat(ref.getText().toString());
			if(ch=='+'){
				num1+=num2;
				ref.setText(""+num1);
			}
			else if(ch=='-'){
				num1-=num2;
				ref.setText(""+num1);
			}
			else if(ch=='*'){
				num1*=num2;
				ref.setText(""+num1);
			}
			else if(ch=='%'){
				num1%=num2;
				ref.setText(""+num1);
			}
			else if(ch=='/'){
				num1/=num2;
				ref.setText(""+num1);
			}
			num2=0;
			ch='%';
			ref.setText("0");
		}
	}
	public void equal(View v){
		num2=Float.parseFloat(ref.getText().toString());
		if(ch=='+'){
			num1+=num2;
			ref.setText(""+num1);
		}
		else if(ch=='-'){
			num1-=num2;
			ref.setText(""+num1);
		}
		else if(ch=='*'){
			num1*=num2;
			ref.setText(""+num1);
		}
		else if(ch=='%'){
			num1%=num2;
			ref.setText(""+num1);
		}
		else if(ch=='/'){
			num1/=num2;
			ref.setText(""+num1);
		}
		ch='=';
		ctr=0;
		temp=1;
	}
	public void square(View v){
		num2=Float.parseFloat(ref.getText().toString());
		num2*=num2;
		temp=1;
		ref.setText(""+num2);
	}
	public void cube(View v){
		num2=Float.parseFloat(ref.getText().toString());
		temp=1;
		num2=num2*num2*num2;
		ref.setText(""+num2);
	}
	public void sqrt(View v){
		num2=Float.parseFloat(ref.getText().toString());
		num2=(float) Math.sqrt(num2);
		temp=1;
		ref.setText(""+num2);
	}
	public void hex(View v){
		num2=Float.parseFloat(ref.getText().toString());
		temp=1;
		ref.setText(""+Integer.toHexString((int)num2));
	}
	public void binary(View v){
		num2=Float.parseFloat(ref.getText().toString());
		temp=1;
		ref.setText(""+Integer.toBinaryString((int)num2));
	}
	public void octal(View v){
		num2=Float.parseFloat(ref.getText().toString());
		temp=1;
		ref.setText(""+Integer.toOctalString((int)num2));
	}
	public void pi(View v){
		ref.setText(""+Math.PI);
		temp=1;		
	}
	public void sine(View v){
		num2=Float.parseFloat(ref.getText().toString());
		num2=(float) Math.sin(num2);
		temp=1;
		ref.setText(""+num2);
	}	
	public void cosine(View v){
		num2=Float.parseFloat(ref.getText().toString());
		num2=(float) Math.cos(num2);
		temp=1;
		ref.setText(""+num2);
	}	
	public void tan(View v){
		num2=Float.parseFloat(ref.getText().toString());
		num2=(float) Math.tan(num2);
		temp=1;
		ref.setText(""+num2);
	}	
	public void sinh(View v){
		num2=Float.parseFloat(ref.getText().toString());
		num2=(float) Math.sinh(num2);
		temp=1;
		ref.setText(""+num2);
	}
	public void cosh(View v){
		num2=Float.parseFloat(ref.getText().toString());
		num2=(float) Math.cosh(num2);
		temp=1;
		ref.setText(""+num2);
	}
	public void tanh(View v){
		num2=Float.parseFloat(ref.getText().toString());
		num2=(float) Math.tanh(num2);
		temp=1;
		ref.setText(""+num2);
	}		
	public void val_e(View v){
		ref.setText(""+Math.E);
		temp=1;		
	}
}
