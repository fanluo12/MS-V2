package flxjrllc.javaspringboot.department_service.service.impl;

import flxjrllc.javaspringboot.department_service.dto.DepartmentDto;
import flxjrllc.javaspringboot.department_service.entity.Department;
import flxjrllc.javaspringboot.department_service.mapper.DepartmentMapper;
import flxjrllc.javaspringboot.department_service.repository.DepartmentRepository;
import flxjrllc.javaspringboot.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);

        return departmentDto;

    }
}
