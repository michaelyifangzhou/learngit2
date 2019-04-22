package cn.yfz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.yfz.domain.Student;

public interface StudentMapper {
	public List<Student> findAll();//查找所有学生
	public void add(@Param("sname") String sname, @Param("cid") int cid,
            @Param("sex") String sex, @Param("birthplace") String birthplace);//添加学生
	public Student findBySid(@Param("sid") int sid);//根据学号查学生
}
