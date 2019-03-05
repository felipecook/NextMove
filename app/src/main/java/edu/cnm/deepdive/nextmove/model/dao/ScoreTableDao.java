package edu.cnm.deepdive.nextmove.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import edu.cnm.deepdive.nextmove.model.entity.ScoreTable;
import java.util.List;

@Dao
public interface ScoreTableDao {

  @Insert
  List<Long> insert(ScoreTable... scoreTables);

  @Insert
  List<Long> insert(List<ScoreTable> scoreTables);
}
