package com.example.SpringJDBCex;

import com.example.SpringJDBCex.model.Student;
import com.example.SpringJDBCex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCexApplication {

	public static void main(String[] args) {
		ApplicationContext Context=SpringApplication.run(SpringJdbCexApplication.class, args);
		Student student=Context.getBean(Student.class);

		student.setRollNo(104);
		student.setName("Pranav");
		student.setMarks(98);

		StudentService service=Context.getBean(StudentService.class);
		service.addStudent(student);

		List<Student> students=service.getStudents();
		System.out.println(students);


	}

}
