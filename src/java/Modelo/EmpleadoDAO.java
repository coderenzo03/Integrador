package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import config.Conexion;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Empleado validar(String usuario, String contraseña) {
        Empleado em = new Empleado();
        String sql = "SELECT * FROM Empleado WHERE usero=? AND Dni=?";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();

            while (rs.next()) {
                em.setIdEmpleado(rs.getInt("idEmpleado"));
                em.setDni(rs.getString("Dni"));
                em.setNombres(rs.getString("Nombres"));
                em.setUser(rs.getString("User"));

            }
        } catch (Exception e) {

        }
        return em;
    }

    //operaciones CRUD
    public List listar() {
        String sql = "select * from empleado";
        List<Empleado> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setId(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNom(rs.getString(3));
                em.setTel(rs.getString(4));
                em.setEstado(rs.getString(5));
                em.setUser(rs.getString(6));
                lista.add(em);
            }
        } catch (Exception e) {
            // Manejo de la excepción
        }
        return lista;
    }

    public int agregar(Empleado em) {
        String sql = "insert into empleado(Dni, Nombres, Telefono, Estado, User) values(?, ?, ?, ?, ?)";
        int r = 0;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getDni());
            ps.setString(2, em.getNom());
            ps.setString(3, em.getTel());
            ps.setString(4, em.getEstado());
            ps.setString(5, em.getUser());
            r = ps.executeUpdate();
        } catch (Exception e) {
            // Manejo de la excepción
        }
        return r;
    }
    public Empleado listarId(int id){
        Empleado emp=new Empleado();
        String sql="select * form empleado where IdEmpelado="+id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                emp.setDni(rs.getString(2));
                emp.setNom(rs.getString(3));
                emp.setTel(rs.getString(4));
                emp.setEstado(rs.getString(5));
                emp.setUser(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return emp;
    }

    // Método para actualizar un empleado existente
    public int actualizar(Empleado em) {
        String sql = "update empleado set Dni=?, Nombres=?, Telefono=?, Estado=?, User=? where IdEmpleado=?";
        int r = 0;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getDni());
            ps.setString(2, em.getNom());
            ps.setString(3, em.getTel());
            ps.setString(4, em.getEstado());
            ps.setString(5, em.getUser());
            ps.setInt(6, em.getId());
            r = ps.executeUpdate();
        } catch (Exception e) {
            // Manejo de la excepción
        }
        return r;
    }

    // Método para eliminar un empleado por ID
    public void delete(int id) {
        String sql = "delete from empleado where IdEmpleado"+id;
        int r = 0;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            // Manejo de la excepción
        }
    }
}
