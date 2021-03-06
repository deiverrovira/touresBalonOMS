
package com.aes.touresbalon.touresbalonoms.wsdl.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstatusOrden.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EstatusOrden">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VALIDACION"/>
 *     &lt;enumeration value="RESERVACION"/>
 *     &lt;enumeration value="CERRADA"/>
 *     &lt;enumeration value="RECHAZADA"/>
 *     &lt;enumeration value="CANCELADA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstatusOrden")
@XmlEnum
public enum EstatusOrden {

    VALIDACION,
    RESERVACION,
    CERRADA,
    RECHAZADA,
    CANCELADA;

    public String value() {
        return name();
    }

    public static EstatusOrden fromValue(String v) {
        return valueOf(v);
    }

}
