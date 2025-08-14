package estrutura.dados.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		// Tamanho da lista: size()
		System.out.println(list.size());

		// Inserir elemento na lista: add(obj), add(int, obj)
		list.add(32);
		list.add(3, 54);

		// Remover elemento da lista: remove(obj), remove(int), removeIf(Predicate)
		list.remove(32);
		list.remove(3);
		list.removeIf(x -> x <= 32);
		
		// Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
		list.indexOf(23);
		list.lastIndexOf(34);
		
		// Filtrar lista com base em predicado: list.stream().filter(x -> x > 4).collect(Collectors.toList());
		list.stream().filter(x -> x > 4).collect(Collectors.toList());

		// Encontrar primeira ocorrência com base em predicado: list.stream().filter(x -> x > 4).findFirst().orElse(null);
		list.stream().filter(x -> x > 4).findFirst().orElse(null);
	}

}
