package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class pasien extends Model {
	public String _namaPasien;
	public int _noKTP;
	public String _jenisKelamin;
	public Date _tglLahir;
	public int _noTelp;
	public String _alamat;
	public pendaftaran _pendaftaran;

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