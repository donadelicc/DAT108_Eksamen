package H22;

public class O5 {

    // Applikasjon for å holde orden på ansatte i en bedrift
    // Applikasjonen skal...
    // 1. Få se en oversikt over alle ansatte
    // 2. Registrere en ny ansatt. Denne funksjonen krever at man er 'innlogget som admin'.

    // Ansatt-db
    // id, fornavn, etternavn, stilling, mndlønn

    // Adminpassordet er oppgitt som app.adminPassord i application.properties

    // admin blir logget ut automatisk etter et antall
    // sekunder med inaktivitet, oppgitt i app.adminTimeout i application.properties
    

    //  Forslag til URL-er, Controllere og Views:
    //  /ansattliste, /nyansatt og /innlogging
    //  Én controller for henting av ansattlisten
    //  Én controller for henting av registreringsskjema og for registrering / lagring av nyansatt
    //  Én controller for admininnlogging
    //  ansattliste.jsp, nyansattskjema.jsp og innlogging.html (den siste kan være statisk)

    // a) Skriv controlleren for henting av ansattlisten

    @PostMapping("/ansattliste")
    public String hentAnsastte() {
        
    }

    // Gjorde den i Eclipse...


}
