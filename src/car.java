
public class car implements Comparable<car> {

    private String numberPlate;  // kort tekst om begivenheden

    // 1. Constructor – bruges til at oprette en ny historisk begivenhed
    public car ( String numberPlate) {
        this.numberPlate= numberPlate;
    }

    // 2. Getters (kun til at læse værdier)
    public String getnumberPlate() {
        return numberPlate;
    }

    // 3. compareTo-metoden
    // Teori: Når en klasse implementerer Comparable, kan objekter af den
    // klasse sammenlignes med hinanden. Collections.sort() bruger compareTo().
    // Vi vælger her at sammenligne på årstallet.
    @Override
    public int compareTo(car o) {
        // Stigende sortering (ældste først)
        return this.numberPlate.compareTo(o.numberPlate);

        // Hvis du vil have det i faldende rækkefølge (nyeste først):
        // return Integer.compare(o.year, this.year);
    }

    // 4. toString-metoden
    // Teori: Når vi printer et objekt, kalder Java automatisk toString().
    // Her definerer vi selv hvordan objektet vises.
    @Override
    public String toString() {
        return numberPlate + ": ";
    }

}
