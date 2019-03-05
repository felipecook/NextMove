package edu.cnm.deepdive.nextmove.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.nextmove.model.entity.User;
import java.util.List;

@Dao
public interface UserDao {

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  List<Long> insert(User... users);

  @Query("SELECT * FROM User")
  List<User> getAll();

  @Delete
  int delete(User... users);
}
