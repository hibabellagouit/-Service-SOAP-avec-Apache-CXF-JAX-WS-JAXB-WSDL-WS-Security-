package com.acme.cxf;

import com.acme.cxf.impl.HelloServiceImpl;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Classe principale pour démarrer le serveur de services web SOAP.
 * Ce serveur utilise Apache CXF pour exposer les services web définis dans HelloServiceImpl.
 */
public class Server {
    
    /**
     * Point d'entrée principal de l'application serveur.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        // URL à laquelle le service sera publié
        String address = "http://localhost:8083/services/hello";
        
        // Création d'une fabrique de serveur JAX-WS
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        
        // Configuration de la fabrique
        factory.setServiceClass(HelloServiceImpl.class);  // Classe d'implémentation du service
        factory.setAddress(address);                     // URL du point de terminaison
        
        // Création et démarrage du serveur
        factory.create();
        
        // Alternative utilisant l'API standard JAX-WS (commentée)
        // Endpoint.publish(address, new HelloServiceImpl());
        
        // Affichage de l'URL WSDL pour référence
        System.out.println("Service web démarré avec succès!");
        System.out.println("WSDL disponible à l'adresse : " + address + "?wsdl");
        System.out.println("Appuyez sur Ctrl+C pour arrêter le serveur...");
    }
}