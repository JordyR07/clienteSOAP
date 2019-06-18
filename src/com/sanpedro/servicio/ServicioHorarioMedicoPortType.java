/**
 * ServicioHorarioMedicoPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sanpedro.servicio;

public interface ServicioHorarioMedicoPortType extends java.rmi.Remote {
    public com.sanpedro.model.xsd.HorarioMedico[] listado(java.lang.String dni) throws java.rmi.RemoteException;
}
