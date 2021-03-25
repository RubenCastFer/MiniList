package clases;

public class MiLista implements MiniList{

	private Container lista=null;
	Object obt = null;
	
	@Override
	public Boolean add(Object a) throws NullPointerException {
		/*if (a==null)
			throw new NullPointerException();
		obt=a;
		*/
		return true;
	}

	@Override
	public Object get(int num) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class Container {
		Object obj = null;
		container next == null
	}
}
