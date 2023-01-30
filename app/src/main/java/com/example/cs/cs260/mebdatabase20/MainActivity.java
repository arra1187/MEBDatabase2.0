package com.example.cs.cs260.mebdatabase20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity
{
  private UpgradeDatabase mDatabase;
  private UpgradeDao mDataModelDao;
  private ExecutorService mExecutor;
  private TextView mDatabaseView;

  @Override
  protected void onCreate (Bundle savedInstanceState)
  {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);

    mExecutor = Executors.newSingleThreadExecutor ();
    mExecutor.execute(() -> {
      mDatabase = Room.databaseBuilder (getApplicationContext (),
          UpgradeDatabase.class, "DataModel-db").build();

      mDataModelDao = mDatabase.upgradeDao();
      if(0 == mDataModelDao.getSize())
      {
        //Empty
      }
    });
  }
}