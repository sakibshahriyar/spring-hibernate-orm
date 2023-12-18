package com.sakib.springhibernateorm.repository;
import com.sakib.springhibernateorm.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
