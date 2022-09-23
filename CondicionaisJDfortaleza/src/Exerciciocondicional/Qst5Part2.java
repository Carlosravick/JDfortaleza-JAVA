package Exerciciocondicional;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class Qst5Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Carlos";
		String saudacao = "";
		LocalDate hoje = LocalDate.now();
		//System.out.println(hoje.getDayOfWeek());
		Locale brasil = new Locale( "pt",  "BR");		
		System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		LocalDateTime agora = LocalDateTime.now();
		
		
		
		
		if (agora.getHour() >=0 && agora.getHour() < 12) {
			saudacao = "Bom dia";
		}else if (agora.getHour() >=12 && agora.getHour() < 18) {
			saudacao = "Boa tarde";
		}else if (agora.getHour() >=18 && agora.getHour() < 24) {
			saudacao = "boa noite";
		}else {
		
	}
		System.out.println("Olá "+ nome + " " + saudacao + " "  );
		System.out.println(agora.getHour()+":" + agora.getMinute());
		


}}