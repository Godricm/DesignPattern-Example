package org.buding;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 15:40
 * @description:
 **/
public class StudentBO {
    /**
     *
     当做数据库
     */
    List<StudentVO> students;

    public StudentBO(){
        students = new ArrayList<>();
        StudentVO student1 = new StudentVO("Robert",0);
        StudentVO student2 = new StudentVO("John",1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No "
                + student.getRollNo() +", deleted from database");
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No "
                + student.getRollNo() +", updated in the database");
    }
}
