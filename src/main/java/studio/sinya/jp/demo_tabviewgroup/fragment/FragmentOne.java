package studio.sinya.jp.demo_tabviewgroup.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import studio.sinya.jp.demo_tabviewgroup.R;


public class FragmentOne extends Fragment{


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_one, null);
		return view;
	}	
}