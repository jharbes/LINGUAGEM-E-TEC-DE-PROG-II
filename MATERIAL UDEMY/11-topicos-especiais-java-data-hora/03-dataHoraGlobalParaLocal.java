package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {
		
		// IMPORTANTE ***
		// o código abaixo forEach imprime todas as zonas existentes de horários com referencias globais para serem utilizadas conforme necessário

		// for (String s : ZoneId.getAvailableZoneIds())
		// System.out.println(s);

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // converte uma hora no fuso horario global GMT(Instant) para uma data (apenas data) no fuso horário do pc onde está sendo feito(Sistema local)
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // agora converteremos o mesmo "instant" para o horário de portugal(que está presente na tabela de fuso horário getAvailableZoneIds.
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // idem ao anterior de cima, só que agora com o DateTime também serão incluidas as horas minutos e segundos.
		
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); // idem ao anterior, só que agora a data em conjunto com as horas minutos e segundos será convertido para o horário de portugal

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		System.out.println("d04 dia = " + d04.getDayOfMonth()); // utilizando o método getDayOfMonth para pegar apenas o dia referente a data instaciada de d04
		
		System.out.println("d04 mês = " + d04.getMonthValue()); // utilizando o método getMonthValue para pegar apenas o número do mês referente a data instanciada d04
		
		System.out.println("d04 ano = " + d04.getYear()); // idem aos anteriores, porém o valor do ano

		System.out.println("d05 hora = " + d05.getHour()); // utilizando o método getHour para pegar a hora referente a data em questão, importante salientar que funcionará apenas para objetos LocalDateTime
		
		System.out.println("d05 minutos = " + d05.getMinute()); // idem ao anterior, porém para conseguir os minutos

	}
}