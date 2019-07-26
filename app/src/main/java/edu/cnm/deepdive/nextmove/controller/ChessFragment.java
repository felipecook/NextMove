package edu.cnm.deepdive.nextmove.controller;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import edu.cnm.deepdive.nextmove.R;


/**
 * Populates a {@link Fragment} with the chess image necessary for the game to be able to be
 * played.
 */
public abstract class ChessFragment extends InfoFragment {

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.board, container, false);
    ImageView[] arrImages = constructBoardArray(view);
    return view;
  }

  /**
   * Creates the board array which is then inflated in the xml document.
   * @param view
   * @return
   */
  protected ImageView[] constructBoardArray (View view) {
    ImageView[] arrImages = new ImageView[64];


    arrImages[0] = (ImageView) view.findViewById(R.id.a8);
    arrImages[1] = (ImageView) view.findViewById(R.id.b8);
    arrImages[2] = (ImageView) view.findViewById(R.id.c8);
    arrImages[3] = (ImageView) view.findViewById(R.id.d8);
    arrImages[4] = (ImageView) view.findViewById(R.id.e8);
    arrImages[5] = (ImageView) view.findViewById(R.id.f8);
    arrImages[6] = (ImageView) view.findViewById(R.id.g8);
    arrImages[7] = (ImageView) view.findViewById(R.id.h8);

    arrImages[8] = (ImageView) view.findViewById(R.id.a7);
    arrImages[9] = (ImageView) view.findViewById(R.id.b7);
    arrImages[10] = (ImageView) view.findViewById(R.id.c7);
    arrImages[11] = (ImageView) view.findViewById(R.id.d7);
    arrImages[12] = (ImageView) view.findViewById(R.id.e7);
    arrImages[13] = (ImageView) view.findViewById(R.id.f7);
    arrImages[14] = (ImageView) view.findViewById(R.id.g7);
    arrImages[15] = (ImageView) view.findViewById(R.id.h7);

    arrImages[16] = (ImageView) view.findViewById(R.id.a6);
    arrImages[17] = (ImageView) view.findViewById(R.id.b6);
    arrImages[18] = (ImageView) view.findViewById(R.id.c6);
    arrImages[19] = (ImageView) view.findViewById(R.id.d6);
    arrImages[20] = (ImageView) view.findViewById(R.id.e6);
    arrImages[21] = (ImageView) view.findViewById(R.id.f6);
    arrImages[22] = (ImageView) view.findViewById(R.id.g6);
    arrImages[23] = (ImageView) view.findViewById(R.id.h6);

    arrImages[24] = (ImageView) view.findViewById(R.id.a5);
    arrImages[25] = (ImageView) view.findViewById(R.id.b5);
    arrImages[26] = (ImageView) view.findViewById(R.id.c5);
    arrImages[27] = (ImageView) view.findViewById(R.id.d5);
    arrImages[28] = (ImageView) view.findViewById(R.id.e5);
    arrImages[29] = (ImageView) view.findViewById(R.id.f5);
    arrImages[30] = (ImageView) view.findViewById(R.id.g5);
    arrImages[31] = (ImageView) view.findViewById(R.id.h5);

    arrImages[32] = (ImageView) view.findViewById(R.id.a4);
    arrImages[33] = (ImageView) view.findViewById(R.id.b4);
    arrImages[34] = (ImageView) view.findViewById(R.id.c4);
    arrImages[35] = (ImageView) view.findViewById(R.id.d4);
    arrImages[36] = (ImageView) view.findViewById(R.id.e4);
    arrImages[37] = (ImageView) view.findViewById(R.id.f4);
    arrImages[38] = (ImageView) view.findViewById(R.id.g4);
    arrImages[39] = (ImageView) view.findViewById(R.id.h4);

    arrImages[40] = (ImageView) view.findViewById(R.id.a3);
    arrImages[41] = (ImageView) view.findViewById(R.id.b3);
    arrImages[42] = (ImageView) view.findViewById(R.id.c3);
    arrImages[43] = (ImageView) view.findViewById(R.id.d3);
    arrImages[44] = (ImageView) view.findViewById(R.id.e3);
    arrImages[45] = (ImageView) view.findViewById(R.id.f3);
    arrImages[46] = (ImageView) view.findViewById(R.id.g3);
    arrImages[47] = (ImageView) view.findViewById(R.id.h3);

    arrImages[48] = (ImageView) view.findViewById(R.id.a2);
    arrImages[49] = (ImageView) view.findViewById(R.id.b2);
    arrImages[50] = (ImageView) view.findViewById(R.id.c2);
    arrImages[51] = (ImageView) view.findViewById(R.id.d2);
    arrImages[52] = (ImageView) view.findViewById(R.id.e2);
    arrImages[53] = (ImageView) view.findViewById(R.id.f2);
    arrImages[54] = (ImageView) view.findViewById(R.id.g2);
    arrImages[55] = (ImageView) view.findViewById(R.id.h2);

    arrImages[56] = (ImageView) view.findViewById(R.id.a1);
    arrImages[57] = (ImageView) view.findViewById(R.id.b1);
    arrImages[58] = (ImageView) view.findViewById(R.id.c1);
    arrImages[59] = (ImageView) view.findViewById(R.id.d1);
    arrImages[60] = (ImageView) view.findViewById(R.id.e1);
    arrImages[61] = (ImageView) view.findViewById(R.id.f1);
    arrImages[62] = (ImageView) view.findViewById(R.id.g1);
    arrImages[63] = (ImageView) view.findViewById(R.id.h1);

    return arrImages;
  }
}
