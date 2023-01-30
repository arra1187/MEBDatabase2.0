package com.example.cs.cs260.mebdatabase20;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Upgrade
{
  @PrimaryKey (autoGenerate = true)
  private int nid;

  @ColumnInfo (name = "title")
  private String mTitle;
  @ColumnInfo (name = "tower")
  private int mTowerID;
  @ColumnInfo(name = "cost")
  private int mCost;

  public Upgrade(String title, int towerID, int cost)
  {
    mTitle = title;
    mTowerID = towerID;
    mCost = cost;
  }

  public String getTitle()
  {
    return mTitle;
  }

  public int getTowerID()
  {
    return mTowerID;
  }

  public int getCost()
  {
    return mCost;
  }

  public int getNid() { return nid; }

  public void setNid(int value) { nid = value; }
}
