package com.example.cs.cs260.mebdatabase20;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface UpgradeDao
{
  @Query ("Select * from Upgrade")
  List<Upgrade> getAll();

  @Query("Select * FROM Upgrade WHERE nid = :id")
  Upgrade findByID(int id);

  @Insert
  void insert(Upgrade upgrade);

  @Insert
  void delete(Upgrade ... upgrade);

  @Delete
  void delete(Upgrade upgrade);

  @Query("Delete FROM Upgrade WHERE nid = :id")
  void deleteByID(int id);

  @Query("Delete from Upgrade")
  void deleteAll();

  @Query("Select count(*) from Upgrade")
  int getSize();

  @Query("Select * from Upgrade WHERE title like :str")
  List<Upgrade> getAllContains(String str);
}
