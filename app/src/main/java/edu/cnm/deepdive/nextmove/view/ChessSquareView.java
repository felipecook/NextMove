package edu.cnm.deepdive.nextmove.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class ChessSquareView extends View {


  public ChessSquareView(Context context) {
    super(context);
  }

  public ChessSquareView(Context context,
       @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public ChessSquareView(Context context, @Nullable AttributeSet attrs,
      int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public ChessSquareView(Context context, @Nullable AttributeSet attrs,
      int defStyleAttr,
      int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    setBackgroundColor(Color.GREEN);
  }
}
