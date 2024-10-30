package Modelo;

public class Empleado {
    private int idEmpleado;
    private String dni; 
    private String nombres; 
    private String telefono; 
    private String estado;
    private String user; 

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) { 
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono; 
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    // Alias de los métodos para mantener compatibilidad con el código
    public int getId() {
        return getIdEmpleado();
    }

    public void setId(int id) {
        setIdEmpleado(id);
    }

    public String getNom() {
        return getNombres();
    }

    public void setNom(String nombres) {
        setNombres(nombres);
    }

    public String getTel() {
        return getTelefono();
    }

    public void setTel(String telefono) {
        setTelefono(telefono);
    }
}
