package edu.cnm.deepdive.nextmove.model.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = User.class,
            parentColumns = "user_id", childColumns = "user_id",
            onDelete = ForeignKey.CASCADE
        ),
        @ForeignKey(
            entity = PuzzleType.class,
            parentColumns = "puzzle_type_id", childColumns = "puzzle_type_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class Score {

  @ColumnInfo(name = "score_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "time_starts")
  private int timeStarts;

  @ColumnInfo(name = "score_time")
  private int scoreTime;

  @ColumnInfo(name = "value")
  private int value;

  @ColumnInfo(name = "user_id", index = true)
  private int userId;

  @ColumnInfo(name = "puzzle_type_id", index = true)
  private int puzzleTypeId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getPuzzleTypeId() {
    return puzzleTypeId;
  }

  public void setPuzzleTypeId(int puzzleTypeId) {
    this.puzzleTypeId = puzzleTypeId;
  }

  public int getTimeStarts() {
    return timeStarts;
  }

  public void setTimeStarts(int timeStarts) {
    this.timeStarts = timeStarts;
  }

  public int getScoreTime() {
    return scoreTime;
  }

  public void setScoreTime(int scoreTime) {
    this.scoreTime = scoreTime;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
