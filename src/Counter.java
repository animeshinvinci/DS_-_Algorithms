
public class Counter  {
	private static volatile Counter _instance;
	private int num;

	private  Counter() { 
	
	}

	public static Counter getInstance()
	{ 
		if(_instance == null)
		{ 
			synchronized(Counter.class)
			{ if(_instance == null)
				_instance = new Counter(); } } return _instance;
	}

	
}
