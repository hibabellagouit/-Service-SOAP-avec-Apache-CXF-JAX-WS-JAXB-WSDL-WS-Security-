package com.acme.cxf.api;

import com.acme.cxf.model.Person;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/**
 * Interface du service web SOAP HelloService.
 * Ce service fournit des opérations de base pour saluer un utilisateur et récupérer des informations sur une personne.
 * 
 * L'annotation @WebService indique que cette interface définit un service web SOAP.
 * Le nom du service et son espace de noms sont définis par défaut basés sur le nom du package.
 */
@WebService
public interface HelloService {

    /**
     * Saluer un utilisateur par son nom.
     *
     * @param name Le nom de l'utilisateur à saluer
     * @return Une chaîne de caractères contenant le message de salutation
     */
    @WebMethod(operationName = "SayHello")
    @WebResult(name = "greeting")
    String sayHello(@WebParam(name = "name") String name);

    /**
     * Recherche une personne par son identifiant.
     * 
     * @param id L'identifiant unique de la personne à rechercher
     * @return Un objet Person contenant les informations de la personne trouvée
     */
    @WebMethod(operationName = "FindPerson")
    @WebResult(name = "person")
    Person findPersonById(@WebParam(name = "id") String id);
}