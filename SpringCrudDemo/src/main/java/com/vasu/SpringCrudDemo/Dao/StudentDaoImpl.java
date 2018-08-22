/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringCrudDemo.Dao;

import com.vasu.SpringCrudDemo.Bean.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.rmi.CORBA.Stub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vasu Rajput
 */
@Service
public class StudentDaoImpl implements StudentDao {

    private static final Logger logger = LoggerFactory.getLogger("StudentDaoImpl.class");
    public static ArrayList<Student> studentList = new ArrayList<Student>();

    @Override
    public ArrayList<Student> addStudent(Student student) {
        studentList.add(student);
        return studentList;
    }

    @Override
    public int deleteStudent(int id) {
        try {
            Student st = null;
            for (Student student : studentList) {
                logger.info("id= " + student.getId());
                if (student.getId() == id) {
                    st = student;
                } else {
                    logger.info("continue");
                }
            }
            logger.info("student= " + st.toString());
            studentList.remove(st);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public ArrayList<Student> getAllStudent() {
        return studentList;
    }

    @Override
    public int updateStudent(int id) {
        try {
            Student s = null;
            for (Student student : studentList) {
                if (student.getId() == id) {
                    s = student;
                    s.setName("updatedStudent");
                }
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
