package br.com.getnet.entity;

public class ClientHttp {

    public ClientHttp(){

    }

    public String urlAPI(){
        String baseURL = ": https://reqres.in/api/";
        return baseURL;
    }

    public String urlPost (){
        String createUsers = "/users";
        return createUsers;
    }
}
