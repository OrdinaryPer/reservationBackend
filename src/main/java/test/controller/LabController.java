package test.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import test.bean.Lab;
import test.bean.State;
import test.service.LabService;
@RestController
public class LabController {
	@Autowired
	private LabService labService;
	@GetMapping("/lab/all")
	public String selectAll() {
		try {
			List<Lab> all = labService.selectAll();
			if (all == null) {
				return JSON.toJSONString("");
			}
			return JSON.toJSONString(all);
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/lab/state")
	public String selectByState(@RequestBody State state) {
		try {
			List<Lab> list = labService.selectByState(state);
			if (list == null) {
				return JSON.toJSONString("");
			}
			return JSON.toJSONString(list);
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/lab/name")
	public String selectByName(@RequestBody Lab lab) {
		try {
			List<Lab> list = labService.selectByName(lab);
			if (list == null) {
				return JSON.toJSONString("");
			}
			return JSON.toJSONString(list);
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/lab/update/state")
	public String updateState(@RequestBody Lab lab) {
		try {
			labService.updateState(lab);
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/lab/id")
	public String selectById(@RequestBody Lab lab) {
		try {
			List<Lab> list = labService.selectById(lab);
			if (list == null) {
				return JSON.toJSONString("");
			}
			return JSON.toJSONString(list);
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/lab/update/id")
	public String updateLabById(@RequestBody Lab lab) {
		try {
			labService.updateById(lab);
			return JSON.toJSONString("success");
		} catch(Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/lab/del/id")
	public String deleteById(@RequestBody Lab lab) {
		try {
			labService.deleteById(lab);
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@PostMapping("/lab/add")
	public String addLab(@RequestBody Lab lab) {
		try {
			labService.addLab(lab);
			return JSON.toJSONString("success");
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
	@GetMapping("/lab/place")
	public String selectAllPlace() {
		try {
			List<Lab> list = labService.selectPlace();
			return JSON.toJSONString(list);
		} catch (Exception e) {
			e.printStackTrace();
			return JSON.toJSONString("fail");
		}
	}
}
