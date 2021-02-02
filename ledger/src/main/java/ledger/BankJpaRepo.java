package ledger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BankJpaRepo extends JpaRepository<Bank, Long> {

    List<Bank> findByBankName(String bankName);
}