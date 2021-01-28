package ledger.item;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemJpaRepo extends JpaRepository<Item, Long> {
}