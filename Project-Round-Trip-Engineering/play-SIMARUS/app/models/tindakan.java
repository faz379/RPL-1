package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class tindakan extends Model {
	public String _namaTindakan;
	public int _biayaTindakan;

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