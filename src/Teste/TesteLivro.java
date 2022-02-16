package Teste;

import Modelo.Livro;
import java.util.ArrayList;
import java.util.Comparator;

public class TesteLivro {

	public static void main(String[] args) {
		
		ArrayList<Livro> listaLivros = new ArrayList<>();
		listaLivros.add(new Livro("O pequeno principe", "Antoine de Saint-Exupéry"));
		listaLivros.add(new Livro("E não sobrou nenhum", "Agatha Christie"));
		listaLivros.add(new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling"));
		
		String qualComparar = "autor";
		Comparator<Livro> comp = null;
		
		if(qualComparar == "titulo") {
				comp = (Livro l1, Livro l2) -> {
	            String tituloL1 = l1.getTitulo();
	            String tituloL2 = l2.getTitulo();
	            return tituloL1.compareTo(tituloL2);
			};
		} else if(qualComparar == "autor") {
				comp = (Livro l1, Livro l2) -> {
	            String autorL1 = l1.getAutor();
	            String autorL2 = l2.getAutor();
	            return autorL1.compareTo(autorL2);
			};
		}
		
		listaLivros.sort(comp);
		
		listaLivros.forEach((livro) -> System.out.println(livro));
		
	}

}
