package oldDate;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // criamos um novo formato sdf3 da mesma maneira que o sdf2, mas
														// nessa linha em questão colocamos seu time zone para o GMT, ou
														// seja, em vez de imprimir as datas no horário do sistema, ele
														// vai imprimir no horário GMT(Z)

		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // criando uma data utilizando o formato UTC

		Date x1 = new Date(); // instanciando uma data com o dia e hora atual ****

		Date x2 = new Date(System.currentTimeMillis()); // outra maneira de criar uma data com dia e hora atual

		Date x3 = new Date(0L); // instanciando uma data no momento 0, no entanto aparecem algumas horas
								// atrasados pois o horario do sistema em que estamos é diferente do GMT (tres
								// horas a menos)

		Date x4 = new Date(1000L * 60L * 60L * 5L); // aqui criamos uma nova data as 5 horas da manha de 01 de janeiro
													// de 1970, para isso calculamos os milissegundos pertinentes
													// convertendo a data para milissegundos, como: 1 segundo=
													// 1000milisegundos, multiplicado por 60 segundos, 60 minutos e 5
													// horas

		System.out.println(y1); // em ambos os casos ao lado será impresso no formato padrão do Java as
								// datas/hora
		System.out.println(y2);

		System.out.println(sdf2.format(y1)); // já nesses casos serão impressos os objetos y1 e y2 nos formatos sdf1 e
												// sdf2 acima ora instanciados.
		System.out.println(sdf2.format(y2));

		System.out.println(y3);
		System.out.println(sdf2.format(y3));

		System.out.println(x1); // imprimindo a data atual em dois formatos.
		System.out.println(sdf2.format(x1));

		System.out.println(x2);
		System.out.println(sdf2.format(x2));

		System.out.println(x3);
		System.out.println(x4);
		
		System.out.println("----------------------------------------");
		System.out.println(sdf3.format(x1));
		System.out.println(sdf3.format(x2));
		System.out.println(sdf3.format(x3));
		
		if (checkout.after(checkin) || checkout.before(checkin){ // o método after ou before da classe date testa se uma data é posterior a outra. Nesse caso testa se a data checkout é depois de checkin retornando true se for.
		}
	}

}
