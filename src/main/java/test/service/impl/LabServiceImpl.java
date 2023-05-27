package test.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.bean.Lab;
import test.bean.State;
import test.bean.User;
import test.dao.LabDao;
import test.service.LabService;
@Service
@Transactional
public class LabServiceImpl implements LabService{
	@Autowired
	private LabDao labDao;
	public List<Lab> selectAll() {
		return labDao.selectAll();
	}
	public List<Lab> selectByState(State state) {
		return labDao.selectByState(state);
	}
	public List<Lab> selectByName(Lab lab) {
		return labDao.selectByName(lab);
	}
	public void updateState(Lab lab) {
		labDao.updateState(lab);
	}
	public List<Lab> selectById(Lab lab) {
		return labDao.selectById(lab);
	}
	public void updateById(Lab lab) {
		labDao.updateById(lab);
	}
	public void deleteById(Lab lab) {
		labDao.deleteById(lab);
	}
	public void addLab(Lab lab) {
		labDao.addLab(lab);
	}
	
	public List<Lab> selectPlace() {
		return labDao.selectPlace();
	}
}
