
public class Order {

	private int order_number;
	private String order_date;
	private int items_count;
	private String shipping_address;
	
	public int get_order_number(int order_number) {
		return order_number = this.order_number;
	}
	public String get_order_date(String order_date) {
		return order_date = this.order_date;
	}
	public int get_items_count(int items_count) {
		return items_count = this.items_count;
	}
	public String get_shipping_address(String shipping_address) {
		return shipping_address = this.shipping_address;
	}
}
