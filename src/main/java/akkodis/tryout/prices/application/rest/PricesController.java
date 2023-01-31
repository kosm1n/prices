package akkodis.tryout.prices.application.rest;

import akkodis.tryout.prices.application.rest.converters.LocalDateTimeConverter;
import akkodis.tryout.prices.application.rest.dto.PricesDto;
import akkodis.tryout.prices.application.rest.mapper.PricesToPricesDtoMapper;
import akkodis.tryout.prices.domain.services.PricesService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class PricesController {

    private final PricesService pricesService;

    private final PricesToPricesDtoMapper pricesToPricesDtoMapper;

    @GetMapping(value = "/prices")
    public ResponseEntity<List<PricesDto>> getPrices(@RequestParam(name = "applicationDate") String applicationDate,
                                                     @RequestParam(name = "productId") Integer productId,
                                                     @RequestParam(name = "brandId") Integer brandId) {

        return ResponseEntity.ok(pricesToPricesDtoMapper.toPricesDto(
                pricesService.getPrices(LocalDateTimeConverter.parseDateTime(applicationDate), productId, brandId)));
    }

}
