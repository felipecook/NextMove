package edu.cnm.deepdive.nextmove.controller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.cnm.deepdive.nextmove.R;


public class NQueensFragment extends InfoFragment {

  @Override
  public String getInfo() {
    return getActivity().getString(R.string.fragment_information);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_nqueens, container, false);
  }

}
