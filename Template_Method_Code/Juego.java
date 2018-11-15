public abstract class Juego{
    //Atributos que varian según las clases hijas que sean instanciadas a partir de esta clase
    private String nombre;
    private int piezas;
    private int dados;
    private int numero_jugadores;
    private int[] puntajes;
    //Métodos abstractos que definen el comportambiento de cualquier juego, son los métodos básicos de cada juego
    abstract void iniciar_Juego();
    abstract void turno_Jugador();
    abstract boolean terminado_Juego();
    abstract void tabla_final();

    //Método plantilla el cual aplica en todas las sub-clases, sin embargo, el comportambiento varia segun el tipo de juego
    public final void jugar_Juego(int numero_jugadores){
        //Definimos el número de jugadores
        this.numero_jugadores = numero_jugadores;
        //Iniciamos el juego
        iniciar_Juego();
        //Jugamos hasta que sea hora de terminar el juego
        int turno = 0;
        while (!terminado_Juego()) {
            turno_Jugador(turno);
            turno++;
        }
        //imprimimos la tabla final
        tabla_final();
    }
}