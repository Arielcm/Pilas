package lista_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {
	public static void main(String[] args) {
	
		int opcion=0,nodo=0;
		
		Pila pila = new Pila();
		do {
			try {
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
						"Menu de Opciones\n\n"
						+"1- Insertar Nodo\n"
						+"2- Eliminar Nodo\n"
						+"3- La Pila esta Vacia?\n"
						+"4- Ultimo Valor de la Pila\n"
						+"5- Total de Nodos de la Pila\n"
						+"6- Vaciar Pila\n"
						+"7- Mostrar Pila\n"
						+"8- Salir\n\n"
						));
				switch (opcion) {
				case 1:
					nodo=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar Valor a Guardar"));
					pila.InsertarNodo(nodo);
					break;
				case 2:
					if (!pila.PilaVacia()) {
						JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo con el valor: "+pila.EliminarNodo());
					} else {
						JOptionPane.showMessageDialog(null, "La pila esta Vacia!");
					}
					break;
				case 3:
					if (pila.PilaVacia()) {
						JOptionPane.showMessageDialog(null, "La pila esta Vacia!");
					} else {
						JOptionPane.showMessageDialog(null, "La pila NO esta Vacia!");
					}
					break;
				case 4:
					if (!pila.PilaVacia()) {
						JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es: "
								+pila.MostrarUltimoValorIngresado());
					} else {
						JOptionPane.showMessageDialog(null, "La pila esta Vacia!");
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "La Pila Contiene "+pila.TamanoPila()+" Nodos");
					break;
				case 6:
					if (!pila.PilaVacia()) {
						pila.VaciarPila();
						JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente!");
					} else {
						JOptionPane.showMessageDialog(null, "La pila esta Vacia!");
					}
					break;
				case 7:
					pila.MostrarValores();
					break;
				case 8:
					opcion=8;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion Incorrecta. Vuelve a Intentar");
					break;
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Caracter Incorrecto. Vuelve a Intentar");
			}
			
		} while (opcion!=8);
	}
}
