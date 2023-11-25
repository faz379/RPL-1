package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


import java.util.Vector;

@Entity
public class obat extends Model {
	public String _namaObat;
	public int _stok;

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