package practica01_examen.practica01.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Patrones de diseno (un decorador), esto hace : al hacer una estructura dinamica
en tiempo de ejecucion crece la cantidad de elementos que tiene (se puede agregar y eliminar) 
en tiempo de ejecucion.  En tiempo de ejecucion, al instanciar una clase en este caso estado
en tiempo de ejecion le da ciertas caracteristicas para que spring lo entienda (lo entiende como entidad)
@table  indica a la tabla que hace referencia se llam  "estado".
 */
@Entity
@Table(name = "estado")
public class estado implements Serializable {

    @Id //Duda no se si es estado o solo id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long country_Id;
    private String country_name;
    private long phone_code;
    private String country_code;
    private String capital;

    public long getCountry_Id() {
        return country_Id;
    }

    public void setCountry_Id(long country_Id) {
        this.country_Id = country_Id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public long getPhone_code() {
        return phone_code;
    }

    public void setPhone_code(long phone_code) {
        this.phone_code = phone_code;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
