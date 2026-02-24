package abstraction;

import java.io.Serializable;
import java.util.List;

public interface UserService extends CommonService,Serializable,List<String> {
	//int X = 45454;
	
	void addUser();
	void deleteUser();
	
	default void edit() {}
	
	
	static void getAll() {
		
	}


}
