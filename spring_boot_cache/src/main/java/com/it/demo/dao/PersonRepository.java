
package com.it.demo.dao;

import com.it.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonRepository extends JpaRepository<Person, Long> {

    /*
   * 相当于 slect p from Person p where p.name=?1
   * */
    Person findByName(String name);

    Person findByNameAndAge(String name, Integer age);

}
