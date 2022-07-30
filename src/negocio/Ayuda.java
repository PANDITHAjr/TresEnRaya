
package negocio;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author CARLOS
 */
public class Ayuda {
    
    private static final int MAX = 1;
    private static final int MIN = 2;
    private Tablero tablero;
    private int ganador;
    private int nivel;
    private int valor;
    private Point puntoJugador;

    public Ayuda() {
        this.tablero = new Tablero(3, 3);
        this.ganador = -1;
        this.nivel = 5;
        this.valor = 0;
        this.puntoJugador = new Point();

    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int miniMax(Tablero datos, int jugador, int nivel, boolean bandera)
    {
        if (finDelJuego(datos) && jugador == MAX) {
            return funcionDeEvaluacion(datos, jugador);
        } else if (finDelJuego(datos) && jugador == MIN) {

            return funcionDeEvaluacion(datos, jugador);
        } else if (nivel == 0) {
            return funcionDeEvaluacion(datos, jugador);
        }
        if (jugador == MAX) {
            valor = Integer.MIN_VALUE;
        } else {
            valor = Integer.MAX_VALUE;
        }
        boolean sw = true;
        ArrayList<Point> listaReglas = reglasAplicables(datos);
        while (!listaReglas.isEmpty()) {
            Point p = elegirRegla(listaReglas);
            Tablero nuevoTablero = aplicarRegla(p, datos, jugador);
            int aux = valor;
            if (sw && bandera) {
                puntoJugador = p;
                sw = !sw;
            }
            if (jugador == MAX) {
                valor = mayor(valor, miniMax(nuevoTablero, MIN, nivel - 1, false));
                if (aux != valor && bandera) {
                    puntoJugador = p;
                }
            } else {
                valor = menor(valor, miniMax(nuevoTablero, MAX, nivel - 1, false));
                if (aux != valor && bandera) {
                    puntoJugador = p;
                }
            }
        }

        if (bandera) {
            datos.setElemento(puntoJugador.x, puntoJugador.y, jugador);
        }
        return valor;
    }
    public int miniMaxAyuda(Tablero datos, int jugador, int nivel, boolean bandera)
    {
        if (finDelJuego(datos) && jugador == MAX) {
            return funcionDeEvaluacion(datos, jugador);
        } else if (finDelJuego(datos) && jugador == MIN) {

            return funcionDeEvaluacion(datos, jugador);
        } else if (nivel == 0) {
            return funcionDeEvaluacion(datos, jugador);
        }
        if (jugador == MAX) {
            valor = Integer.MIN_VALUE;
        } else {
            valor = Integer.MAX_VALUE;
        }
        boolean sw = true;
        ArrayList<Point> listaReglas = reglasAplicables(datos);
        while (!listaReglas.isEmpty()) {
            Point p = elegirRegla(listaReglas);
            Tablero nuevoTablero = aplicarRegla(p, datos, jugador);
            int aux = valor;
            if (sw && bandera) {
                puntoJugador = p;
                sw = !sw;
            }
            if (jugador == MIN) {
                valor = mayor(valor, miniMax(nuevoTablero, MAX, nivel - 1, false));
                if (aux != valor && bandera) {
                    puntoJugador = p;
                }
            } else {
                valor = menor(valor, miniMax(nuevoTablero, MIN, nivel - 1, false));
                if (aux != valor && bandera) {
                    puntoJugador = p;
                }
            }
        }

        if (bandera) {
            //datos.setElemento(puntoJugador.x, puntoJugador.y, jugador);
        }
        return valor;
    }

    public void miniMax(int jugador) {
        miniMax(this.tablero, jugador, nivel, true);
    }

    public boolean finDelJuego(Tablero datos) {
        if (datos.getElemento(0, 0) != 0 && datos.getElemento(0, 0) == datos.getElemento(1, 1) && datos.getElemento(0, 0) == datos.getElemento(2, 2)) {
            return true;
        } else if (datos.getElemento(0, 2) != 0 && datos.getElemento(0, 2) == datos.getElemento(1, 1) && datos.getElemento(0, 2) == datos.getElemento(2, 0)) {

            return true;
        }
        for (int i = 0; i < datos.getFil(); i++) {
            if (datos.getElemento(i, 0) != 0 && datos.getElemento(i, 0) == datos.getElemento(i, 1) && datos.getElemento(i, 1) == datos.getElemento(i, 2)) {

                return true;
            }
            if (datos.getElemento(0, i) != 0 && datos.getElemento(0, i) == datos.getElemento(1, i) && datos.getElemento(1, i) == datos.getElemento(2, i)) {

                return true;
            }
        }
        for (int i = 0; i < datos.getFil(); i++) {
            for (int j = 0; j < datos.getCol(); j++) {
                if (datos.getElemento(i, j) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int existeGanador() {
        if (tablero.getElemento(0, 0) != 0 && tablero.getElemento(0, 0) == tablero.getElemento(1, 1) && tablero.getElemento(0, 0) == tablero.getElemento(2, 2)) {
            ganador = tablero.getElemento(0, 0);
            return ganador;
        } else if (tablero.getElemento(0, 2) != 0 && tablero.getElemento(0, 2) == tablero.getElemento(1, 1) && tablero.getElemento(0, 2) == tablero.getElemento(2, 0)) {
            ganador = tablero.getElemento(0, 2);
            return ganador;
        }
        for (int i = 0; i < tablero.getFil(); i++) {
            if (tablero.getElemento(i, 0) != 0 && tablero.getElemento(i, 0) == tablero.getElemento(i, 1) && tablero.getElemento(i, 1) == tablero.getElemento(i, 2)) {
                ganador = tablero.getElemento(i, 0);
                return ganador;
            }
            if (tablero.getElemento(0, i) != 0 && tablero.getElemento(0, i) == tablero.getElemento(1, i) && tablero.getElemento(1, i) == tablero.getElemento(2, i)) {
                ganador = tablero.getElemento(0, i);
                return ganador;
            }
        }
        for (int i = 0; i < tablero.getFil(); i++) {
            for (int j = 0; j < tablero.getCol(); j++) {
                if (tablero.getElemento(i, j) == 0) {
                    return ganador;
                }
            }
        }
        ganador = 0;
        return ganador;
    }

    public int existeGanador(Tablero datos) {
        int elganador = -1;
        if (datos.getElemento(0, 0) != 0 && datos.getElemento(0, 0) == datos.getElemento(1, 1) && datos.getElemento(0, 0) == datos.getElemento(2, 2)) {
            elganador = datos.getElemento(0, 0);
            return elganador;
        } else if (datos.getElemento(0, 2) != 0 && datos.getElemento(0, 2) == datos.getElemento(1, 1) && datos.getElemento(0, 2) == datos.getElemento(2, 0)) {
            elganador = datos.getElemento(0, 2);
            return elganador;
        }
        for (int i = 0; i < datos.getFil(); i++) {
            if (datos.getElemento(i, 0) != 0 && datos.getElemento(i, 0) == datos.getElemento(i, 1) && datos.getElemento(i, 1) == datos.getElemento(i, 2)) {
                elganador = datos.getElemento(i, 0);
                return elganador;
            }
            if (datos.getElemento(0, i) != 0 && datos.getElemento(0, i) == datos.getElemento(1, i) && datos.getElemento(1, i) == datos.getElemento(2, i)) {
                elganador = datos.getElemento(0, i);
                return elganador;
            }
        }
        for (int i = 0; i < datos.getFil(); i++) {
            for (int j = 0; j < datos.getCol(); j++) {
                if (datos.getElemento(i, j) == 0) {
                    return elganador;
                }
            }
        }
        elganador = 0;
        return elganador;
    }

    private Tablero aplicarRegla(Point p, Tablero datos, int jug) {
        Tablero t = clonarTablero(datos);
        t.setElemento(p.x, p.y, jug);

        return t;
    }

    private int casosFavorables(Tablero datos, int jugador) {

        int contador = 0;
        int oponente = MAX;
        if (jugador == MAX) {
            oponente = MIN;
        }
        if (datos.getElemento(0, 0) != oponente && datos.getElemento(1, 1) != oponente && datos.getElemento(2, 2) != oponente) {
            contador += 1;
        }
        if (datos.getElemento(0, 2) != oponente && datos.getElemento(1, 1) != oponente && datos.getElemento(2, 0) != oponente) {
            contador += 1;
        }
        for (int i = 0; i < datos.getFil(); i++) {
            if (datos.getElemento(i, 0) != oponente && datos.getElemento(i, 1) != oponente && datos.getElemento(i, 2) != oponente) {
                contador += 1;
            }
            if (datos.getElemento(0, i) != oponente && datos.getElemento(1, i) != oponente && datos.getElemento(2, i) != oponente) {
                contador += 1;
            }
        }
        return contador;
    }

    private Tablero clonarTablero(Tablero datos) {
        Tablero t = new Tablero(datos.getFil(), datos.getCol());
        for (int i = 0; i < datos.getFil(); i++) {
            for (int j = 0; j < datos.getCol(); j++) {
                t.setElemento(i, j, datos.getElemento(i, j));
            }
        }
        return t;
    }

    private Point elegirRegla(ArrayList<Point> listaReglas) {
        return listaReglas.remove(0);
    }

    private int funcionDeEvaluacion(Tablero datos, int jugador) {
        int elGanador = existeGanador(datos);
        if (elGanador == jugador) {
            if (jugador == MAX) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }

        int max = casosFavorables(datos, MAX);
        int min = casosFavorables(datos, MIN);

        return max - min;
    }

    private int mayor(int valor, int miniMax) {
        if (valor > miniMax) {
            return valor;
        } else {
            return miniMax;
        }
    }

    private int menor(int valor, int miniMax) {
        if (valor < miniMax) {
            return valor;
        } else {
            return miniMax;
        }
    }

    private ArrayList<Point> reglasAplicables(Tablero datos) {
        ArrayList<Point> listaReglas = new ArrayList<Point>();

        for (int i = 0; i < datos.getFil(); i++) {
            for (int j = 0; j < datos.getCol(); j++) {
                if (datos.getElemento(i, j) == 0) {
                    listaReglas.add(new Point(i, j));
                }
            }
        }
        return listaReglas;
    }

    public Point getPuntoAux() {
        return puntoJugador;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public int getGanador() {
        return ganador;
    }

    public static void main(String[] args) {


        TresEnRaya juego = new TresEnRaya();
        juego.setNivel(3);
        Tablero t = juego.getTablero();
        boolean sw = true;
        while (juego.existeGanador() == -1) {
            if (sw) {
                System.out.println("turno de MAX:");
                juego.miniMax(MAX);
            } else {
                System.out.println("turno de MIN:");
                juego.miniMax(MIN);
            }
            t.mostrarTablero();
            System.out.println();
            sw = !sw;
        }

        System.out.println("El ganador es : " + juego.getGanador());

    }
    
}
