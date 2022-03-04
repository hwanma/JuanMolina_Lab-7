/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmolina_lab.pkg7;

/**
 *
 * @author Hwan
 */
public class equipo {
    
    private String nombre;
    private int partidosJugados, ganados, empatados, golesFavor, golesContra, golesDiferencia, puntos;
   
    public equipo() {
    }

    public equipo(String nombre, int partidosJugados, int ganados, int empatados, int golesFavor, int golesContra, int golesDiferencia, int puntos) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.ganados = ganados;
        this.empatados = empatados;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.golesDiferencia = golesDiferencia;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getGolesDiferencia() {
        return golesDiferencia;
    }

    public void setGolesDiferencia() {
        this.golesDiferencia = golesFavor - golesContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "equipo{" + "nombre=" + nombre + ", partidosJugados=" + partidosJugados + ", ganados=" + ganados + ", empatados=" + empatados + ", golesFavor=" + golesFavor + ", golesContra=" + golesContra + ", golesDiferencia=" + golesDiferencia + ", puntos=" + puntos + '}';
    }
    
}
