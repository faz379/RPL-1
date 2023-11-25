package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class kamar extends Model {
	public String _paviliun;
	public String _tipeRuang;
	public int _tarif;
	public pembayaran _pembayaran;

	public void insert() {
		throw new UnsupportedOperationException();
	}

	public void view() {
		throw new UnsupportedOperationException();
	}

	public void update() {
		throw new UnsupportedOperationException();
	}
}