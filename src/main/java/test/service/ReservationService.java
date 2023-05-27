package test.service;
import java.util.List;
import test.bean.Res;
import test.bean.Reservation;
import test.bean.User;
public interface ReservationService {
	void addReservation(Res res);
	List<Reservation> selectById(User user);
	void deleteReservation(Res res);
	List<Reservation> selectAll();
	void updateState(Reservation res);
	List<Reservation> selectByDoubleId(Res res);
	void updateStateByRsvid(Reservation res);
}
