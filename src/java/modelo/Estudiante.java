package modelo;

public class Estudiante {
    int code;
    String nom;
    String email;


    public Estudiante(){

    }

    public Estudiante(int code, String nom, String email){
    this.code = code;
    this.nom = nom;
    this.email = email;
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    
}
