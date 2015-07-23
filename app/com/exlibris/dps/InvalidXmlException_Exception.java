
package com.exlibris.dps;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidXmlException", targetNamespace = "http://dps.exlibris.com/")
public class InvalidXmlException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidXmlException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidXmlException_Exception(String message, InvalidXmlException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidXmlException_Exception(String message, InvalidXmlException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.exlibris.dps.InvalidXmlException
     */
    public InvalidXmlException getFaultInfo() {
        return faultInfo;
    }

}
