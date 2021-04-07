package clases;

public class MiLista implements MiniList{

	private Container lista= null;
	int contador;

	
	public MiLista() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public MiLista(Container lista, int contador) {
		super();
		this.lista = lista;
		this.contador = contador;
	}

	

	public Container getLista() {
		return lista;
	}


	public void setLista(Container lista) {
		this.lista = lista;
	}


	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}

	private class Container {
		
		Object obj = null;
		Container next = null;

	}

	@Override
	public boolean add(Object a) throws NullPointerException {
		
		boolean retorno=true;
		try {
			if (a != null) {
				Container nuevo = new Container();
			    nuevo.obj=a;
			    if (lista == null){
				    lista = nuevo;
				    contador++;
			    }
			    else {
			    	Container actual = lista;
			        while (actual.next != null){
			            actual = actual.next;			            
			        }
			        actual.next = nuevo;
			        contador++;
			    }			   
			}else
				throw new NullPointerException();
		}catch (NullPointerException e) {
			System.out.println("No se admiten nulos");
			retorno =false;
		}	
	
		return retorno;
	}

	@Override
	public Object get(int posicion) {

		Container actual = lista;
		int i=0;
		Object informacion=null;
		while( i< posicion) {
			actual = actual.next;
			i++;		
		}
		informacion = actual.obj;
		return informacion;    
	}
	
	


	@Override
	public boolean contains(Object a) {
		// TODO Auto-generated method stub
		boolean igual = false;
		
		Container actual = lista;
		while(actual.next != null & igual != true) {
			if(actual.obj.equals(a)) {
				igual = true;
			}
			actual = actual.next;
		}
		
		return igual;
	}

	
	@Override
	public boolean delete(Object a) {
		// TODO Auto-generated method stub
		
		boolean borrar = false;
		
		Container actual = lista;
		while(actual != null & borrar != true) {
			if(actual.next.obj.equals(a)) {
				borrar = true;
				if (actual.next.next!=null) {
					Container aux = actual.next.next;
					actual.next=null;
					actual.next=aux;	
				} else {
					actual.next=null;
				}
				
			}
			actual = actual.next;
		}
		
		return borrar;	
	}

	@Override
	public boolean delete(int num) {
		// TODO Auto-generated method stub
		boolean borrar = false;
		int contar = 0;
		Container actual = lista;
		while(actual != null & borrar != true) {
			if(contar==num-1) {
				borrar = true;
				if (actual.next.next!=null) {
					Container aux = actual.next.next;
					actual.next=null;
					actual.next=aux;	
				} else {
					actual.next=null;
				}	
			}
			contar++;
			actual = actual.next;
		}		
		return borrar;
	}

	@Override
	public boolean set(Object a, int num) {
		// TODO Auto-generated method stub
		boolean cambiar = false;
		int contar = 0;
		Container actual = lista;
		while(actual != null & cambiar != true) {
			if(contar==num) {
				cambiar = true;
				actual.obj = a;	
			}
			contar++;
			actual = actual.next;
		}		
		return cambiar;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		int contar = 0;
		Container actual = lista;
		while(actual != null ) {
			contar++;
			actual = actual.next;
		}
		return contar;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		lista = null;
	}
	
	public void lista() {
		Container actual = lista;

		while (actual.next != null){
            System.out.println(actual.obj);
			actual = actual.next;			            
        }
		System.out.println(actual.obj);
	}
}
