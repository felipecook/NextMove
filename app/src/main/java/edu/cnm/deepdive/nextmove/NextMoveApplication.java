package edu.cnm.deepdive.nextmove;

import android.app.Application;
import com.facebook.stetho.Stetho;


public class NextMoveApplication extends Application {

  private static NextMoveApplication instance = null;

  @Override
  public void onCreate() {
    super.onCreate();
    instance = this;
    //Stetho.initializeWithDefaults(this);
  }

  public static NextMoveApplication getInstance() {
    return instance;
  }


}
