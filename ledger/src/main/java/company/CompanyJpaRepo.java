package ledger.company;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyJpaRepo extends JpaRepository<Company, Long> {
    
}