package test.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import test.bean.Res;
import test.bean.Reservation;
import test.bean.User;
import test.service.ReservationService;
@RestController
public class ReservationController {
	@Autowired
	private ReservationService resService;
	@PostMapping("/reserve/add")
	public String addReservation(@RequestBody Res res) {
		try {
			resService.addReservation(res);
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/rsv/user")
	public String selectReservationByUser(@RequestBody User user) {
		try {
			List<Reservation> list = resService.selectById(user);
			return JSON.toJSONString(list);
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/rsv/del")
	public String deleteReservation(@RequestBody Res res) {
		try {
			resService.deleteReservation(res);
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@GetMapping("/rsv/all")
	public String selectAll() {
		try {
			List<Reservation> all = resService.selectAll();
			if (all == null) {
				return JSON.toJSONString("");
			}
			return JSON.toJSONString(all);
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/rsv/update/state")
	public String updateState(@RequestBody Reservation res) {
		try {
			resService.updateState(res);
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/rsv/double/id")
	public String selectByUserIdAndLabId(@RequestBody Res res) {
		try {
			List<Reservation> all = resService.selectByDoubleId(res);
			if (all == null) {
				return JSON.toJSONString("");
			}
			return JSON.toJSONString(all);
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/rsv/update/state/rsvid")
	public String updateStateByReservationId(@RequestBody Reservation res) {
		try {
			resService.updateStateByRsvid(res);;
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
}
