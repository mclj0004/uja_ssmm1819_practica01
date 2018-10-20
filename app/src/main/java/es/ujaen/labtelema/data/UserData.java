package es.ujaen.labtelema.data;

public class UserData {
    private String userName;
    private String password;
    private String domain;
    private short port;

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



    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public short getPort() {
        return port;
    }

    public void setPort(short port) {
        this.port = port;
    }

}
