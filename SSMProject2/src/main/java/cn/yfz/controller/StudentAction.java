package cn.yfz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yfz.domain.Student;
import cn.yfz.service.StudentService;

@Controller
public class StudentAction {
	@Autowired
	private StudentService service;
	@RequestMapping("/findall")
	public String findAll(Model model){
		List<Student> sl=service.findAll();
		model.addAttribute("studentlist", sl);
		return "show";
	}
	@ResponseBody
	@RequestMapping("/findbysid")
	public Student findBySid(@RequestParam("sid") int sid) {
        return service.findBySid(sid);
    }
	@RequestMapping("/add")
	public String add(@RequestParam("sname") String sname,@RequestParam("cid") int cid,
			@RequestParam("sex") String sex,@RequestParam("birthplace") String birthplace){
		service.add(sname, cid, sex, birthplace);
		return "success";
	}
}
