package car.rental.database;

import java.util.ArrayList;
import java.util.List;



public class StaticDatabase<T> {
	
	private  List<T> list = new ArrayList<T>();

	public  List<T> GetList() {
		return list;

	}

}
