package test.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.bean.Res;
import test.bean.Reservation;
import test.bean.User;
import test.dao.ReservationDao;
import test.service.ReservationService;
@Service
@Transactional
public class ReservationServiceImpl implements ReservationService{
	@Autowired
	private ReservationDao resDao;
	
	public void addReservation(Res res) {
		resDao.addReservation(res);
	}
	
	public List<Reservation> selectById(User user) {
		return resDao.selectById(user);
	}
	public void deleteReservation(Res res) {
		resDao.deleteReservation(res);
	}
	public List<Reservation> selectAll() {
		return resDao.selectAll();
	}
	public void updateState(Reservation res) {
		resDao.updateState(res);
	}
	public List<Reservation> selectByDoubleId(Res res) {
		return resDao.selectByDoubleId(res);
	}
	public void updateStateByRsvid(Reservation res) {
		resDao.updateStateByRsvid(res);
	}
}
