import java.time.Instant;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class Order {
	@NotNull
	Long id;

	@NotBlank
	String purchaserName;

	long totalPrice;

	@Size(min = 1, max = 3)
	List<Product> products;

	List<Coupon> coupons;

	Delivery delivery;

	@PastOrPresent
	Instant orderedAt;
}
