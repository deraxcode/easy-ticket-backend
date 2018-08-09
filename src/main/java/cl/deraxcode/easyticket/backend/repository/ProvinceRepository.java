package cl.deraxcode.easyticket.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.deraxcode.easyticket.backend.domain.Province;

public interface ProvinceRepository extends JpaRepository<Province, Long>{
	
	List<Province> findByRegionRegionId(Long regionId);

}
