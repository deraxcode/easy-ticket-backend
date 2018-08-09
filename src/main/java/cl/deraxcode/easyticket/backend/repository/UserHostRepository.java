package cl.deraxcode.easyticket.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.deraxcode.easyticket.backend.domain.UserHost;

public interface UserHostRepository extends JpaRepository<UserHost, Long> {
	
}
