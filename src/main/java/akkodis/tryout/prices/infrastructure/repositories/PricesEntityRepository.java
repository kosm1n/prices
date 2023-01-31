package akkodis.tryout.prices.infrastructure.repositories;

import akkodis.tryout.prices.infrastructure.repositories.entities.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface PricesEntityRepository extends JpaRepository<PricesEntity, UUID> {
    List<PricesEntity> findByStartDateLessThanEqualAndEndDateGreaterThanEqualAndProductIdAndBrandId(LocalDateTime applicationDateStart, LocalDateTime applicationDateEnd, Integer productId, Integer brandId);
}
