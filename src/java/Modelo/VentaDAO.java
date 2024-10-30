package Modelo;

import java.sql.Connection; // Importar correctamente
import config.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentaDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public String GenerarSerie() {
        String numeroserie = ""; // Valor predeterminado
        String sql = "SELECT MAX(NumeroSerie) FROM ventas";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                numeroserie = rs.getString(1);
            }
        }catch (Exception e) {  
      }
        return numeroserie ;
    }
    public String IdVentas() {
    String idventas="";
    String sql="select max(Idventas) from ventas";
    try{
     con=cn.Conexion();
     ps=con.prepareStatement(sql);
     rs=ps.executeQuery();
     while (rs.next()) {
       idventas=rs.getString(1);
       }   
     } catch (Exception e){
  }
  return idventas;
}
    public int guardarVenta(Venta ve){
    String sql="insert into ventas(IdCliente, IdEmpleado, NumerioSerie, FechaVentas, Monto,Estado)values(?,?,?,?,?,?)";
    try {
       con=cn.Conexion();
       ps=con.prepareStatement(sql);
       ps.setInt(1, ve.getIdcliente());
       ps.setInt(2, ve.getIdempleado());
       ps.setString(3, ve.getNumserie());
       ps.setString(4, ve.getFecha());
       ps.setDouble(5, ve.getPrecio());
       ps.setString(6, ve.getEstado());
       ps.executeUpdate();
      } catch (Exception e){
      }
        
        return r;
}
  public int guardarDetalleventas(Venta venta){
        String sql="insert into detalle_ventas(IdVentas, IdProducto, cantidad, PrecioVenta)values(?,?,?,?,?)";
            try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, venta.getId());
            ps.setInt(2, venta.getIdproducto());
            ps.setInt(3, venta.getCantidad());
            ps.setDouble(4, venta.getPrecio());
            ps.executeUpdate();
          }   catch (Exception e){
}
            return r;
}
}
