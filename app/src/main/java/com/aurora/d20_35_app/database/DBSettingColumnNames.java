package com.aurora.d20_35_app.database;

import com.aurora.d20_35_app.models.Translations;
import com.aurora.d20_35_app.models.helpers.Item;
import com.aurora.d20_35_app.models.settingSpecific.Races;
import com.aurora.d20_35_app.models.usables.Armour;
import com.aurora.d20_35_app.models.userData.HeroPlayer;

import lombok.Getter;

public enum DBSettingColumnNames implements DBColumnNamesMethods<DBSettingColumnNames, Item> {


    ////////////////////////////////////////////////////////////////
    //////////////////////////  Databases  ////////////////////////

    /**
     * Data more or less depending on setting
     */
    /////////////////////////////////////////////////////////////
    //////////////////////////  ITEM  //////////////////////////
    COL_ITEM_ID(DBColumnNames.ITEM_ID_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            item.setItemID(Integer.parseInt(data));
        }
    },
    COL_ITEM_NAME(DBColumnNames.ITEM_NAME_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            item.setName(data);
        }
    },
    COL_SOURCE(DBColumnNames.SOURCE_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            item.setSource(data);
        }
    },
    COL_ID_AS_NAME_BACKUP(DBColumnNames.ID_AS_NAME_BACKUP_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            item.setIdAsNameBackup(data);
        }
    },

    //////////////////////////////////////////////////////////////
    //////////////////////////  ARMOUR  //////////////////////////
    COL_ARMOUR_PRICE(DBColumnNames.ARMOUR_PRICE_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourPrice(data);
        }
    },
    COL_ARMOUR_DEFLECTION(DBColumnNames.ARMOUR_DEFLECTION_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourDeflection(data);
        }
    },
    ColArmourMaxDexterityBonus(DBColumnNames.ARMOUR_MAX_DEXTERITY_BONUS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourMaxDexterityBonus(data);
        }
    },
    COL_ARMOUR_PENALTY(DBColumnNames.ARMOUR_PENALTY_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourPenalty(data);
        }
    },
    COL_ARMOUR_ARCANE_FAILURE(DBColumnNames.ARMOUR_ARCANE_FAILURE_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourArcaneFailure(data);
        }
    },
    COL_ARMOUR_MAX_SPEED(DBColumnNames.ARMOUR_MAX_SPEED_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourMaxSpeed(data);
        }
    },
    COL_ARMOUR_WEIGHT(DBColumnNames.ARMOUR_WEIGHT_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourWeight(data);
        }
    },
    COL_ARMOUR_SPECIAL_PROPERTIES(DBColumnNames.ARMOUR_SPECIAL_PROPERTIES_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourSpecialProperties(data);
        }
    },
    COL_ARMOUR_MATERIAL(DBColumnNames.ARMOUR_MATERIAL_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourMaterial(data);
        }
    },
    COL_ARMOUR_MAGIC_IMPROVEMENTS(DBColumnNames.ARMOUR_MAGIC_IMPROVEMENTS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Armour) item).setArmourMagicImprovements(data);
        }
    },
    ////////////////////////////////////////////////////////////////
    //////////////////////////  CLASSES  //////////////////////////

    //////////////////////////////////////////////////////////////////
    //////////////////////////  EQUIPMENT  //////////////////////////

    //////////////////////////////////////////////////////////////
    //////////////////////////  FEATS  //////////////////////////


    ///////////////////////////////////////////////////////////////
    ////////////////////////  HERO_PLAYER PLAYER /////////////////////////

    //////////////////////////////////////////////////////////////////
    //////////////////////  HERO_PLAYER DESCRIPTION  ///////////////////////
    COL_HERO_PLAYER(DBColumnNames.HERO_PLAYER_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroPlayer(data);
        }
    },

    COL_HERO_CLASS_AND_LEVEL(DBColumnNames.HERO_CLASS_AND_LEVEL_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroClassAndLevel(data);
        }
    },

    COL_HERO_RACE(DBColumnNames.HERO_RACE_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroRace(data);
        }
    },
    COL_HERO_ALIGNMENT(DBColumnNames.HERO_ALIGNMENT_ID_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroAlignmentId(Integer.parseInt(data));
        }
    },
    COL_HERO_DEITY(DBColumnNames.HERO_DEITY_ID_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroDeityId(Integer.parseInt(data));
        }
    },
    COL_HERO_SIZE(DBColumnNames.HERO_SIZE_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSizeId(Integer.parseInt(data));
        }
    },
    COL_HERO_AGE(DBColumnNames.HERO_AGE_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroAge(Integer.parseInt(data));
        }
    },
    COL_HERO_GENDER(DBColumnNames.HERO_GENDER_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroGender(data);
        }
    },
    COL_HERO_HEIGHT(DBColumnNames.HERO_HEIGHT_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroHeight(data);
        }
    },
    COL_HERO_WEIGHT(DBColumnNames.HERO_WEIGHT_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroWeight(data);
        }
    },
    COL_HERO_EYES(DBColumnNames.HERO_EYES_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroEyes(data);
        }
    },
    COL_HERO_HAIR(DBColumnNames.HERO_HAIR_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroHair(data);
        }
    },
    COL_HERO_SKIN(DBColumnNames.HERO_SKIN_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSkin(data);
        }
    },
    COL_HERO_HP(DBColumnNames.HERO_HIT_POINTS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSkin(data);
        }
    },
    COL_HERO_STR(DBColumnNames.HERO_ABILITY_SCORE_STR_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSkin(data);
        }
    },
    COL_HERO_DEX(DBColumnNames.HERO_ABILITY_SCORE_DEX_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSkin(data);
        }
    },
    COL_HERO_CON(DBColumnNames.HERO_ABILITY_SCORE_CON_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSkin(data);
        }
    },
    COL_HERO_INT(DBColumnNames.HERO_ABILITY_SCORE_INT_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSkin(data);
        }
    },
    COL_HERO_WIS(DBColumnNames.HERO_ABILITY_SCORE_WIS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSkin(data);
        }
    },
    COL_HERO_CHA(DBColumnNames.HERO_ABILITY_SCORE_CHA_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((HeroPlayer) item).getHeroDescription().setHeroSkin(data);
        }
    },


    /////////////////////////////////////////////////////////////////
    //////////////////////////  MONSTERS  //////////////////////////

    //////////////////////////////////////////////////////////////
    //////////////////////////  RACES  //////////////////////////
    COL_RACE_DESCRIPTION(DBColumnNames.RACE_DESCRIPTION_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Races) item).setRaceDescription(data);
        }
    },
    COL_RACE_ATTRIBUTE_MODIFIERS(DBColumnNames.RACE_ATTRIBUTE_MODIFIERS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Races) item).setRaceAttributeModifiers(data);
        }
    },
    COL_RACE_SIZE(DBColumnNames.RACE_SIZE_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Races) item).setRaceSize(data);
        }
    },
    COL_RACE_SPEED(DBColumnNames.RACE_SPEED_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Races) item).setRaceSpeed(data);
        }
    },
    COL_RACE_FEATS(DBColumnNames.RACE_FEATS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Races) item).setRaceFeats(data);
        }
    },
    COL_RACE_SKILLS(DBColumnNames.RACE_SKILLS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Races) item).setRaceSkills(data);
        }
    },
    COL_RACE_LANGUAGES(DBColumnNames.RACE_LANGUAGES_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Races) item).setRaceLanguages(data);
        }
    },
    COL_FAVOURITE_CLASS(DBColumnNames.RACE_FAVOURITE_CLASS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Races) item).setFavouriteClass(data);
        }
    },
    ///////////////////////////////////////////////////////////////////////
    //////////////////////////  RACE TEMPLATES  //////////////////////////

    ///////////////////////////////////////////////////////////////
    //////////////////////////  SKILLS  //////////////////////////

    ///////////////////////////////////////////////////////////////
    //////////////////////////  SPELLS  //////////////////////////

    ////////////////////////////////////////////////////////////////
    //////////////////////////  WEAPONS  //////////////////////////

    //////////////////////////////////////////////////////////////
    //////////////////////////  DEITIES  //////////////////////////

    ////////////////////////////////////////////////////////////////
    //////////////////////////  TRANSLATIONS  //////////////////////
    COL_CATEGORY(DBColumnNames.CATEGORY_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Translations) item).setCategory(data);
        }
    },
    COL_LANGUAGE(DBColumnNames.LANGUAGE_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Translations) item).setLanguage(data);
        }
    },
    COL_TRANSLATION(DBColumnNames.TRANS_COLUMN_NAME, false) {
        @Override
        public void setParameter(Item item, String data) {
            ((Translations) item).setTrans(data);
        }
    };

    @Getter
    private String columnName;

    @Getter
    private Boolean columnIsUsed;

    @Override
    public void setColumnIsUsed(Boolean columnIsUsed) {
        this.columnIsUsed = columnIsUsed;
    }

    DBSettingColumnNames(String columnName, boolean colBool) {
        this.columnName = columnName;
        this.columnIsUsed = colBool;
    }

    @Override
    public String toString() {
        return this.columnName;
    }

}