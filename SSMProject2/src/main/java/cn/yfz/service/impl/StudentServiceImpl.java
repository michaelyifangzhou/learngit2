package cn.yfz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.yfz.dao.StudentMapper;
import cn.yfz.domain.Student;
import cn.yfz.service.StudentService;

public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentMapper sm;
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sm.findAll();
	}

	@Override
	public void add(String sname, int cid, String sex, String birthplace) {
		// TODO Auto-generated method stub
		sm.add(sname, cid, sex, birthplace);
	}

	@Override
	public Student findBySid(int sid) {
		// TODO Auto-generated method stub
		return sm.findBySid(sid);
	}

}
