import static org.assertj.core.api.BDDAssertions.thenNoException;

import java.time.Instant;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OrderServiceTest {
	private final OrderService sut = new OrderService();
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	private final Order orderFixture = new Order(
		1L,
		"LINE FRIENDS",
		1000L,
		List.of(
			new Product("SALLY", 300L),
			new Product("BROWN", 300L)
		),
		List.of(new Coupon(100L)),
		new Delivery("그린팩토리", null, true, 500L),
		Instant.now()
	);

	@Test
	void validateDeliveryAddress() {
		// given
		Order order = orderFixture;

		thenNoException().isThrownBy(() -> sut.validateDeliveryAddress(order));
	}
}
