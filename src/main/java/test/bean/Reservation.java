package test.bean;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
public class Reservation {
	private int rsv_id;
	private User aUser;
	private Lab aLab;
	private State aState;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime start_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime end_time;
	public int getRsv_id() {
		return rsv_id;
	}
	public void setRsv_id(int rsv_id) {
		this.rsv_id = rsv_id;
	}
	public User getaUser() {
		return aUser;
	}
	public void setaUser(User aUser) {
		this.aUser = aUser;
	}
	public Lab getaLab() {
		return aLab;
	}
	public void setaLab(Lab aLab) {
		this.aLab = aLab;
	}
	public LocalDateTime getStart_time() {
		return start_time;
	}
	public void setStart_time(LocalDateTime start_time) {
		this.start_time = start_time;
	}
	public LocalDateTime getEnd_time() {
		return end_time;
	}
	public void setEnd_time(LocalDateTime end_time) {
		this.end_time = end_time;
	}
	public State getaState() {
		return aState;
	}
	public void setaState(State aState) {
		this.aState = aState;
	}
}


