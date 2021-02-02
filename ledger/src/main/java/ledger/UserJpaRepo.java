package ledger;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserJpaRepo extends JpaRepository<User, Long> {

}