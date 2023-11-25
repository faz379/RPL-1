package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class user extends Model {
	public String _username;
	private String _password;
	public pembayaran _pembayaran;

	public void Login() {
		throw new UnsupportedOperationException();
	}

	public void Logout() {
		throw new UnsupportedOperationException();
	}
}