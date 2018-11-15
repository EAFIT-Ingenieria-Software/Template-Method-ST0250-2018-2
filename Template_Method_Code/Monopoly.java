class Monopoly extends Juego {

    //Clase que hereda de la clase plantilla, por lo cual hereda los métodos básicos de cualquier juego y posee a su vez propios
    void iniciar_Juego() {
        // Iniciar Juego de Monopolio
        System.out.println("Juego de Monopolio Iniciado");
    }
    void turno_Jugador(int jugador) {
        // Turno del jugador del momento
        System.out.println("Estamos en el turno de: "+jugador);
    }
    boolean terminado_Juego() {
        // Indica cuando el juego se acaba
        return true;
    }
    void tabla_final() {
        // Display de la tabla final de los resultados
        for (int i=i<numero_jugadores;i++){
            System.out.println("Jugador: "+i+" tiene un puntaje de: "+puntajes[i]);
        }
    }
    //Metodos propios del monopolio

    void carcel(int jugador){
        System.out.println("El jugador: "+jugador+" irá a la carcel");
    }

    void casilla_deSalida(int jugador){
        System.out.println("El jugador: "+jugador+" recibe 200$ por pasar por la casilla de Salida");
    }
}
