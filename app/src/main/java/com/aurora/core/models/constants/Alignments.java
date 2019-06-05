package com.aurora.core.models.constants;

import static com.aurora.core.database.DbTableNames.ALIGNMENTS;

import lombok.Data;
import lombok.EqualsAndHashCode;

import androidx.room.Entity;
import androidx.room.Ignore;
import lombok.experimental.SuperBuilder;

import com.aurora.core.models.helpers.Rules;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Entity(tableName = ALIGNMENTS, inheritSuperIndices = true)
public class Alignments extends Rules {

  @Ignore
  public Alignments() {
    super();
  }

  public Alignments(String name) {
    super(name);
  }

  public Alignments clone() {
    return new Alignments(getName());
  }
}