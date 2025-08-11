package flxjrllc.javaspringboot.organization_service.service;

import flxjrllc.javaspringboot.organization_service.dto.OrganizationDto;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);

    OrganizationDto getOrganizationByCode(String organizationCode);
}
