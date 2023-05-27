package test.service;
import test.bean.User;
public interface UserService {
	   void insertUser(User user);
	   User selectId(User user);
	   User selectAll(User user);
	   void updatePassword(User user);
}
