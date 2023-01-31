package akkodis.tryout.prices.domain.services;

import akkodis.tryout.prices.domain.model.Prices;

import java.time.LocalDateTime;
import java.util.List;

public interface PricesService {

    List<Prices> getPrices(LocalDateTime applicationDate, Integer productId, Integer brandId);

}
