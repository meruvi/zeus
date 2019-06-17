package com.example.navigationdrawer.android.version;

import android.content.Context;
import android.util.Log;

import com.example.navigationdrawer.android.controller.PersonalController;

public class MainV7 {
    public void init(Context context) {
        Log.i("------INICIANDO V7", "----VERIFICANDO DATOS----");
        PersonalController personalController = new PersonalController(context);
        personalController.crearColumnaTabla("cod_cargo", "personal", "INTEGER");
//        SalidaVentaController s = new SalidaVentaController(context);
//        s.creandoTablaSalida();
//
//        /*tabla salida_entrega*/
//        SalidaEntregaController se = new SalidaEntregaController(context);
//        se.creandoTablaSalida();
//        se.crearColumnaTabla("cod_personal", "salida_entrega", "integer");
//        se.crearColumnaTabla("cod_estado_entregado_ultimo", "salida_entrega", "integer");
//
//        SalidaMaterialPromocionalController smat = new SalidaMaterialPromocionalController(context);
//        smat.creandoTabla();
//        SalidaMaterialPromocionalEntregaController salidaMaterialPromocionalEntregaController = new SalidaMaterialPromocionalEntregaController(context);
//        salidaMaterialPromocionalEntregaController.creandoTablaSalida();
//        CobranzaController cobranzaController = new CobranzaController(context);
//        cobranzaController.creandoTablaDetalle();
//        cobranzaController.crearColumnaTabla("monto_saldo", "cobranza_detalle", "real");
//        VisitaPersonalController visitaPersonalController = new VisitaPersonalController(context);
//        visitaPersonalController.creandoTabla();
//        MedicoController medicoController = new MedicoController(context);
//        medicoController.eliminarTablaCrearTabla("cod_medico_ubicacion", "medicos_ubicacion");
//
//        medicoController.crearColumnaTabla("cod_medico_ubicacion_zeus", "medicos_ubicacion", "integer");
//
//        LimiteCreditoClienteController limiteCreditoClienteController = new LimiteCreditoClienteController(context);
//        limiteCreditoClienteController.creandoTabla();
//
//        limiteCreditoClienteController.crearColumnaTabla("cod_linea_venta", "limite_credito_cliente", "integer");
//
//        /*TABLA desviacion_zeus EN DESUSO*/
//        /*DesviacionController desviacionController = new DesviacionController(context);
//        desviacionController.creandoTabla();*/
//
//        /*Creamos la tabla salida_entrega_detalle*/
//        SalidaEntregaDetalleController objSalidaEntregaDetalleController = new SalidaEntregaDetalleController(context);
//        objSalidaEntregaDetalleController.creandoTabla();
//
//        RuteroMaestroController ruteroMaestroController = new RuteroMaestroController(context);
//        ruteroMaestroController.creandoTabla();
//
//        PedidoController pedidoController = new PedidoController(context);
//        pedidoController.crearColumnaTabla("fecha_entrega_cliente", "pedidos", "datetime");
//        pedidoController.crearColumnaTabla("tiene_convenio", "clientes", "text");
//        pedidoController.crearColumnaTabla("cod_tipo_cliente", "clientes", "integer");
//        pedidoController.crearColumnaTabla("descuento_catalogo", "clientes", "real");
//        pedidoController.crearColumnaTabla("cod_turno_pedido", "pedidos", "integer");
//
//        CampaniaPremioController campaniaPremioController = new CampaniaPremioController(context);
//        String sqlCreateTable = "create table campania_linea(cod_campania integer,cod_linea integer)";
//        campaniaPremioController.creandoTabla("campania_linea", sqlCreateTable);
//        sqlCreateTable = "create table campania_producto(cod_campania integer,cod_presentacion integer)";
//        campaniaPremioController.creandoTabla("campania_producto", sqlCreateTable);
//
//        BoletaVisitaController boletaVisitaController = new BoletaVisitaController(context);
//        boletaVisitaController.crearTablasBoletaVisita();
//
//        OfertaController oferta = new OfertaController(context);
//        oferta.crearColumnaTabla("CANTIDAD_UNITARIA_BONIFICACION", "campanias_ofertasproductos", "integer");
//        oferta.crearColumnaTabla("CANTIDAD_MINIMA_BLISTER", "presentaciones_producto", "integer");
//        oferta.crearColumnaTabla("codigo_muestra", "boleta_visita_detalle_muestra", "text");
//
//        MuestraController muestraController = new MuestraController(context);
//        muestraController.crearTablaMuestra();
//
//        VisitaMedicoController visitaMedicoController = new VisitaMedicoController(context);
//        visitaMedicoController.crearTabla();
//        DaoVentasCliente daoVentasCliente = new DaoVentasCliente(context);
//        daoVentasCliente.creandoTabla();
//
//        PoliticaPreciosController ppc = new PoliticaPreciosController(context);
//        ppc.crearTablaPoliticaPrecios();
//
//        /* Creamos la tabla com_grupo_fidelidad*/
//        ComGrupoFidelidadController cgf = new ComGrupoFidelidadController(context);
//        cgf.crearTablaComGrupoFidelidad();
//
//        /* Creamos la tabla pedido_grupo_fidelidad*/
//        PedidoGrupoFidelidadController pgf = new PedidoGrupoFidelidadController(context);
//        pgf.crearTablaPedidoGrupoFidelidad();


    }
}
