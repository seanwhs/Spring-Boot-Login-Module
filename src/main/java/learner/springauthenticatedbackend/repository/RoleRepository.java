// RoleRepository.java
package learner.springauthenticatedbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import learner.springauthenticatedbackend.models.Role;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    Optional<Role> findByAuthority(String authority);
}

    

