package practica08;

public class Usuario 
{
   private String userName, password, rol;
   private boolean state;                                                       //state es el estado, activo o inactivo
   private int id;
   
   public Usuario()
   {
       this.userName = null;
       this.id = 0;
       this.password = null;
       this.state = false;
       this.rol = null;
   }
      
   public Usuario(int id, String userName, String password, 
           String rol, boolean state)
   {
       this.id = id;
       this.userName = userName;
       this.password = password;
       this.rol = rol;
       this.state = state;
   }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
