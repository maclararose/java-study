package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Carlos");
		usuarios.put(2, "Maria");
		usuarios.put(3, "Ricardo");
		usuarios.put(4, "Roberto");
		usuarios.put(5, "Lia");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); // somente as chaves
		System.out.println(usuarios.values()); // somente os valores
		System.out.println(usuarios.entrySet()); // chave = valor
		
		System.out.println("----------------------------------------------------");
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Carla"));
		System.out.println(usuarios.containsValue("Lia"));
		System.out.println("----------------------------------------------------");
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("----------------------------------------------------");
		
		for(String nome: usuarios.values()) {
			System.out.println(nome);
		}
		
		System.out.println("----------------------------------------------------");
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
			
		}
	}

}
