package com.example.traveladvisoryapp;

import android.graphics.Bitmap;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity//Tablename is Country
public class Country {
    @PrimaryKey(autoGenerate = true)
    public int countryID;//col1
    public String countryName; //col2
    public String countryCode;//col3
 ArrayList<Country> list;
    public String getCountryCode() {
        return countryCode;
    }


    public Country() {
    }

    public Country(String countryName) {
        this.countryName = countryName;
    }

      public String getCountryName() {
        return countryName;
    }

     public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                '}';
    }

}
