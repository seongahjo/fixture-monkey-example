import javax.annotation.Nullable;

import lombok.Value;

@Value
public class Delivery {
	String baseAddress;

	@Nullable
	String detailAddress;

	boolean road;

	long deliveryFee;
}
