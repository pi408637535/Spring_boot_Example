package ltd.miku.esl.service;


import ltd.miku.esl.model.Student;

/**
 * Created by piguanghua on 2016/11/24.
 */
public interface StudentService {
    void saveStudent(Student student);
    Student searchStudentByName(String name);
    void deleteAllStudent();
}
