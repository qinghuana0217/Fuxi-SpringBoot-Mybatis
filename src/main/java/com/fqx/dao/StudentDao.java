package com.fqx.dao;

import com.fqx.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FQX
 * @create 04-12-11:24
 */
@Mapper//声明此接口为映射接口
@Repository//加入到IOC容器中
public interface StudentDao {
    @Select("select * from student")
    public List<Student> findAll();

    public String findById(int id);

    public int insert(Student stu);

    public int update(Student stu);

    public int delete(int id);
}
