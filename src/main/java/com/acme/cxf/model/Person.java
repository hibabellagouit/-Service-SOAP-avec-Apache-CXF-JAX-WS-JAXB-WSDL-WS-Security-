package com.acme.cxf.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Classe représentant une personne dans le système.
 * Cette classe est annotée avec @XmlRootElement pour permettre sa sérialisation/désérialisation XML
 * lors des échanges de messages SOAP.
 */
@XmlRootElement(name = "Person")
public class Person {
    private String id;      // Identifiant unique de la personne
    private String name;    // Nom complet de la personne
    private int age;        // Âge de la personne

    /**
     * Constructeur par défaut requis par JAXB pour la sérialisation/désérialisation.
     */
    public Person() {}

    /**
     * Constructeur avec paramètres pour créer une nouvelle instance de Person.
     *
     * @param id   L'identifiant unique de la personne
     * @param name Le nom complet de la personne
     * @param age  L'âge de la personne
     */
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * @return L'identifiant unique de la personne
     */
    @XmlElement
    public String getId() { return id; }

    /**
     * Définit l'identifiant de la personne.
     *
     * @param id Le nouvel identifiant
     */
    public void setId(String id) { this.id = id; }

    /**
     * @return Le nom complet de la personne
     */
    @XmlElement
    public String getName() { return name; }

    /**
     * Définit le nom de la personne.
     *
     * @param name Le nouveau nom
     */
    public void setName(String name) { this.name = name; }

    /**
     * @return L'âge de la personne
     */
    @XmlElement
    public int getAge() { return age; }

    /**
     * Définit l'âge de la personne.
     *
     * @param age Le nouvel âge
     */
    public void setAge(int age) { this.age = age; }
}