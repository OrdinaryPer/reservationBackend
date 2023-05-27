package test.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.bean.User;
import test.dao.UserDao;
import test.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public void insertUser(User user) {
		userDao.insertUser(user);
	}
	public User selectId(User user) {
		return userDao.selectId(user);
	}
	public User selectAll(User user) {
		return userDao.selectAll(user);
	}
	public void updatePassword(User user) {
		userDao.updatePassword(user);
	}
}
