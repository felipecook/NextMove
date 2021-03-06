package edu.cnm.deepdive.nextmove.controller;


import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.cnm.deepdive.nextmove.R;

// This fragment functions as the code for the info button that is located in options.xml
// TODO Make the information change depending on which fragment i am located in.
public class DialogueFragment extends DialogFragment {


  @NonNull
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    AlertDialog.Builder builder = new Builder(getActivity());
    builder.setMessage(R.string.fragment_information);
    return builder.create();
  }
}
