package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class tindakanPasien extends Model{
	public int _noPendaftaran;
	public java.util.Vector<String> _namaTindakan;
	public String _namaDokter;

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