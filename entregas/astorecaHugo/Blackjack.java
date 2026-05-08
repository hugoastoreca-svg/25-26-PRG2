
class Blackjack {

    private Baraja baraja;
    private Mano mano;
    private Console console;

    public Blackjack() {

        baraja = new Baraja();
        mano = new Mano();
        console = new Console();

    }
    private void jugar(){
        boolean estaJugando = true;
        do { 
            mano.mostrar();
            menu.mostrar();
            switch(console.readInt("Elije una opción")){
                case 1 -> pedir();
                case 2 -> reinciarPartida();
                case 3 -> salir();

            }
        } while (estaJugando);

    }

    public static void main(String[] args) {
        new Blackjack().jugar();

    }
}
