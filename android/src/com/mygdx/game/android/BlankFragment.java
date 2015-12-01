package com.mygdx.game.android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.mygdx.game.MyGdxGame;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends AndroidFragmentApplication {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        return initializeForView(new MyGdxGame(), config);
    }

}
