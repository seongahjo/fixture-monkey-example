public class OrderService {
	public void validateDeliveryAddress(Order order) {
		Delivery delivery = order.getDelivery();
		if (!delivery.isRoad() && delivery.getDetailAddress() == null) {
			throw new ConsistencyCheckFailedException();
		}
	}
}
