package akkodis.tryout.prices.application.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PricesDto {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("brand_id")
    private Integer brandId;

    @JsonProperty("start_date")
    private LocalDateTime startDate;

    @JsonProperty("end_date")
    private LocalDateTime endDate;

    @JsonProperty("price_list")
    private Integer priceList;

    @JsonProperty("product_id")
    private Integer productId;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("curr")
    private String curr;

}