package edu.cnm.deepdive.nextmove.model.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(
    foreignKeys = @ForeignKey(
        entity = User.class,
        parentColumns = "score_id", childColumns = "score_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class ScoreTable {

    @ColumnInfo(name = "score_id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    private int time_starts;
    private int score_time;
    private int value;

    public int getTime_starts() {
        return time_starts;
    }

    public void setTime_starts(int time_starts) {
        this.time_starts = time_starts;
    }

    public int getScore_time() {
        return score_time;
    }

    public void setScore_time(int score_time) {
        this.score_time = score_time;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
