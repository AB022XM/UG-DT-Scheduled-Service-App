package ug.co.absa.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.co.absa.validation.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
