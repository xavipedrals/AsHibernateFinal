package Hibernate;

import javax.persistence.*;

/**
 * Created by xavivaio on 14/06/2015.
 */
@Entity
public class Jugador {
    private String username;
    private String email;
    private Integer millorpuntuacio;
    private Usuariregistrat usuariregistratByUsername;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "millorpuntuacio")
    public Integer getMillorpuntuacio() {
        return millorpuntuacio;
    }

    public void setMillorpuntuacio(Integer millorpuntuacio) {
        this.millorpuntuacio = millorpuntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        if (username != null ? !username.equals(jugador.username) : jugador.username != null) return false;
        if (email != null ? !email.equals(jugador.email) : jugador.email != null) return false;
        if (millorpuntuacio != null ? !millorpuntuacio.equals(jugador.millorpuntuacio) : jugador.millorpuntuacio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (millorpuntuacio != null ? millorpuntuacio.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false)
    public Usuariregistrat getUsuariregistratByUsername() {
        return usuariregistratByUsername;
    }

    public void setUsuariregistratByUsername(Usuariregistrat usuariregistratByUsername) {
        this.usuariregistratByUsername = usuariregistratByUsername;
    }


}
