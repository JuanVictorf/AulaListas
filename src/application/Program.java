package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println("Tamanho da lista: " + list.size());
		// TRAZENDO NA TELA O ELEMENTO DA POSIÇÃO 1 - COD ABAIXO.
		//System.out.println("list: " + list.get(1));
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // RETORNA -1 SE NÃO ENCONTRAR O RESULTADO
		
		System.out.println("---------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());;
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		// ENCONTRANDO O PRIMEIRO ELEMENTO QUE COMECE COM A LETRA A, UTILIZANDO A EXPRESSÃO LAMBDA
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
