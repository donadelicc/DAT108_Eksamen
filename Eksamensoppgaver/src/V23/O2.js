
// a)

// JavaScript og «strict mode».

// i. Hva er konsekvensene av «strict mode» i JavaScript?

// - JavaScript mijøet blir mye strengere. Det vil si at enkelt feil blir lettere å oppdage og koden blir generelt sett sikrere og renere. 

// ii. Hvordan kan vi instruere JavaScript-motoren til å benytte «strict mode»?

// - Alt vi trenger å gjøre er å skrive "use strict" øverst i js-filen 

// iii. JavaScript-motoren vil kunne benytte «strict mode» uten at det er angitt i koden. Gi et
// eksempel.
// For ES6 Klasser og Moduler
// - All kode innenfor en egendefinert klasse vil være underlagt reglene i "strict-mode".

class Navn {
    constructor() {
        this.navn = "Preben"
    }
    nyttNavn(nyttNavn) {
        this.navn = nyttNavn
    }
}

// - ALl kode innefor en eksporter

export function myFunction() { };


// b)

// i)
const info = `${navn} ble født på en ${dag}`;

// Bruken av string template i denne linjen gjør at vi kan sette inn variabler med helt andre datatyper
//      inn i en streng. 
// ${navn} er en instans av en variabel som må defineres før denne linjen kjøres.
// ${dag} det er det samme med dag. Dette er en instansvariabel.

// ii)

const dag = new Date(Date.UTC(2003, 0, 12)).toLocaleDateString(navigator.language,
    {
        weekday: 'long'
    });

// Dag variabelen er en dato streng. 
// Først opprettes det en et nytt 'Date'-objekt med datoen 12.01.2003.
// Deretter konverteres datoen til brukerens lokale datoformat
//      --> 'navigator.language' henter brukerens språkinnstillinger i nettleseren
// "weekday: 'long'" gjør datoobjektet om til det lange formatet av dager.01 - Januar, 02 - Februar osv..



// c)

class Karakterer {

    #emnekode;
    #semester;
    #karakterliste = new Map()

    constructor(emnekode, semester) {
        this.emnekode = emnekode;
        this.semester = semester;
    }

    // Legger inn karakter for en student.
    addStudent(student) {
        const{id, etternavn, fornavn, karakter} = student;
        
        if (!gyldigStudent(student) && this.#karakterliste.has(id)) {
            return null;
        } else {
            this.#karakterliste.set(id, student)
            return student
        } 
    }

    gyldigStudent(student){
        gyldigKarakter = /^[A-F]$/.test(student.karakter)
        gyldigId = /^\p{Letter}\d{3}$/u
        gyldigNavn = typeof student.fornavn == 'string' && typeof student.etternavn == 'string'
        return gyldigKarakter && gyldigId && gyldigNavn
    }

    getStatistikk() {
        // Returnerer karakterstatistikk for emnet
        const karakterfordeling = {"A": 0, "B": 0, "C": 0, "D": 0, "E": 0, "F": 0}

        for (let student of this.#karakterliste.values()) {
            if(karakterfordeling.hasOwnProperty(student.karakter)) {
                karakterfordeling [student.karakter]++
            }
        }
        const statistikk = {emne: this.#emnekode, semester: this.#semester, karakterfordeling: karakterfordeling}
        return statistikk

    }

}

const karakterliste = new Karakterer("DAT108", "V2023");
karakterliste.addStudent({
    "id": "o123",
    "fornavn": "Ole",
    "etternavn": "Olsen",
    "karakter": "B"
});
karakterliste.addStudent({
    "id": "g324",
    "fornavn": "Gro",
    "etternavn": "Grosen",
    "karakter": "B"
});
const statistikk = karakterliste.getStatistikk();


// OUTPUT:

// {
//     "emne": "DAT108",
//     "semester": "V2023",
//     "karakterfordeling": {
//     "A": 0,
//     "B": 2,
//     "C": 0,
//     "D": 0,
//     "E": 0,
//     "F": 0
//     }
// }

