package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class dokter extends Model {
	public String _namaDokter;
	public String _jenisKelamin;
	public String _jabatan;

	public void insert() {
		throw new UnsupportedOperationException();
	}

	public void view() {
		throw new UnsupportedOperationException();
	}
}