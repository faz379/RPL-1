package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class obatKeluar extends Model {
	public String _namaObat;
	public String _namaPasien;
	public int _jumlah;
	public obat _obat;

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