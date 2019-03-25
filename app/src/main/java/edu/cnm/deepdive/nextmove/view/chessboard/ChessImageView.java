package edu.cnm.deepdive.nextmove.view.chessboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import edu.cnm.deepdive.nextmove.R;

public class ChessImageView extends View {

  public static final String TAG = "ChessImageView";

  public static Bitmap[][] _arrPieceBitmaps = new Bitmap[2][6];
  public static Bitmap _bmpBorder, _bmpSelect, _bmpSelectLight;
  public static Bitmap _bmpTile;

  private static String _sActivity;


  // 5 colorschemes with 2 colors each
  public static int[][] arrColorScheme = new int[6][3];
  public static int colorScheme = 0;
  public static Paint paint = new Paint();
  public static Matrix matrix = null;
  public static Matrix matrixTile = null;

  static {
    paint.setFlags(Paint.ANTI_ALIAS_FLAG);
    paint.setFilterBitmap(true);
  }

  private ImageCacheObject ico;

  public ChessImageView(Context context) {
    super(context);
    setFocusable(true);
  }

  public ChessImageView(Context context, AttributeSet atts) {
    super(context, atts);
    setFocusable(true);
  }

  public void init() {

  }

  public void setICO(ImageCacheObject ico) {
    this.ico = ico;
  }

  public ImageCacheObject getICO() {
    return ico;
  }

  public void onDraw(Canvas canvas) {

    if (arrColorScheme[0][0] == 0) {
      return;
    }

    if (matrix == null) {
      ChessImageView.matrix = new Matrix();

      float scale = 1.0F;
      Bitmap bmp = ChessImageView._arrPieceBitmaps[ChessBoard.WHITE][ChessBoard.PAWN]; // any dynamic

      scale = (float) getWidth() / bmp.getWidth();
      Log.i("paintBoard", "init " + scale + " : " + bmp.getWidth() + ", " + getWidth());

      ChessImageView.matrix.setScale(scale, scale);

      if (ChessImageView._bmpTile != null) {
        ChessImageView.matrixTile = new Matrix();
        bmp = ChessImageView._bmpTile;
        scale = (float) getWidth() / bmp.getWidth();
        ChessImageView.matrixTile.setScale(scale, scale);
      }
    }

    Bitmap bmp;
    ImageCacheObject ico = this.ico;

    // first draw field background
    if (ico == null) {
      Log.e("err", "err");
    }

    SharedPreferences pref = getContext().getSharedPreferences("ChessPlayer", Context.MODE_PRIVATE);

    if (hasFocus()) {
      paint.setColor(0xffff9900);
      canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint);
    } else {
      if (colorScheme == 6) { // 6 is color picker
        paint.setColor(ico._fieldColor == 0 ? pref.getInt("color2", 0xffdddddd)
            : pref.getInt("color1", 0xffff0066));
        canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint);
        if (ico._selected) {
          paint.setColor(pref.getInt("color3", 0xcc00dddd) & 0xccffffff);
          canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint);
        }
      } else {
        paint.setColor(ico._fieldColor == 0 ? arrColorScheme[colorScheme][0]
            : arrColorScheme[colorScheme][1]);
        canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint);
        if (ico._selected) {
          paint.setColor(arrColorScheme[colorScheme][2]);
          canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint);
        }
      }
    }

    if (ChessImageView._bmpTile != null) {
      canvas.drawBitmap(_bmpTile, matrixTile, paint);
    }

    //paint.setColor(Color.BLACK);
    if (_bmpBorder != null && (ico._selected || hasFocus())) {
      canvas.drawBitmap(_bmpBorder, matrix, paint);
    }

    if (ico._selectedPos) {
      canvas.drawBitmap(_bmpSelectLight, matrix, paint);
    }

    if (ico._bPiece) {

      bmp = _arrPieceBitmaps[ico.color][ico.piece];
      _sActivity = (start.get_ssActivity() == null) ? "" : start.get_ssActivity();

      // todo if it's fine then will put back && statements
      if (_sActivity.equals(getContext().getString(R.string.start_play))) {
        if (options.is_sbFlipTopPieces()) {
          if ((options.is_sbPlayAsBlack() ? ico.color == 1
              : ico.color == 0)) {   // flips top pieces for human vs human without
            canvas.rotate(180, getWidth() / 2,
                getHeight() / 2);                 // autoflip on in Play mode
          }
        }
      }

      canvas.drawBitmap(bmp, matrix, paint);

    }

    if (ico.coord != null) {
      paint.setColor(0x99ffffff);

      canvas.drawRect(0, getHeight() - 14, paint.measureText(ico.coord) + 4, getHeight(), paint);

      paint.setColor(Color.BLACK);

      paint.setTextSize(getHeight() > 50 ? (int) (getHeight() / 5) : 10);

      canvas.drawText(ico.coord, 2, getHeight() - 2, paint);

      if (ico.coord.equals("A")
          && !ImageCacheObject._flippedBoard) {  // bottom-left corner coordinates
        canvas.drawText("1", 2, getHeight() - 30, paint);
      } else if (ico.coord.equals("H") && ImageCacheObject._flippedBoard) {
        canvas.drawText("8", 2, getHeight() - 30, paint);
      }

    }
  }

  @Override
  protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
    super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
  }


}
