package lucha;

import java.util.Random;

public class Jugador {
    public String nombre;
    public int vidas;
    public int ataque;
    public int defensa;
    
    private int ataques;
    private int defensas;
    private int resultado;
    //Constructores
    public Jugador() {
    }

    public Jugador(String nombre, int vidas, int ataque, int defensa) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaques() {
        return ataques;
    }

    public void setAtaques(int ataques) {
        this.ataques = ataques;
    }

    public int getDefensas() {
        return defensas;
    }

    public void setDefensas(int defensas) {
        this.defensas = defensas;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    //Métodos
    public void atacar(Jugador jugadorAtaca, Jugador jugadorDefiende){
        int respuesta=0;
        Random rnd=new Random();
        int ataqueTurno=Math.round(rnd.nextInt(jugadorAtaca.ataque/2));
        int defensaTurno=Math.round(rnd.nextInt(jugadorDefiende.defensa/2));
        if(ataqueTurno>=defensaTurno){
            respuesta=(ataqueTurno-defensaTurno);
            jugadorDefiende.vidas-=respuesta;
        }
        if(defensaTurno>ataqueTurno){
            respuesta=((defensaTurno-ataqueTurno)/2);
            jugadorAtaca.vidas-=respuesta;
        }
        setAtaques(ataqueTurno);
        setDefensas(defensaTurno);
        setResultado(respuesta);
    }
    
}
