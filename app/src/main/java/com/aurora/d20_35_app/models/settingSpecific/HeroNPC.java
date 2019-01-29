package com.aurora.d20_35_app.models.settingSpecific;

import com.aurora.d20_35_app.models.Databases;
import com.aurora.d20_35_app.models.userData.Hero;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(tableName = "HeroNPC", inheritSuperIndices = true,
        indices = {@Index(value = "Source")},
        foreignKeys = @ForeignKey(entity = Databases.class, parentColumns = "Source", childColumns = "Source", onDelete = ForeignKey.CASCADE))
public class HeroNPC extends Hero {

    @Ignore
    public HeroNPC() {
        super();
    }

    public HeroNPC(String name,
                   String source,
                   String idAsNameBackup) {
        super(name,
                source,
                idAsNameBackup);
    }

    public HeroNPC clone() {
        return new HeroNPC(
                getName(),
                getSource(),
                getIdAsNameBackup());
    }
}
