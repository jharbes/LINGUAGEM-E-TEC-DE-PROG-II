import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		// Conversao de string para enum abaixo: (importante pois a tendencia eh que a
		// aplicacao receba o valor do enum em string, entao eh razoavel que haja a
		// conversao para que o java possa processa-lo para o formato de enum.
		
		OrderStatus os1=OrderStatus.DELIVERED;
		
		OrderStatus os2=OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
