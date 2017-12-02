package cn.hexg.db.dao;

import cn.hexg.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//@Mapper
public interface StudentDao {
    public Student findById(@Param("studentId")Integer studentId);
}
