package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class pendaftaran extends Model{
	public int _noPendaftaran;
	public String _namaPasien;
	public String _tipe;
	public int _tglDaftar;
	public String _poli;
	public int _noTelp;
	public pasien _pasien;

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