package com.greatlearning.boot.debate.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.boot.debate.entities.Students;
import com.greatlearning.boot.debate.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	//autowired service class
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/list")
	public String listStudents(Model model) {
		List<Students> students = studentservice.findAll();
		model.addAttribute("students", students);
		return "studentlist";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// get the customer from the service

		Students student = new Students();
		//student.setId(0);
		// set Customer as a model attribute to pre-populate the form
		theModel.addAttribute("student", student);

		// send over to our form
		return "newform";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {

		// get the customer from the service
		Students std = studentservice.findById(theId);

		// set Customer as a model attribute to pre-populate the form
		theModel.addAttribute("student", std);

		// send over to our form
		return "newform";
	}

	@PostMapping("/save")
	public String saveStudent(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("department") String department, @RequestParam("country") String country) {

		System.out.println(id);
		//Integer studentId=0;
		//if(id!=null)
		//	studentId=Integer.parseInt(id);
		
		Students std;
		if (id != 0) {
			std = studentservice.findById(id);
			std.setName(name);
			std.setDepartment(department);
			std.setCountry(country);
		} else
			std = new Students(name, department, country);
		// save the Customer
		studentservice.save(std);

		// use a redirect to prevent duplicate submissions
		return "redirect:/students/list";

	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int theId) {

		// delete the customer
		studentservice.deleteById(theId);

		return "redirect:/students/list";

	}
	

	@RequestMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", "You do not have permission to access this page!");
		}

		model.setViewName("403");
		return model;

	}

}
