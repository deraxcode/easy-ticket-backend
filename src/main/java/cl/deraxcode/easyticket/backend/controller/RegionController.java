package cl.deraxcode.easyticket.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.deraxcode.easyticket.backend.domain.Commune;
import cl.deraxcode.easyticket.backend.domain.Province;
import cl.deraxcode.easyticket.backend.domain.Region;
import cl.deraxcode.easyticket.backend.repository.CommuneRepository;
import cl.deraxcode.easyticket.backend.repository.ProvinceRepository;
import cl.deraxcode.easyticket.backend.repository.RegionRepository;


@RestController
public class RegionController {
	
	@Autowired
	private RegionRepository regionRepository;
	
	@Autowired
	private ProvinceRepository provinceRepository;
	
	@Autowired
	private CommuneRepository communeRepository;
	
	@GetMapping("/regions")
	public List<Region> findAllRegions() {
		return regionRepository.findAll();
	}
	
	@GetMapping("/communes")
	public List<Commune> findAllCommunesByRegion(Long regionId){
		List<Province> provinces = provinceRepository.findByRegionRegionId(regionId);
		List<Commune> communes = new ArrayList<>();
		for(Province province : provinces){			
			communes.addAll(communeRepository.findByProvinceProvinceId(province.getProvinceId()));
		}
		return communes;
		
	}
	

}
