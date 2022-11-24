import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // instanciando a formata��o para a data com
																			// o objeto sdf
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // instanciando a data a partir da data GMT

		System.out.println(sdf.format(d)); // imprimindo formatado
		System.out.println(d); // imprimindo sem formatacao (observar que a impressao sair� no hor�rio local

		Calendar cal = Calendar.getInstance(); // instanciaremos agora o objeto cal da classe Calendar
		cal.setTime(d); // nesse momento ser� transferida a data d para o objeto cal, ou seja, temos um
						// calendario com a data d.

		cal.add(Calendar.HOUR_OF_DAY, 4); // utilizamos esse m�todo para adicionar quatro horas do dia � data d.

		d = cal.getTime(); // aqui atualizaremos a data d com o valor de cal, pois o objeto cal era capaz
							// de fazer a soma e subtra��o de horas e o objeto original (classe Date) n�o
							// seria.

		System.out.println(sdf.format(d)); // agora vamos imprimir a data d com a formatacao sdf
		System.out.println(d); // impressao sem formatacao (formatacao original java)

		/* OBTENDO UMA UNIDADE DE TEMPO */

		int minutes = cal.get(Calendar.MINUTE); // aqui a variavel minutes recebera o valor MINUTOS referente ao objeto
												// cal do exemplo anterior
		
		int month = 1 + cal.get(Calendar.MONTH); // idem ao anterior mas dessa vez para o valor do m�s *** IMPORTANTE
													// *** o m�s de janeiro para esse objeto � o m�s zero, sendo assim
													// devemos sempre somar um para que o resultado saia correto ****

		System.out.println("minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
