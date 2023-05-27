package test.dao;
import test.bean.User;
public interface UserDao {
   void insertUser(User user);
   User selectId(User user);
   User selectAll(User user);
   void updatePassword(User user);
}
