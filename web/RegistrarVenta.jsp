<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <title>VENTAS</title>
    </head>

    <body>
        <div class="d-flex">
            <div class="col-lg-5">
                <div class="card">
                    <form action="Controlador?menu=NuevaVenta" method="POST">
                        <div class="card-body">
                            <!-- Datos del cliente -->
                            <div class="form-group">
                                <label>Datos del cliente</label>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="codigocliente" value="${c.getDni()}" class="form-control" placeholder="Codigo">
                                    <button type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-info">Buscar</button>
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" name="nombrescliente" value="${c.getNom()}" placeholder="Datos Cliente"
                                           class="form-control col-sm-6">
                                </div>
                            </div>
                            <!-- Datos del producto -->
                            <div class="form-group">
                                <label>Datos Producto</label>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="codigoproducto" value="${producto.getId()}" class="form-control" placeholder="Codigo">
                                    <button type="submit" name="accion" value="BuscarProducto" class="btn btn-outline-info">Buscar</button>
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" name="nomproducto" value="${producto.getNom()}" placeholder="Datos Producto"
                                           class="form-control">
                                </div>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="precio" value="${producto.getPrecio()}" class="form-control" placeholder="s/.0.00">
                                </div>
                                <div class="col-sm-3">
                                    <input type="number" name="cant" value="1" placeholder=""  class="form-control">
                                </div>
                                <div class="col-sm-3">
                                    <input type="text" name="stock" value="${producto.getStock()}" placeholder="Stock" class="form-control">
                                </div>
                            </div>
                            <!-- Boton agregar producto al registro -->
                            <div class="form-group">
                                <div class="col-sm">
                                    <button type="submit"  name="accion" value="Agregar" class="btn btn-outline-primary">Agregar Producto</button>                
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-5 ml-auto">
                            <label>NumeroSerie</label>
                            <input type="text" name="NrSerie" value="${nserie}" class="form-control">
                        </div>
                        <br>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Nr</th>
                                    <th>Codigo</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                    <th>Cantidad</th>
                                    <th>Subtotal</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="list" items="${lista}">
                                <tr>
                                    <td>${list.getItem()}</td>
                                    <td>${list.getIdproducto()}</td>
                                    <td>${list.getDescripcion()}</td>
                                    <td>${list.getPrecio()}</td>
                                    <td>${list.getCantidad()}</td>
                                    <td>${list.getSubtota()}</td>
                                    <td class="d-flex">
                                        <a href="#" class="btn btn-warning">Editar</a>
                                        <a href="#" class="btn btn-dabger" style="margin-left: 10px">Delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="card-footer d-flex">
                        <div class="col-sm-6">
                            <a href="Controlador?menu=NuevaVenta&accion=GenerarVenta" class="btn btn=success"> Generar Venta </a>
                            elimina la siguiente linea de codigo:)
                            <input type="submit" name="accion" value="Generar Venta" class="btn btn-success">
                            <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                        </div>
                        <div class="col-sm-4 ml-auto">
                            <input type="text" name="txtTotal" value="${totalPagar}" class="form-control">
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJTY+OihnS6GJp33HXOn9+fWRGRpjtAjaMsMbt70W9Qy/t4Wc"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy1DpISqV2ZZJGbJRVg5ccGRqfqsfVf5w0fkIqx"
        crossorigin="anonymous"></script>

    </body>

        </html>