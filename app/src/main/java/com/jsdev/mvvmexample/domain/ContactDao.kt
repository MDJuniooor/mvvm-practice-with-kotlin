package com.jsdev.mvvmexample.domain

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao{

    @Query("SELECT * FROM CONTACT ORDER BY NAME ASC")
    fun getAll():  LiveData<List<Contact>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(contact: Contact)

    @Delete
    fun delete(contact: Contact)
}