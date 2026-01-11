# Service SOAP avec Apache CXF (JAX-WS, JAXB, WSDL, WS-Security)

Ce projet est une démonstration de la création d'un service web SOAP sécurisé avec Apache CXF, implémentant les spécifications JAX-WS, JAXB et WS-Security.

## 📋 Prérequis

- Java 17 ou supérieur
- Apache Maven 3.6.0 ou supérieur

## 🚀 Installation et exécution

### 1. Cloner le dépôt

```bash
git clone [URL_DU_DEPOT]
cd "Service SOAP avec Apache CXF (JAX-WS, JAXB, WSDL, WS-Security)"
```

### 2. Compiler le projet

```bash
mvn clean package
```

### 3. Démarrer le serveur

```bash
mvn exec:java -Dexec.mainClass="com.acme.cxf.Server"
```

Le serveur démarrera et sera accessible à l'adresse : [http://localhost:8083/services/hello?wsdl](http://localhost:8083/services/hello?wsdl)

## 🌐 Services disponibles

### Service: HelloService
- **Endpoint** : `http://localhost:8083/services/hello`
- **WSDL** : `http://localhost:8083/services/hello?wsdl`

#### Opérations disponibles :
1. **sayHello** - Retourne un message de salutation personnalisé
   - Paramètre : `name` (String)
   - Retour : Message de salutation (String)

2. **findPersonById** - Retourne les informations d'une personne par son ID
   - Paramètre : `id` (String)
   - Retour : Objet `Person` (id, name, age)

## 🛠️ Structure du projet

```
src/main/java/com/acme/cxf/
├── api/
│   └── HelloService.java       # Interface du service web
├── impl/
│   └── HelloServiceImpl.java   # Implémentation du service
├── model/
│   └── Person.java             # Modèle de données
├── security/
│   └── UTPasswordCallback.java # Gestionnaire d'authentification
├── Server.java                 # Point d'entrée du serveur
└── SecureServer.java           # Serveur avec sécurité WS-Security
```

## 🔒 Sécurité (WS-Security)

Le projet inclut une implémentation de base de WS-Security avec authentification par nom d'utilisateur et mot de passe.

### Démarrer le serveur sécurisé :

```bash
mvn exec:java -Dexec.mainClass="com.acme.cxf.SecureServer"
```

### Informations d'identification par défaut :
- **Nom d'utilisateur** : `admin`
- **Mot de passe** : `password`

## 📚 Documentation technique

### Technologies utilisées
- **Apache CXF** : Framework pour les services web SOAP
- **JAX-WS** : API Java pour les services web XML
- **JAXB** : Liaison XML/Java
- **WS-Security** : Extension de sécurité pour les services web
- **Maven** : Gestion des dépendances et build

### Dépendances principales
- `cxf-rt-frontend-jaxws` : Support JAX-WS
- `cxf-rt-transports-http` : Support HTTP
- `cxf-rt-ws-security` : Support WS-Security
- `jakarta.xml.bind-api` : API JAXB
- `jaxb-runtime` : Implémentation JAXB
<img width="1366" height="705" alt="SoapUI 5 9 1  11_01_2026 14_49_35" src="https://github.com/user-attachments/assets/877caf53-902c-419e-b25f-e9a0e45540aa" />

<img width="1366" height="705" alt="SoapUI 5 9 1  11_01_2026 14_49_55" src="https://github.com/user-attachments/assets/4ce31378-1f95-4e02-9819-28b741509ca4" />
