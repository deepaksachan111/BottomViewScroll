package com.kpbird.bottommenubar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class BottomMenuFragment extends Fragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.bottom_menu, container, false);



		return view;
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.imageButton1:
			Toast.makeText(getActivity() ,"Button 1 clicked", Toast.LENGTH_LONG).show();
			break;
		case R.id.imageButton2:
			Toast.makeText(getActivity() ,"Button 2 clicked", Toast.LENGTH_LONG).show();
			break;
		case R.id.imageButton3:
			Toast.makeText(getActivity() ,"Button 3 clicked", Toast.LENGTH_LONG).show();
			break;
		case R.id.imageButton4:
			Toast.makeText(getActivity() ,"Button 4 clicked", Toast.LENGTH_LONG).show();
			break;
		}
	}
}
