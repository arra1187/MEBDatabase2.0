package com.example.cs.cs260.mebdatabase20;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database (entities = {Upgrade.class}, version = 1, exportSchema = false)
public abstract class UpgradeDatabase extends RoomDatabase
{
  public abstract UpgradeDao upgradeDao();
}
