package edu.cnm.deepdive.nextmove;

import android.app.Application;

public class NextMoveApplication extends Application {

  private static NextMoveApplication instance = null;

  @Override
  public void onCreate() {
    super.onCreate();
    instance = this;
  }

  public static NextMoveApplication getInstance() {
    return instance;
  }


}
