package edu.cnm.deepdive.nextmove.controller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import edu.cnm.deepdive.nextmove.R;

/*
The NQueens Frag will eventually display the NQueens chess problem. This will also include a timer
so that the user will know how long they have taken, and it will display a view so the user knows how
many queens they have placed.
 */
public class NQueensFragment extends ChessFragment implements OnClickListener {

  @Override
  public String getInfo() {
    return getActivity().getString(R.string.fragment_information);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override
  public void onClick(View v) {

  }
}
