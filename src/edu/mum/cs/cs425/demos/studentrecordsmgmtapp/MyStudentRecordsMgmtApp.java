package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {
	public static void main(String[] args) {
		Student s1 = new Student(110001, "Dave", LocalDate.of(1951, 11, 28));
		Student s2 = new Student(110002, "Anna", LocalDate.of(1990, 12, 07));
		Student s3 = new Student(110003, "Erica", LocalDate.of(1974, 1, 31));
		Student s4 = new Student(110004, "Carlos", LocalDate.of(2009, 8, 22));
		Student s5 = new Student(110005, "Bob", LocalDate.of(1990, 03, 5));
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
		printListOfStudents(students);
		
		System.out.println("------ PlatinumAlumniStudents ------");
		List<Student> platinumAlumniStudents = getListOfPlatinumAlumniStudents(students);
		for(Student s: platinumAlumniStudents)
			System.out.println(s.toString());
		
	}
	public static void printListOfStudents(List<Student> list) {
		for(Student s: list)
			System.out.println(s.toString());
	}
	public static List<Student> getListOfPlatinumAlumniStudents(List<Student> list){
		return list.stream()
				.filter(x -> (LocalDate.now().getYear() 
						- x.getDateOfAdmission().getYear() >= 30))
				.sorted(Comparator.comparing((Student s) -> s.getDateOfAdmission()).reversed())
				.collect(Collectors.toList());
	}
}
