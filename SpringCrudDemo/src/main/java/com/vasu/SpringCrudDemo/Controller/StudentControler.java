/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringCrudDemo.Controller;

import com.vasu.SpringCrudDemo.Bean.Student;
import com.vasu.SpringCrudDemo.Dao.StudentDao;
import com.vasu.SpringCrudDemo.Dao.StudentDaoImpl;
import java.util.ArrayList;
import javax.websocket.server.PathParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vasu Rajput
 */
@RestController
public class StudentControler {

    @Autowired
    StudentDaoImpl studentDao;
    static ArrayList<Object> a = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger("StudentControler");

    @GetMapping("/")
    public ResponseEntity testRest() {
        return new ResponseEntity(studentDao.getAllStudent(), HttpStatus.OK);
    }

    //to call this url from postman choose body type to row and send like below and also set content-type=application/json
    /*
    {
"id":1,
"name":"vasu",
"email":"123"
}
     */
    @PostMapping("/addstudent")
    public ResponseEntity addStudent(@RequestBody Student student) {
        logger.info("studentObj= " + student.getId() + " name= " + student.getName() + " Email= " + student.getEmail());
        ArrayList<Student> addStudent = studentDao.addStudent(student);
        return new ResponseEntity(addStudent, HttpStatus.OK);
    }

    @PostMapping("/deletetudent")
    public ResponseEntity deleteStudent(@RequestBody Student student) {
        logger.info("studentId= " + student.getId());
        int deleteStudent = studentDao.deleteStudent(student.getId());
        logger.info("deleteStatus= " + deleteStudent);
        if (deleteStudent == 1) {
            logger.info("succesfully Deleted");
            return new ResponseEntity(studentDao.getAllStudent(), HttpStatus.OK);
        }
        return new ResponseEntity("Error In Deletion Please Check", HttpStatus.OK);
    }

    @PostMapping("/updateStudent")
    public ResponseEntity updateStudent(@RequestBody Student student) {
        logger.info("studentId= " + student.getId());
        int updateStudent = studentDao.updateStudent(student.getId());
        if (updateStudent == 1) {
            return new ResponseEntity(studentDao.getAllStudent(), HttpStatus.OK);
        } else {
            return new ResponseEntity("Erro in updation", HttpStatus.OK);
        }

    }
}
