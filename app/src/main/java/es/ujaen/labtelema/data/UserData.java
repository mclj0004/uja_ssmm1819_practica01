package es.ujaen.labtelema.data;

public class UserData {
    String userName="";
    String password="";
    String domain="";
    short port=0;

    /**
     * Constructor por defecto
     */

    public UserData(){
        userName="user";
        password="123456";
        domain="labtelema.ujaen.es";
        port=80;
    }

    /**
     * Constructor con parámetros
     * @param userName Nombre de usuario
     * @param password clave
     * @param domain dominio o ip del servidor
     * @param port puerto del servidor
     */

    public UserData(String userName, String password, String domain, short port) {

        this.userName = userName;
        this.password = password;
        this.domain = domain;
        this.port = port;
    }
}
