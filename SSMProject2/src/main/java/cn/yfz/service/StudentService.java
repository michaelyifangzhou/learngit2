package cn.yfz.service;

import java.util.List;

import cn.yfz.domain.Student;

public interface StudentService {
	public List<Student> findAll();
	public void add(String sname, int cid, String sex, String birthplace);
	public Student findBySid(int sid);
}
