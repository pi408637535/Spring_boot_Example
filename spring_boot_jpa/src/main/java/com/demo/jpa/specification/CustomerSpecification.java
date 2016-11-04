package com.demo.jpa.specification;

import com.demo.jpa.domain.Person;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * 利用规范化Ciriteria 来实现SQL
 * Created by wode4 on 2016/10/21.
 */
public class CustomerSpecification
{
    public static Specification<Person> personSpecification(){
        return new Specification<Person>()
        {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder)
            {
                return criteriaBuilder.equal(root.get("address"), "cont");
            }
        };
    }
}
