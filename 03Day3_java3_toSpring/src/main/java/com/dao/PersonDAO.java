package com.dao;

import java.util.Arrays;
import java.util.List;

import com.dto.Person;

public class PersonDAO {

	public List<Person> list(){
		return Arrays.asList(new Person("홍길동", 20), new Person("이순신", 44), new Person("유관순", 20));
	}
}
