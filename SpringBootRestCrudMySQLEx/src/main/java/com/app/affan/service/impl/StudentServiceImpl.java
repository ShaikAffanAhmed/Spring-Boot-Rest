package com.app.affan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.affan.entity.Student;
import com.app.affan.exception.StudentNotFoundException;
import com.app.affan.repo.StudentRepository;
import com.app.affan.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;
	public Integer saveStudent(Student s) {
		s = repo.save(s);
		return s.getStdId();
	}

	public void updateStudent(Student s) {
    if(s.getStdId() == null || !repo.existsById(s.getStdId()))
     throw new StudentNotFoundException("STUDENT '"+s.getStdId()+"'NOT EXIST");
     else 
    	 repo.save(s);
	}

	public void deleteStudent(Integer id) {
      repo.delete(getOneStudent(id));
	}

	public Student getOneStudent(Integer id) {
		return repo.findById(id)
				.orElseThrow(
			    ()->new StudentNotFoundException("STUDENT '"+id+"'NOT EXIST")
			    );
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = repo.findAll();
		return list;
	}

}
