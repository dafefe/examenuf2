
/**
 *
 * @author David
 */
public class Jam {

    /**
     * Variables privades inicials
     */
    private String contents;
    private String date;
    private int capacity;
    private static int numTotalJars, noJam = 0;

    /**
     * Constructor 
     * 
     * @param contents
     * @param date
     * @param size 
     */
    Jam(String contents, String date, int size) {
        this.contents = contents;
        this.date = date;
        capacity = size;
        numTotalJars++;
    }

    /**
     *
     * @see Jam
     * Retorna true si capacity es 0
     * @return capacity
     */
    public boolean empty() {
        return (capacity == 0);
    }

    /**
     * Imprimeix per pantalla els resultats
     */
    public void print() {
        System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
        System.out.println("El número total de Jars creats des de l'inici dels temps són: " + Jam.getNumTotalJars());
        System.out.println("El número de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
    }

    /**
     *
     * Si no esta buit mostra la quantitat de fluidsOz si es menor que la capacity, sinó mostra la capacity
     * Si esta buit mostres un missatge informatiu
     * @param fluidOz
     */
    public void spread(int fluidOz) {
        if (!empty()) {
            if (fluidOz < capacity) {
                System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
                capacity = capacity - fluidOz;
            } else {
                System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
                capacity = 0;
                noJam++;
            }
        } else {
            System.out.println("No jam in the Jar!");
        }
    }

    /**
     *
     * @see Jam
     * retorna numTotalJars
     * @return
     */
    public static int getNumTotalJars() {
        return numTotalJars;
    }

    /**
     *
     * @see Jam
     * retorna la variable noJam 
     * @return
     */
    public static int getNoJam() {
        return noJam;
    }
}
