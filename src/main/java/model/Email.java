package model;

public class Email {
private String email;
private boolean estado;

    public Email(String email, boolean estado) {
        this.email = email;
        this.estado = estado;
    }

    public Email() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
