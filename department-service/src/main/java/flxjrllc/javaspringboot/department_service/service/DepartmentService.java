package flxjrllc.javaspringboot.department_service.service;

import flxjrllc.javaspringboot.department_service.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);


}
