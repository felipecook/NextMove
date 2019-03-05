package edu.cnm.deepdive.nextmove.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity()
public class PuzzleType {

  @ColumnInfo(name = "puzzle_type_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "name")
  private String name;

  @ColumnInfo(name = "fragment_class")
  private String fragmentClass;

  @ColumnInfo(name = "value_multiplier")
  private int valueMultiplier;

  @ColumnInfo(name = "time_spent")
  private int timeSpent;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFragmentClass() {
    return fragmentClass;
  }

  public void setFragmentClass(String fragmentClass) {
    this.fragmentClass = fragmentClass;
  }

  public int getValueMultiplier() {
    return valueMultiplier;
  }

  public void setValueMultiplier(int valueMultiplier) {
    this.valueMultiplier = valueMultiplier;
  }

  public int getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(int timeSpent) {
    this.timeSpent = timeSpent;
  }


}
