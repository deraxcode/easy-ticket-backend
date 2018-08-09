package cl.deraxcode.easyticket.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.deraxcode.easyticket.backend.domain.Commune;

public interface CommuneRepository extends JpaRepository<Commune, Long>{
	List<Commune> findByProvinceProvinceId(Long provinceId);	
	List<Commune> findByProvinceRegionRegionId(Long regionId);

}
