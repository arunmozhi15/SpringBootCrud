package com.myself.practice.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.myself.practice.entity.StudentEntity;
import com.myself.practice.model.StudentModel;

public interface StudentService {
	public StudentModel createStudent(StudentModel studentModel);

	StudentModel viewStudent(int studentId);

	boolean deleteStudent(int studentId);

	StudentModel updateStudent(StudentModel studentModel);

	List<StudentModel> getAllStudent();

	Page<StudentEntity> paginationList(int pageIndex, int pageSize, String sortOrder, String searchText,
			String columnName);
}
