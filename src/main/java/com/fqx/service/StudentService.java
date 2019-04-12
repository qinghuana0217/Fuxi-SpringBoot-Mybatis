package com.fqx.service;

import com.fqx.po.Student;

import java.util.List;

/**
 * @author FQX
 * @create 04-12-11:47
 */
public interface StudentService {
    public List<Student> findAll();

    public String findById(int id);

    public boolean insert(Student stu);

    public boolean update(Student stu);

    public boolean delete(int id);
}
