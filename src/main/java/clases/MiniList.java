package clases;

import java.util.ArrayList;

public interface MiniList {
	/**
	 * El metodo introduce un elemento al final de la lista
	 * se pasa elemento a introducir
	 * indica true si el elemento fue insertado
	 * lanza NullPointerException en caso de intentar insertar un valor nulo
	 */
	public  boolean add (Object a) throws NullPointerException;

	/**
	 * Metodo que comprueba la existencia de un elemento en la lista
	 * se pasa elemento a buscar
	 * indica verdadero si esta, falso si no esta
	 */
	public boolean contains(Object a);
	
	/**
	 * Elimina el primer elemento que encuentre en la lista que sea igual
	 * al elemento que se pasa como parámetro
	 * se pasa elemento a eliminar
	 * indica verdadero si elimino, falso si no
	 */
	public boolean delete (Object a);
	
	/**
	 * Elimina el elemento que ocupe la posición que se indica como parámetro
	 * se pasa posición del elemento a eliminar
	 * indica verdadero si se elimino, falso si no
	 */
	public boolean delete (int num);	
	/**
	 * Cambia el elemento que está en la posición que se pasa como parametro
	 * se indica posición a cambiar
	 * se pasa elemento a introducir
	 * verdadero si se cambió, falso si no
	 */
	public boolean set(Object a, int num);	

	/**
	 * Devuelve el elemento de la posición que se pasa como parámetro
	 */
	public Object get (int num);
		
	/**
	 * Indica el numero de elementos que tiene la lista
	 */
	public int size ();
	
	/**
	 * Pone la lista a 0 elementos
	 */
	public void clear ();




	
	
}
