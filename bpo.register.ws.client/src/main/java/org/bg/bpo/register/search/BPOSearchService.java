package org.bg.bpo.register.search;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2015-06-22T12:34:59.868+03:00
 * Generated source version: 2.7.16
 * 
 */
@WebServiceClient(name = "BPOSearchService", 
                  wsdlLocation = "file:/C:/Users/Георги/git/DuoSoft_WS/bpo.register.ws.client/src/main/resources/bpo-register-search.wsdl",
                  targetNamespace = "http://bg.org/bpo/register/search/") 
public class BPOSearchService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://bg.org/bpo/register/search/", "BPOSearchService");
    public final static QName BPOSearchServiceDefaultPort = new QName("http://bg.org/bpo/register/search/", "BPOSearchServiceDefaultPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/bpo.register.ws.provider/services/BPOSearchServiceDefaultPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BPOSearchService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Георги/git/DuoSoft_WS/bpo.register.ws.client/src/main/resources/bpo-register-search.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BPOSearchService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BPOSearchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BPOSearchService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BPOSearchService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BPOSearchService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BPOSearchService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BPORegisterSearch
     */
    @WebEndpoint(name = "BPOSearchServiceDefaultPort")
    public BPORegisterSearch getBPOSearchServiceDefaultPort() {
        return super.getPort(BPOSearchServiceDefaultPort, BPORegisterSearch.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPORegisterSearch
     */
    @WebEndpoint(name = "BPOSearchServiceDefaultPort")
    public BPORegisterSearch getBPOSearchServiceDefaultPort(WebServiceFeature... features) {
        return super.getPort(BPOSearchServiceDefaultPort, BPORegisterSearch.class, features);
    }

}
