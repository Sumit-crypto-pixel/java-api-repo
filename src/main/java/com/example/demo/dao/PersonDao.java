package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


// Here we will define the operation allowed or the actual contract that anyone wishes to implement this interface
// and the cool thing about is we can switch between implementation using Dependency injection.
public interface PersonDao {


 int insertPerson(UUID id, Person person); // This will insert person who gave id

 default int insertPerson(Person person){ // This will insert the persson who didn't give id
  UUID id = UUID.randomUUID();
  return insertPerson(id,person);
 }
  List<Person> selectAllPeople();

 Optional<Person> selectPersonById(UUID id);
 int deletePersonById(UUID id);
 int updatePersonById(UUID id, Person person);

}
