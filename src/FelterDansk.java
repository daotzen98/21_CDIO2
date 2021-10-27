public class FelterDansk {

    public static String tower() {
        return "Du går ind i et gammelt tårn og finder 250 guldmønter, din balance er nu: " + Konto.getSaldo();
    }

    public static String crater() {
        return "Du falder ned i et crater og mister 100 guldmønter, din balance er nu: " + Konto.getSaldo();
    }

    public static String palace_gates() {
        return "Du finder 100 guldmønter udenfor portene til et palads, din balance er nu: " + Konto.getSaldo();
    }

    public static String cold_desert() {
        return "Du farer vild i en kold ørken og mister 20 guldmønter, din balance er nu: " + Konto.getSaldo();
    }

    public static String walled_city() {
        return "Du finder 180 guldmønter uden for en befæstet by, din balance er nu: " + Konto.getSaldo();
    }

    public static String monastery() {
        return "Du går ind i et kloster, men finder ikke nogle guldmønter, din balance er stadig: " + Konto.getSaldo();
    }

    public static String black_cave() {
        return "Du farer vild i en mørk grotte og mister 70 guldmønter, din balance er nu: " + Konto.getSaldo();
    }

    public static String huts_in_the_mountain() {
        return "Du finder nogle hytter i bjergene og finder 60 guldmønter i en af dem, din balance er nu: " + Konto.getSaldo();
    }

    public static String the_werewall() {
        return "På din rejse møder du en masse varulve, du skynder dig at løbe væk og taber 80 guldmønter ud af din lomme, men du får en ekstra tur, din balance er nu: " + Konto.getSaldo();
    }

    public static String the_pit() {
        return "Du falder ned i et dybt hul og er nød til at betale en mand 50 guldmønter for at hjælpe dig op, din balance er nu: " + Konto.getSaldo();
    }

    public static String goldmine() {
        return "Du går ind i en guldmine og finder 650 guldmønter, din balance er nu: " + Konto.getSaldo();
    }
}
