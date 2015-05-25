package com.example.camp_exam_systeminfo;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	private TextView tvInfo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvInfo = (TextView) findViewById(R.id.info);
	}

	@Override
	protected void onResume() {
		super.onResume();

		String sysInfo = getSystemInfo();
		tvInfo.setText(sysInfo);
	}

	public String getSystemInfo() {
		String sysInfo = "BOARD: " + Build.BOARD;
		sysInfo += "\nBOOTLOADER: " + Build.BOOTLOADER;
		sysInfo += "\nBRAND: " + Build.BRAND;
		sysInfo += "\nDEVICE: " + Build.DEVICE;
		sysInfo += "\nHARDWARE: " + Build.HARDWARE;
		sysInfo += "\nHOST: " + Build.HOST;
		sysInfo += "\nID: " + Build.ID;
		sysInfo += "\nMANUFACTURER: " + Build.MANUFACTURER;
		sysInfo += "\nMODEL: " + Build.MODEL;
		sysInfo += "\nPRODUCT: " + Build.PRODUCT;
		sysInfo += "\nSERIAL: " + Build.SERIAL;
		sysInfo += "\nTAGS: " + Build.TAGS;
		sysInfo += "\nTIME: " + Build.TIME;
		sysInfo += "\nTYPE: " + Build.TYPE;
		sysInfo += "\nUSER: " + Build.USER;

		return sysInfo;
	}
}
