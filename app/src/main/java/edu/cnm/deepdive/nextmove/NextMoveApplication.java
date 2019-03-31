package edu.cnm.deepdive.nextmove;

import android.app.Application;
import com.facebook.stetho.Stetho;

/*
This class creates the instance for the application.
 */

/**
 * Extends {@link Application}, in order to initialize <a href="http://facebook.github.io/stetho/">Stetho</a>
 * inspection and set up access to this instance via the singleton pattern. On running, any instance
 * of an {@link Application} subclass is a de facto singleton.
 */
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
