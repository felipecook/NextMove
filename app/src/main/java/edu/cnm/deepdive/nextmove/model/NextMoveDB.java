package edu.cnm.deepdive.nextmove.model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.Nullable;
import edu.cnm.deepdive.nextmove.NextMoveApplication;
import edu.cnm.deepdive.nextmove.model.NextMoveDB.Converters;
import edu.cnm.deepdive.nextmove.model.dao.PuzzleTypeDao;
import edu.cnm.deepdive.nextmove.model.dao.ScoreTableDao;
import edu.cnm.deepdive.nextmove.model.dao.UserDao;
import edu.cnm.deepdive.nextmove.model.entity.PuzzleType;
import edu.cnm.deepdive.nextmove.model.entity.Score;
import edu.cnm.deepdive.nextmove.model.entity.User;
import java.util.Calendar;

@Database(
    entities = {PuzzleType.class, Score.class, User.class},
    version = 1,
    exportSchema = true
)
@TypeConverters(Converters.class)

/*
This class is used to create converters for the information room will be retrieving, also creates an instance
holder for the application to get the necessary context for displaying information.
 */
public abstract class NextMoveDB extends RoomDatabase {

  private static final String DB_NAME = "nextmove_db";

  public synchronized static NextMoveDB getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public abstract PuzzleTypeDao getPuzzleTypeDao();

  public abstract ScoreTableDao getScoreTableDao();

  public abstract UserDao getUserDao();

  private static class InstanceHolder {

    private static final NextMoveDB INSTANCE = Room.databaseBuilder(
        NextMoveApplication.getInstance().getApplicationContext(), NextMoveDB.class, DB_NAME)
        .build();

  }

  public static class Converters {

    @Nullable
    @TypeConverter
    public static Calendar calendarFromLong(@Nullable Long milliseconds) {
      if (milliseconds != null) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        return calendar;
      }
      return null;
    }

    @Nullable
    @TypeConverter
    public static Long longFromCalendar(@Nullable Calendar calendar) {
      return (calendar != null) ? calendar.getTimeInMillis() : null;
    }

//    @Nullable
//    @TypeConverter
//    public static Date dateFromInt(@Nullable Integer days) {
//      return (days != null) ? Date.fromEpochDays(days) : null;
//    }

//    @Nullable
//    @TypeConverter
//    public static Integer intFromDate(@Nullable Date date) {
//      return (date != null) ? date.toEpochDays() : null;
//    }

  }


}
