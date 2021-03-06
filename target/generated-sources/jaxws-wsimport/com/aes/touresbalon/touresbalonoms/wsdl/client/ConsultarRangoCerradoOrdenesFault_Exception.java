
package com.aes.touresbalon.touresbalonoms.wsdl.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "consultarRangoCerradoOrdenesFault", targetNamespace = "http://www.example.org/ServiceProxyOMS/")
public class ConsultarRangoCerradoOrdenesFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ConsultarRangoCerradoOrdenesFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ConsultarRangoCerradoOrdenesFault_Exception(String message, ConsultarRangoCerradoOrdenesFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ConsultarRangoCerradoOrdenesFault_Exception(String message, ConsultarRangoCerradoOrdenesFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.aes.touresbalon.touresbalonoms.wsdl.client.ConsultarRangoCerradoOrdenesFault
     */
    public ConsultarRangoCerradoOrdenesFault getFaultInfo() {
        return faultInfo;
    }

}
