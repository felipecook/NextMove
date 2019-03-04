package edu.cnm.deepdive.nextmove.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(
    foreignKeys = @ForeignKey(
        entity = Score_Table.class,
        parentColumns = "user_id", childColumns = "user_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class User {

}
