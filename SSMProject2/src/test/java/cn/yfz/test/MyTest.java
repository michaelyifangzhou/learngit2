package cn.yfz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yfz.dao.StudentMapper;
import cn.yfz.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MyTest {
	@Autowired
	private StudentMapper service;
	@Test
	public void fun1(){
		String sname="黎明";
		int cid=1;
		String sex="f";
		String birthplace="beijing";
		service.add(sname, cid, sex, birthplace);
	}
}
