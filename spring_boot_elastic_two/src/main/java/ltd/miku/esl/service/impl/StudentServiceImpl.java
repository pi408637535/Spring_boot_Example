package ltd.miku.esl.service.impl;

import ltd.miku.esl.dao.StudentRepository;
import ltd.miku.esl.model.Student;
import ltd.miku.esl.service.StudentService;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by piguanghua on 2016/11/24.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentDao;

    @Override
    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    @Override
    public Student searchStudentByName(String name) {
        //content为要查询的数据
        QueryStringQueryBuilder queryBuilder = new QueryStringQueryBuilder("清华");
        studentDao.deleteAll();
       // queryBuilder.analyzer("ik").field("name");
        Iterable<Student> students = studentDao.search(queryBuilder);
        return null;
    }

    @Override
    public void deleteAllStudent() {
        studentDao.deleteAll();
    }


}
