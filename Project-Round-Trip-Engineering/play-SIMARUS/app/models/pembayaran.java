package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class pembayaran extends Model {
	public int _noPendaftaran;
	public String _namaTindakan;
	public int _biayaTindakan;
	public user _user;
	public kamar _kamar;

	public void insert() {
		throw new UnsupportedOperationException();
	}

	public void view() {
		throw new UnsupportedOperationException();
	}
}