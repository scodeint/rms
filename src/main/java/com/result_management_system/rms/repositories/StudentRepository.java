package com.result_management_system.rms.repositories;

import com.result_management_system.rms.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
