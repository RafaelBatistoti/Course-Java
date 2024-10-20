package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {

//		Data do momento agora
		LocalDate d01 = LocalDate.now();

//		Data do momento agora com hor�rio
		LocalDateTime d02 = LocalDateTime.now();

//		Exibe com o padr�o GMT, (hor�rio de Londres)
		Instant d03 = Instant.now();

//		Converte texto em datas
//		No formato ISO8601
		LocalDate d04 = LocalDate.parse("2024-07-20");

//		Converte texto em datas com hor�rios
//		No formato ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2024-07-20T01:30:26");

//		Converte texto em datas com hor�rios GMT
//		No formato ISO8601
		Instant d06 = Instant.parse("2024-07-20T01:30:26Z");

//		Com esse; (-4h) mostra-se na tela o horario atual em Londres 
//		Passando o hor�rio do Brasil
		Instant d07 = Instant.parse("2024-07-20T01:30:26-04:00");

//		Para passar uma data customizada 
//		Especificando a forma como voc� ta passando sua data, 
//		No caso dd/mm/yyyy		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate         d08 = LocalDate.parse("20/07/2024", fm1);

//		O mesmo se passa quando informado a hora
//		por�m � necess�rio estanciar um novo formato padr�o
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime     d09 = LocalDateTime.parse("20/07/2024 01:30", fm2);

//		Com o "of" voc� pode informar a data isoladamente
//		por�m � necess�rio que em dias e m�s
//		passe sem o os 0, como 01, 02...
		LocalDate d10 = LocalDate.of(2024, 7, 8);

//		O mesmo vale para caso precise informar o tempo
		LocalDateTime d11 = LocalDateTime.of(2024, 7, 8, 1, 30);

//		******************* OUTRAS OPERA��ES COM DATAS *******************

//		Recebendo a informa��o de data
//		No formato USA
		LocalDate op01 = LocalDate.parse("2024-07-20");

//		Criando um formater para o formato da date no BR
		DateTimeFormatter fmt01    = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String            newDate1 = op01.format(fmt01);

//		Tamb�m � possivel passar a formata��o diremtamente na variavel
		String newDate2 = fmt01.format(op01);

//		Uma outra maneira de fazer
		String newDate3 = op01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

//		O mesmo ocorre quando informado a hora
//		por�m precisa ser instanciado um novo formato
		DateTimeFormatter fmt02    = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime     op02     = LocalDateTime.parse("2024-07-20T01:30:26");
		String            newDate4 = op02.format(fmt02);

//		Para casos de data e hora global 
//		� necess�rio incluir no format o "withZone"
//		Passando esse ZoneId.systemDefault 
//		A aplica��o pega o time zone da localiza��o onde a m�quina est�
		Instant           op03  = Instant.parse("2024-07-20T01:30:26Z");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

//		Como o Instant n�o possui formate, 
//		Passasse o DateTimeFormatter por primeiro
		String newDate5 = fmt03.format(op03);

//		Quando eu passo um hor�rio GMT (Londres) e fa�o as formata��es
//		O systema vai imprimir o hor�rio atual da minha m�quina (por causa do ZoneId)
//		Nesse caso especifico imprime -3h porque o meu hor�rio � -3h do GMT

//		******************* CONVERTENDO TIME GLOBAL EM TIME LOCAL *******************

//		Passando um horario global
		Instant op04 = Instant.parse("2024-07-20T01:30:26Z");

//		Convertendo em hor�rio local
		LocalDate d12 = LocalDate.ofInstant(op04, ZoneId.systemDefault());

//		Nesse caso especifico imprime -3h porque o meu hor�rio � -3h do GMT;

//		******************* OBTENDO VALORES DE DATA E HORA SEMPARADAMENTE (LOCALDATE) *******************	

		System.out.println("Dia: " + d05.getDayOfMonth());
		System.out.println("M�s: " + d05.getMonthValue());
		System.out.println("Ano: " + d05.getYear());
		System.out.println("Hora: " + d05.getHour());
		System.out.println("Minuto: " + d05.getMinute());
		System.out.println();
//		No java voc� n�o pode modificar o objeto criado da data
//		Voc� precisa criar um no vo objeto, uma nova inst�ncia, 
//		E modificar a data a partir dai

//		-7 dias da data criada
		LocalDate menosUmaSemana = d04.minusDays(7);

//		+7 dias da data criada
		LocalDate maisUmaSemana = d04.plusDays(7);

		System.out.println(menosUmaSemana);
		System.out.println(maisUmaSemana);
		System.out.println();

		LocalDateTime menosUmaSemanaComHora = d05.minusDays(7);
		LocalDateTime maisUmaSemanaComHora  = d05.plusDays(7);

		System.out.println(menosUmaSemanaComHora);
		System.out.println(maisUmaSemanaComHora);
		System.out.println();

		Instant intanteMenosUmaSemanaComHora = d06.minus(7, ChronoUnit.DAYS);
		Instant instanteMaisUmaSemanaComHora = d06.plus(7, ChronoUnit.DAYS);

		System.out.println(intanteMenosUmaSemanaComHora);
		System.out.println(instanteMaisUmaSemanaComHora);
		System.out.println();
		
//		******************* CALCULANDO A DURA��O ENTRE DUAS DATAS *******************

//		S� funciona quando a data cont�m Time
//		Seja Instnt ou LocalDateTime
		Duration t1 = Duration.between(menosUmaSemanaComHora, d05);
		System.out.println("Diferen�a de: " +t1.toDays() + " dias");
		System.out.println();
		
//		Transformando o LocalDate em LocaldateTime
		Duration t2 = Duration.between(menosUmaSemana.atStartOfDay(), d04.atStartOfDay());
		System.out.println("Diferen�a de: " +t1.toDays() + " dias passando LocalDate e convertendo para LocalDateTime");

	}

}
