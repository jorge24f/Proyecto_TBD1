
package Package1;

/**
 *
 * @author jflg
 */
public class Usuario {
    
    private String correo;
    private String password;
    private String user_type;

    public Usuario() {
    }

    public Usuario(String correo, String password, String user_type) {
        this.correo = correo;
        this.password = password;
        this.user_type = user_type;
    }

    public String getCorreo() {
        return correo;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", password=" + password + ", user_type=" + user_type + '}';
    }
    
    
    
}
