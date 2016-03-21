package com.example.Playplane;

import com.example.Playplane.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	private MainView mainView;
	private ReadyView readyView;
	private EndView endView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		readyView = new ReadyView(this);//huaah
		setContentView(readyView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	//��ʾ��Ϸ����
	public void toMainView(){
		mainView = new MainView(this);
		setContentView(mainView);
		readyView = null;
	}
	//��ʾ��������
	public void toEndView(int scoreSum){
		System.gc();
		endView = new EndView(this,scoreSum);
		setContentView(endView);
		mainView = null;
	}
}
