/**
 * HorarioMedico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sanpedro.model.xsd;

public class HorarioMedico  implements java.io.Serializable {
    private java.lang.String descripcion;

    private java.lang.String fecha_fin;

    private java.lang.String fecha_ini;

    private java.lang.String hora_fin;

    private java.lang.String hora_ini;

    private java.lang.String turno;

    public HorarioMedico() {
    }

    public HorarioMedico(
           java.lang.String descripcion,
           java.lang.String fecha_fin,
           java.lang.String fecha_ini,
           java.lang.String hora_fin,
           java.lang.String hora_ini,
           java.lang.String turno) {
           this.descripcion = descripcion;
           this.fecha_fin = fecha_fin;
           this.fecha_ini = fecha_ini;
           this.hora_fin = hora_fin;
           this.hora_ini = hora_ini;
           this.turno = turno;
    }


    /**
     * Gets the descripcion value for this HorarioMedico.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this HorarioMedico.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the fecha_fin value for this HorarioMedico.
     * 
     * @return fecha_fin
     */
    public java.lang.String getFecha_fin() {
        return fecha_fin;
    }


    /**
     * Sets the fecha_fin value for this HorarioMedico.
     * 
     * @param fecha_fin
     */
    public void setFecha_fin(java.lang.String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }


    /**
     * Gets the fecha_ini value for this HorarioMedico.
     * 
     * @return fecha_ini
     */
    public java.lang.String getFecha_ini() {
        return fecha_ini;
    }


    /**
     * Sets the fecha_ini value for this HorarioMedico.
     * 
     * @param fecha_ini
     */
    public void setFecha_ini(java.lang.String fecha_ini) {
        this.fecha_ini = fecha_ini;
    }


    /**
     * Gets the hora_fin value for this HorarioMedico.
     * 
     * @return hora_fin
     */
    public java.lang.String getHora_fin() {
        return hora_fin;
    }


    /**
     * Sets the hora_fin value for this HorarioMedico.
     * 
     * @param hora_fin
     */
    public void setHora_fin(java.lang.String hora_fin) {
        this.hora_fin = hora_fin;
    }


    /**
     * Gets the hora_ini value for this HorarioMedico.
     * 
     * @return hora_ini
     */
    public java.lang.String getHora_ini() {
        return hora_ini;
    }


    /**
     * Sets the hora_ini value for this HorarioMedico.
     * 
     * @param hora_ini
     */
    public void setHora_ini(java.lang.String hora_ini) {
        this.hora_ini = hora_ini;
    }


    /**
     * Gets the turno value for this HorarioMedico.
     * 
     * @return turno
     */
    public java.lang.String getTurno() {
        return turno;
    }


    /**
     * Sets the turno value for this HorarioMedico.
     * 
     * @param turno
     */
    public void setTurno(java.lang.String turno) {
        this.turno = turno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HorarioMedico)) return false;
        HorarioMedico other = (HorarioMedico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.fecha_fin==null && other.getFecha_fin()==null) || 
             (this.fecha_fin!=null &&
              this.fecha_fin.equals(other.getFecha_fin()))) &&
            ((this.fecha_ini==null && other.getFecha_ini()==null) || 
             (this.fecha_ini!=null &&
              this.fecha_ini.equals(other.getFecha_ini()))) &&
            ((this.hora_fin==null && other.getHora_fin()==null) || 
             (this.hora_fin!=null &&
              this.hora_fin.equals(other.getHora_fin()))) &&
            ((this.hora_ini==null && other.getHora_ini()==null) || 
             (this.hora_ini!=null &&
              this.hora_ini.equals(other.getHora_ini()))) &&
            ((this.turno==null && other.getTurno()==null) || 
             (this.turno!=null &&
              this.turno.equals(other.getTurno())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getFecha_fin() != null) {
            _hashCode += getFecha_fin().hashCode();
        }
        if (getFecha_ini() != null) {
            _hashCode += getFecha_ini().hashCode();
        }
        if (getHora_fin() != null) {
            _hashCode += getHora_fin().hashCode();
        }
        if (getHora_ini() != null) {
            _hashCode += getHora_ini().hashCode();
        }
        if (getTurno() != null) {
            _hashCode += getTurno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HorarioMedico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.sanpedro.com/xsd", "horarioMedico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.sanpedro.com/xsd", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_fin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.sanpedro.com/xsd", "fecha_fin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_ini");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.sanpedro.com/xsd", "fecha_ini"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hora_fin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.sanpedro.com/xsd", "hora_fin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hora_ini");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.sanpedro.com/xsd", "hora_ini"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.sanpedro.com/xsd", "turno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
