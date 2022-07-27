
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandro
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    
}
