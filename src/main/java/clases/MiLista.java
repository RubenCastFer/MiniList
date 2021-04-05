package clases;

public class MiLista implements MiniList{

	private Container lista= null;
	int contador;

	@Override
	public boolean add(Object a) throws NullPointerException {
//		if(a==null)
//			throw new NullPointerException("No se admiten nulos");
//		
//		obj=a;
		
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
		
		/*Object retorno = null;
		int i=0;
		Container temp = new Container();
		temp=lista;
		while( i<= posicion) {
			
			
			retorno=temp.obj;
			temp=temp.next;
			i++;
		}
		
		return retorno;*/
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
	
	
	private class Container {
		
		Object obj = null;
		Container next = null;
		//private int id;
		
		//quitar metodos

		
	}

	@Override
	public boolean contains(Object a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean set(Object a, int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
