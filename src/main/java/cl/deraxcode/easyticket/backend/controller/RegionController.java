package cl.deraxcode.easyticket.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.deraxcode.easyticket.backend.domain.Commune;
import cl.deraxcode.easyticket.backend.domain.Region;
import cl.deraxcode.easyticket.backend.repository.CommuneRepository;
import cl.deraxcode.easyticket.backend.repository.RegionRepository;


@RestController
public class RegionController {
	
	@Autowired
	private RegionRepository regionRepository;
	
	@Autowired
	private CommuneRepository communeRepository;
	
	@GetMapping("/regions")
	public List<Region> findAllRegions() {
		return regionRepository.findAll();
	}
	
	@PreAuthorize("#oauth2.hasScope('read')")
	@GetMapping("/regions/{regionId}/communes")
	public List<Commune> findAllCommunesByRegion(@PathVariable Long regionId){
		return communeRepository.findByProvinceRegionRegionId(regionId);
		
	}
	

}
