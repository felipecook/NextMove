package edu.cnm.deepdive.nextmove.controller;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.cnm.deepdive.nextmove.R;


// Eventually this should work as an abstract class that allows my Home Screen Frag, Knights Tour
// Frag and NQueens Frag to display different information through the dialogue frag.
// TODO figure out what this does.

public abstract class InfoFragment extends Fragment {

  public abstract String getInfo();

}
