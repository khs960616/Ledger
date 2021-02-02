package ledger;


import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyJpaRepo extends JpaRepository<Company, Long> {
    
}