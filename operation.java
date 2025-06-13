package bankapplication;

import java.util.*;

public class operation {
	bank user;
	static Map<Integer,bank> l = new HashMap();
	void createAccount(int id, String name, int bal) {
		user = new bank();
		user.setId(id);
		user.setName(name);
		user.setBal(bal);
		l.put(user.getId(), user);
	}
	void display(int id) {
		System.out.println(l.get(id));
	}
	void withdraw(int id,int amt) {
		l.get(id).setBal(l.get(id).getBal()-amt);
	}
	void deposit(int id,int amt) {
		l.get(id).setBal(l.get(id).getBal()+amt);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
