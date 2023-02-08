package model.application;

import model.services.DeliverService;
import model.services.PayService;
import model.services.TaxService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inversao de controle: agora o controle deixou de estar na propria classe e
		// passou para o programa principal, gerando um baixo acoplamento e facilidade
		// na manutencao do software
		DeliverService deliverService = new DeliverService();
		TaxService taxService = new TaxService();

		PayService payService = new PayService(taxService, deliverService);

		System.out.println("Resultado = " + payService.finalPrice(300.0, "SP"));
	}

}
