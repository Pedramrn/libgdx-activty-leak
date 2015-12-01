package com.mygdx.game.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.mygdx.game.MyGdxGame;

public class AndroidLauncher extends FragmentActivity implements AndroidFragmentApplication.Callbacks{
	private static final String TAG = AndroidLauncher.class.getSimpleName();
	private static final String tag = BlankFragment.class.getSimpleName();
	private BlankFragment fragment;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		setContentView(R.layout.main);
		super.onCreate(savedInstanceState);
		fragment = new BlankFragment();
		getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment, tag).commit();
	}

	@Override
	public void exit() {
		getSupportFragmentManager().beginTransaction().remove(this.fragment).commit();
		this.fragment = null;
	}
}
