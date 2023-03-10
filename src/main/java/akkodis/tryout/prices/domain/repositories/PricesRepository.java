package akkodis.tryout.prices.domain.repositories;

import akkodis.tryout.prices.domain.model.Prices;

import java.time.LocalDateTime;
import java.util.List;

public interface PricesRepository {

    List<Prices> getPrices(LocalDateTime applicationDate, Integer productId, Integer brandId);

}
