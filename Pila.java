package lista_pila;

import javax.swing.JOptionPane;

public class Pila {
	private Nodo UltimoValorIngresado;
	int tama�o=0;
	String Lista="";
	
	public Pila() {
		UltimoValorIngresado=null;
		tama�o=0;
	}
	
	//Consultar Pila Vacia
	
	public boolean PilaVacia() {
		return UltimoValorIngresado == null;
	}
	
	//Insertar Nodo en la Pila
	public void InsertarNodo(int nodo) {
		Nodo nuevo_nodo = new Nodo(nodo);
		nuevo_nodo.siguiente=UltimoValorIngresado;
		UltimoValorIngresado = nuevo_nodo;
		tama�o++;
	}
	
	//Eliminar Nodo
	public int EliminarNodo() {
		int auxiliar = UltimoValorIngresado.informacion;
		UltimoValorIngresado=UltimoValorIngresado.siguiente;
		tama�o--;
		return auxiliar;
	}
	
	//Ultimo Valor Ingresado
	public int MostrarUltimoValorIngresado() {
		return UltimoValorIngresado.informacion;
	}
	
	//Tama�o de la Pila
	public int TamanoPila() {
		return tama�o;
	}
	//Vaciar Pila
	public void VaciarPila() {
		while(!PilaVacia()) {
			EliminarNodo();
		}

	}
	
	//Imprimir Pila
	public void MostrarValores() {
		Nodo recorrido = UltimoValorIngresado;
		while(recorrido!=null) {
			Lista+= recorrido.informacion+"\n";
			recorrido = recorrido.siguiente;
		}
		JOptionPane.showMessageDialog(null, Lista);
		Lista="";
	}
}
