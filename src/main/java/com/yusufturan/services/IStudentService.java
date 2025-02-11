package com.yusufturan.services;

import java.util.List;

import com.yusufturan.dto.DtoStudent;
import com.yusufturan.dto.DtoStudentIU;

public interface IStudentService {
	public DtoStudent saveStudent(DtoStudentIU student);//Parametre olarak IU ı return olarak düzünü kullanıcaz
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
