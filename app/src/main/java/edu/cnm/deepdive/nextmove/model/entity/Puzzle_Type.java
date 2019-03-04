package edu.cnm.deepdive.nextmove.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(
    foreignKeys = @ForeignKey(
        entity = Score_Table.class,
        parentColumns = "puzzle_type_id", childColumns = "puzzle_type_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class Puzzle_Type {

}
