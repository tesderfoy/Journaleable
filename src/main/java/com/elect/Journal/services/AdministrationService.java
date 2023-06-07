package com.elect.Journal.services;

import com.elect.Journal.models.Student;
import com.elect.Journal.models.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdministrationService {
    private List<Teacher> teachers = new ArrayList<>();
    private long ID = 0;

    {
        teachers.add(new Teacher(ID,"jj","","","",""));
    }


    public void  addStudent(){

    }
    public void  delStudent(){

    }
    public void  addTeacher(Teacher teacher){
           teachers.add(teacher);
    }
    public void  delTeacher(){

    }
}
