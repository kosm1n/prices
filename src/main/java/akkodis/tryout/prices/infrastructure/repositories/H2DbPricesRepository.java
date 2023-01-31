package akkodis.tryout.prices.infrastructure.repositories;

import akkodis.tryout.prices.domain.model.Prices;
import akkodis.tryout.prices.domain.repositories.PricesRepository;
import akkodis.tryout.prices.infrastructure.repositories.mapper.PricesEntityToPricesMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Component
@AllArgsConstructor
@Transactional
@Slf4j
public class H2DbPricesRepository implements PricesRepository {

    private final PricesEntityRepository pricesEntityRepository;

    private final PricesEntityToPricesMapper pricesEntityToPricesMapper;

    @Override
    public List<Prices> getPrices(LocalDateTime applicationDate, Integer productId, Integer brandId) {
        log.info("Find PricesEntities by ");
        return pricesEntityToPricesMapper.toPrices(pricesEntityRepository.findByStartDateLessThanEqualAndEndDateGreaterThanEqualAndProductIdAndBrandId(applicationDate, applicationDate, productId, brandId));
    }
}
