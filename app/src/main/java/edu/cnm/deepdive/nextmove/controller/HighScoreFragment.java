package edu.cnm.deepdive.nextmove.controller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.cnm.deepdive.nextmove.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HighScoreFragment extends Fragment {


  public HighScoreFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_high_score, container, false);
  }

}