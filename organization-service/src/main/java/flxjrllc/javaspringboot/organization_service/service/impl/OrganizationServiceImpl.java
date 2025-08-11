package flxjrllc.javaspringboot.organization_service.service.impl;

import flxjrllc.javaspringboot.organization_service.dto.OrganizationDto;
import flxjrllc.javaspringboot.organization_service.entity.Organization;
import flxjrllc.javaspringboot.organization_service.mapper.OrganizationMapper;
import flxjrllc.javaspringboot.organization_service.repository.OrganizationRepository;
import flxjrllc.javaspringboot.organization_service.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
