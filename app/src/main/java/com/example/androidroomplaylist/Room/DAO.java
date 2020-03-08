package com.example.androidroomplaylist.Room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DAO {

    @Insert
    public void studentInsertion(Student student);

    @Query("Select * from Student")
    List<Student> getStudent();

    @Query("Update Student set stuFirstName = :stuName where stuId = :stuID")
    void updateStu(String stuName , int stuID);

    @Query("Delete from Student where stuId = :stuID")
    void deleteStu (int stuID);

}
