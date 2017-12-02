package cn.hexg.Service;

import cn.hexg.db.dao.StudentDao;
import cn.hexg.po.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {

    @Resource
    private StudentDao studentDao;

    public Student queryStudentByStudentId(Integer studentId){
        return studentDao.findById(studentId);
    }

}
