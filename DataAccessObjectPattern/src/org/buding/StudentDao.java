package org.buding;

import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 14:15
 * @description: 数据访问对象接口
 **/
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(Integer rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
