package com.student.crud.mapper;

import com.student.crud.dto.StudentDto;
import com.student.crud.entity.Student;

public class StudentMapper {

    // convert jpa entity to dto and vice-versa

    public static StudentDto mapToStudentDto(Student student) {
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );

        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto) {
        Student student = new Student(
               studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );

        return student;
    }

}
