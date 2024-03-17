
package Package1;

/**
 *
 * @author jflg
 */
public class Usuario {
    
    private String correo;
    private int noIdentidad;
    private String password;
    private String user_type;

    public Usuario() {
    }

    public Usuario(String correo, int noIdentidad, String password, String user_type) {
        this.correo = correo;
        this.noIdentidad = noIdentidad;
        this.password = password;
        this.user_type = user_type;
    }

    public String getCorreo() {
        return correo;
    }

    public int getNoIdentidad() {
        return noIdentidad;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNoIdentidad(int noIdentidad) {
        this.noIdentidad = noIdentidad;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", noIdentidad=" + noIdentidad + ", password=" + password + ", user_type=" + user_type + '}';
    }

    
}
