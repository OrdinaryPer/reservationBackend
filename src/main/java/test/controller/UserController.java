package test.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import test.bean.User;
import test.service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/user/register")
	public String insertUser(@RequestBody User user) {
		try {
			userService.insertUser(user);
			return JSON.toJSONString("success");
		} catch(Exception e) {
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/user/login")
	public String selectId(@RequestBody User user) {
		try {
			User user2 = userService.selectId(user);
			if (user2 == null) {
				return JSON.toJSONString("");
			}
			return JSON.toJSONString(user2);
		} catch (Exception e) {
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/user/info")
	public String selectAll(@RequestBody User user) {
		try {
			User all = userService.selectAll(user);
			return JSON.toJSONString(all);
		} catch (Exception e) {
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/user/update")
	public String udpatePassword(@RequestBody User user) {
		try {
			userService.updatePassword(user);
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
}
