package com.fqx.impl;

import com.fqx.dao.StudentDao;
import com.fqx.po.Student;
import com.fqx.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FQX
 * @create 04-12-11:49
 */
@Service
public class StudentImpl implements StudentService {
    @Resource
    private StudentDao sd;


    @Override
    public List<Student> findAll() {
        return sd.findAll();
    }

    @Override
    public String findById(int id) {
        return sd.findById(id);
    }

    @Override
    public boolean insert(Student stu) {
        if (sd.insert(stu)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Student stu) {
        if (sd.update(stu)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (sd.delete(id)>0){
            return true;
        }
        return false;
    }
}
