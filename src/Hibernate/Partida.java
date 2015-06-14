package Hibernate;

import javax.persistence.*;

/**
 * Created by xavivaio on 14/06/2015.
 */
@Entity
public class Partida {
    private int idpartida;
    private Boolean estaacabada;
    private Boolean estaguanyada;
    private Integer puntuacio;
    private Jugador jugadorByUsername;

    @Id
    @Column(name = "idpartida")
    public int getIdpartida() {
        return idpartida;
    }

    public void setIdpartida(int idpartida) {
        this.idpartida = idpartida;
    }

    @Basic
    @Column(name = "estaacabada")
    public Boolean getEstaacabada() {
        return estaacabada;
    }

    public void setEstaacabada(Boolean estaacabada) {
        this.estaacabada = estaacabada;
    }

    @Basic
    @Column(name = "estaguanyada")
    public Boolean getEstaguanyada() {
        return estaguanyada;
    }

    public void setEstaguanyada(Boolean estaguanyada) {
        this.estaguanyada = estaguanyada;
    }

    @Basic
    @Column(name = "puntuacio")
    public Integer getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(Integer puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partida partida = (Partida) o;

        if (idpartida != partida.idpartida) return false;
        if (estaacabada != null ? !estaacabada.equals(partida.estaacabada) : partida.estaacabada != null) return false;
        if (estaguanyada != null ? !estaguanyada.equals(partida.estaguanyada) : partida.estaguanyada != null)
            return false;
        if (puntuacio != null ? !puntuacio.equals(partida.puntuacio) : partida.puntuacio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpartida;
        result = 31 * result + (estaacabada != null ? estaacabada.hashCode() : 0);
        result = 31 * result + (estaguanyada != null ? estaguanyada.hashCode() : 0);
        result = 31 * result + (puntuacio != null ? puntuacio.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false)
    public Jugador getJugadorByUsername() {
        return jugadorByUsername;
    }

    public void setJugadorByUsername(Jugador jugadorByUsername) {
        this.jugadorByUsername = jugadorByUsername;
    }
}
