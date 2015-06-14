package Hibernate;

import javax.persistence.*;

/**
 * Created by xavivaio on 14/06/2015.
 */
@Entity
@IdClass(CasellaPK.class)
public class Casella {
    private int idpartida;
    private int numerofila;
    private int numerocol;
    private Integer numero;
    private Partida partidaByIdpartida;

    @Id
    @Column(name = "idpartida")
    public int getIdpartida() {
        return idpartida;
    }

    public void setIdpartida(int idpartida) {
        this.idpartida = idpartida;
    }

    @Id
    @Column(name = "numerofila")
    public int getNumerofila() {
        return numerofila;
    }

    public void setNumerofila(int numerofila) {
        this.numerofila = numerofila;
    }

    @Id
    @Column(name = "numerocol")
    public int getNumerocol() {
        return numerocol;
    }

    public void setNumerocol(int numerocol) {
        this.numerocol = numerocol;
    }

    @Basic
    @Column(name = "numero")
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Casella casella = (Casella) o;

        if (idpartida != casella.idpartida) return false;
        if (numerofila != casella.numerofila) return false;
        if (numerocol != casella.numerocol) return false;
        if (numero != null ? !numero.equals(casella.numero) : casella.numero != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpartida;
        result = 31 * result + numerofila;
        result = 31 * result + numerocol;
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idpartida", referencedColumnName = "idpartida", nullable = false)
    public Partida getPartidaByIdpartida() {
        return partidaByIdpartida;
    }

    public void setPartidaByIdpartida(Partida partidaByIdpartida) {
        this.partidaByIdpartida = partidaByIdpartida;
    }
}
