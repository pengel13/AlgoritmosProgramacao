package contatos;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contato> lista ;

	public ArrayList<Contato> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Contato> lista) {
		this.lista = lista;
	}
	
	public void addLista(Contato contato) {
		lista.add(contato);
	}
	
	public void ordena() {
	
	}
}
