package flxjrllc.javaspringboot.employee_service.repository;

import flxjrllc.javaspringboot.employee_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
