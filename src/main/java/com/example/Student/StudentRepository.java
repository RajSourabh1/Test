package com.example.Student;

import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    HashMap<Integer,Student> studentDb = new HashMap<>();
    String addStudentToDb(Student student){
        int key = student.getId();
        studentDb.put(key,student);

        return "Successfully added";
    }

    Student getStudentFromDb(int id){
        if(studentDb.containsKey(id))
            return studentDb.get(id);
        else
            return null;
    }
    Student getStudentFromDb(String searchName){
        for(Student student : studentDb.values()){
            if(student.getName().equals(searchName))
                return student;
        }
        return null;
    }

    Student updateStudentInDb(Student student){
        int key = student.getId();
        if(studentDb.containsKey(key)){
            studentDb.put(key,student);
            return student;
        }
        else
            return null;
    }

    String deleteStudentInDb(int id){
        studentDb.remove(id);
        return "Successfully removed";
    }
}
