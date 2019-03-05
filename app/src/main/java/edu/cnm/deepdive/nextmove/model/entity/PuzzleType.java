package edu.cnm.deepdive.nextmove.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity()
public class PuzzleType {

  @ColumnInfo(name = "puzzle_type_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  private String name;
  private String fragment_class;
  private int value_multiplier;
  private int time_spent;

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

  public String getFragment_class() {
    return fragment_class;
  }

  public void setFragment_class(String fragment_class) {
    this.fragment_class = fragment_class;
  }

  public int getValue_multiplier() {
    return value_multiplier;
  }

  public void setValue_multiplier(int value_multiplier) {
    this.value_multiplier = value_multiplier;
  }

  public int getTime_spent() {
    return time_spent;
  }

  public void setTime_spent(int time_spent) {
    this.time_spent = time_spent;
  }


}
