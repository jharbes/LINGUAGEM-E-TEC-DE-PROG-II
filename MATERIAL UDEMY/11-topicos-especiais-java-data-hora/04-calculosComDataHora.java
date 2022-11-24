package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/* *** IMPORTANTE ***

	Data e hora em Java são objetos imutáveis, ou seja, quando desejar alterar alguma data-hora
	existente devemos intanciar um novo objeto, nunca tentar alterar o objeto já existente e instanciado.

*/

public class Program4 {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekDate = d04.minusDays(7); // criando um novo objeto (pastWeekDate) de data onde a data solicitada é de 7 dias atrás (1 semana atrás)
		
		LocalDate nextWeekDate = d04.plusDays(7); // idem ao anterior, porém serão 7 dias pra FRENTE (uma semana na frente), o valor dos dias pode ser qualquer valor desejado em ambos os métodos, o mesmo método existe para meses a anos igualmente.
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7); // exemplo idem aos anteriores, porém nesse caso o objeto também possui hora, no entanto estamos apenas manipulando os dias nesse caso.
		
		LocalDateTime nextWeekLocalDate = d05.plusDays(7); // idem ao anterior, porém para mais sete dias em vez de menos sete dias. no caso de LocalDateTime temos métodos equivalentes para horas, minutos, segundos, nanosegundos, etc.
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // No caso do instant não temos o método minusDays ou plusDays, portanto devemos utilizar o método minus, seguido do número desejado para redução e a unidade que queremos reduzir, nesse caso utilizaremos o objeto ChronoUnit.DAYS que corresponde a dias, mas temos o mesmo objeto para outras unidades de tempo.
		
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // idem ao anterior, só que nesse caso será para incremento (Plus)
		
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay()); // aqui calcularemos o espaço de tempo entre duas datas instanciadas, observar que também utilizamos o método atStartOfDay para utilizar a hora zero do dia. Precisamos utilizar esse método pois ele não é capaz de efetuar o calculo sem a consideração do tempo, utilizando dessa maneira o tempo fica setado. (funciona como uma conversão para LocalDateTime
		
		Duration t2 = Duration.between(pastWeekLocalDate, d05); // idem ao anterior efetuando o cálculo entre as datas, porém aqui já temos como LocalDateTime, sendo assim não precisamos converter.
		
		Duration t3 = Duration.between(pastWeekInstant, d06); // idem aos anteriores, só que agora para instant (com fuso horario global)
		
		Duration t4 = Duration.between(d06, pastWeekInstant); // aqui é como o anterior, porém invertido, logo o resultado será negativo.

		System.out.println("t1 dias = " + t1.toDays()); // ao imprimir usamos o método toDays para que a unidade de saida seja em dias.
		
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}