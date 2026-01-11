package com.acme.cxf.client;

import com.acme.cxf.api.HelloService;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import java.net.URL;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        // ✅ utilise la même URL que ton serveur publie
        URL wsdl = new URL("http://localhost:8080/services/hello-secure?wsdl");

        // ✅ vérifie le namespace (il doit correspondre à celui du HelloServiceImpl)
        QName qname = new QName("http://impl.cxf.acme.com/", "HelloServiceImplService");

        Service svc = Service.create(wsdl, qname);
        HelloService port = svc.getPort(HelloService.class);

        System.out.println(port.sayHello("ClientJava"));
        System.out.println(port.findPersonById("P-777").getName());
    }
}
