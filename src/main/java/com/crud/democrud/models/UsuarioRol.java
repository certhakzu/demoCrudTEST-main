package com.crud.democrud.models;

import javax.persistence.*;

@Entity
@Table(name = "usuariorol")
public class UsuarioRol {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idUsuario;
    private String idRol;
    private String rol;

    public UsuarioRol() {
    }

    public UsuarioRol(Long idUsuario, String idRol, String rol) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.rol = rol;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
