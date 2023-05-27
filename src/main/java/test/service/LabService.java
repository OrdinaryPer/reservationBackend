package test.service;
import java.util.List;
import test.bean.Lab;
import test.bean.State;
public interface LabService {
	List<Lab> selectAll();
	List<Lab> selectByState(State state);
	List<Lab> selectByName(Lab lab);
	void updateState(Lab lab);
	List<Lab> selectById(Lab lab);
	void updateById(Lab lab);
	void deleteById(Lab lab);
	void addLab(Lab lab);
	List<Lab> selectPlace();
}
