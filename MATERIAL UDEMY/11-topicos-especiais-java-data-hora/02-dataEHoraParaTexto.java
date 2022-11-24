package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); // *** OBJETO DE DATA E HORA ATUAL CRIADO
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // cria o objeto fmt1 no qual a data ficará no formato dd/MM/yyyy OBS1 *** OBJETO COM PADRÃO DE FORMATAÇÂO ***
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // criando o objeto fmt2 no qual a data e hora ficará com o formato dd/MM/yyyy HH:mm
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // para customizar data e hora no caso de horas com padrão GMT devemos usar o método adicional withZone (no caso desse exemplo usamos o ZoneID.systemDefault, ele utilizará o fuso horário padrão do sistema no qual está sendo chamado o método.
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // formato pré definido conforme documentacao da oracle no link informado neste documento (já possui diversas formatações pré estabelecidas) , não pode formatar o Instant pois ele obriga que haja informações do fuso horário na formatação de saída.
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // formato pré definido, no entanto possui informação de fuso horário, podendo servir de formatação para Instant (que possuem fuso horário na formatação)
		
		System.out.println("d04 = " + d04.format(fmt1)); // imprime a data d04 no formato criado acima fmt1, ficando no formato dd/MM/yyyy OBS1 *** CONVERSÃO PARA IMPRESSÃO DE UM OBJETO DATA -HORA PARA OUTRO PADRÃO DE IMPRESSAO ESCOLHIDO)
		
		System.out.println("d04 = " + fmt1.format(d04)); // mesmo resultado do item anterior, porém a chamada é pelo método do objeto fmt1. OBS1
		
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // idem aos dois acima, mas nesse caso fazemos a transformação dentro da própria chamada do método, desfazendo a necessidade de instanciar o formato antecipadamente.
		
		System.out.println("d05 = " + d05.format(fmt1)); // primeiro imprimimos o objeto d05 que possui atributos de tempo em formato que possui apenas dia e mês e não haverá problema.
		
		System.out.println("d05 = " + d05.format(fmt2)); // aqui imprimimos o objeto d05 que possui data e hora em novo formato designado conforme instanciação do formato fmt2 acima no documento.
		
		System.out.println("d05 = " + d05.format(fmt4));

		System.out.println("d06 = " + fmt3.format(d06)); // temos que a classe instant na qual o objeto d06 foi instanciado não permite a utilização do método format, por isso chamaremos o mesmo método pelo objeto de formatação fmt3 com o argumento de d06. IMPORTANTE*** Importante perceber que a data impressa será no horário local, ou seja, haverá conversão em relação a data inicialmente instanciada.
		
		System.out.println("d06 = " + fmt5.format(d06)); // agora irá imprimir o objeto de data e hora com fuso horário no formato pré estabelecido fmt5 , no qual existe informação de fuso horário.
		
		System.out.println("d06 = " + d06.toString()); // imprime no formato ISO, d06 por si só já chama o método to.String(), então nesse caso ele é opcional.
	}
}