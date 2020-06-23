package Modelo;

public class Usuario {
    int num_doc;
    String correo;
    String contrasenna;

    public Usuario() {
    }

    public Usuario(int num_doc, String correo, String contrasenna) {
        this.num_doc = num_doc;
        this.correo = correo;
        this.contrasenna = contrasenna;
    }

    public int getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(int num_doc) {
        this.num_doc = num_doc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    
    
    
}
