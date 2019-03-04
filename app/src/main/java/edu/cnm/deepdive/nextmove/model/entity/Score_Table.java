package edu.cnm.deepdive.nextmove.model.entity;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(
    foreignKeys = @ForeignKey(
        entity = User.class,
        parentColumns = "score_id", childColumns = "score_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class Score_Table {

}
