package ltd.miku.esl.dao;

import ltd.miku.esl.model.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by piguanghua on 2016/11/24.
 */
public interface StudentRepository extends ElasticsearchRepository<Student, String> {
}
