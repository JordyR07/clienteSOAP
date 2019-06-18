package com.sanpedro.servicio;

public class ServicioHorarioMedicoPortTypeProxy implements com.sanpedro.servicio.ServicioHorarioMedicoPortType {
  private String _endpoint = null;
  private com.sanpedro.servicio.ServicioHorarioMedicoPortType servicioHorarioMedicoPortType = null;
  
  public ServicioHorarioMedicoPortTypeProxy() {
    _initServicioHorarioMedicoPortTypeProxy();
  }
  
  public ServicioHorarioMedicoPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioHorarioMedicoPortTypeProxy();
  }
  
  private void _initServicioHorarioMedicoPortTypeProxy() {
    try {
      servicioHorarioMedicoPortType = (new com.sanpedro.servicio.ServicioHorarioMedicoLocator()).getservicioHorarioMedicoHttpSoap11Endpoint();
      if (servicioHorarioMedicoPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioHorarioMedicoPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioHorarioMedicoPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioHorarioMedicoPortType != null)
      ((javax.xml.rpc.Stub)servicioHorarioMedicoPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sanpedro.servicio.ServicioHorarioMedicoPortType getServicioHorarioMedicoPortType() {
    if (servicioHorarioMedicoPortType == null)
      _initServicioHorarioMedicoPortTypeProxy();
    return servicioHorarioMedicoPortType;
  }
  
  public com.sanpedro.model.xsd.HorarioMedico[] listado(java.lang.String dni) throws java.rmi.RemoteException{
    if (servicioHorarioMedicoPortType == null)
      _initServicioHorarioMedicoPortTypeProxy();
    return servicioHorarioMedicoPortType.listado(dni);
  }
  
  
}