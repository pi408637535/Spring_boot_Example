package com.it.demo.service.impl;

import com.it.demo.dao.PersonRepository;
import com.it.demo.domain.Person;
import com.it.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;




@Service
public class DemoServiceImpl implements DemoService
{
	
	@Autowired
	PersonRepository personRepository;

	@Override
	@CachePut(value = "people", key = "#person.name")
	public Person save(Person person) {
		Person p = personRepository.save(person);
		System.out.println("为id、key为:"+p.getId()+"数据做了缓存");
		return p;
	}

	@Override
	@CacheEvict(value = "people")//2
	public void remove(Long id) {
		System.out.println("删除了id、key为"+id+"的数据缓存");
		//这里不做实际删除操作
	}

	@Override
	@Cacheable(value = "people", key = "#person.name")//3
	public Person findOne(Person person) {
		Person p = personRepository.findByName(person.getName());
		System.out.println("为id、key为:"+p.getName()+"数据做了缓存");
		return p;
	}

}
