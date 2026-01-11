package com.acme.cxf.impl;

import com.acme.cxf.api.HelloService;
import com.acme.cxf.model.Person;
import jakarta.jws.WebService;

/**
 * Implémentation du service web HelloService.
 * Cette classe fournit les implémentations concrètes des opérations définies dans l'interface HelloService.
 * 
 * L'annotation @WebService indique que cette classe implémente un service web SOAP.
 * Le paramètre endpointInterface fait référence à l'interface du service.
 */
@WebService(endpointInterface = "com.acme.cxf.api.HelloService")
public class HelloServiceImpl implements HelloService {

    /**
     * Implémentation de la méthode sayHello.
     * Retourne un message de salutation personnalisé.
     * 
     * @param name Le nom de la personne à saluer
     * @return Un message de salutation personnalisé
     */
    @Override
    public String sayHello(String name) {
        // Si le nom est null, on utilise "inconnu" comme valeur par défaut
        return "Bonjour, " + (name == null ? "inconnu" : name);
    }

    /**
     * Implémentation de la méthode findPersonById.
     * Dans cette version de démonstration, retourne toujours une personne factice.
     * 
     * @param id L'identifiant de la personne à rechercher
     * @return Un objet Person contenant les informations de la personne
     */
    @Override
    public Person findPersonById(String id) {
        // Pour l'instant, on retourne une personne factice
        // Dans une application réelle, on irait chercher ces informations dans une base de données
        return new Person(id, "Ada Lovelace", 36);
    }
}