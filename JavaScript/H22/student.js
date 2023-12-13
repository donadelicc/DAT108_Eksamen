
class Studentarkiv{

    #arkiv = new Array();
    #arkiv2 = new Set();
    #arkiv3 = new Map();
    
    constructor(id, etternavn, fornavn, tlf) {
        this.id = id;
        this.etternavn = etternavn;
        this.fornavn = fornavn;
        this.tlf = tlf;
    }

    nystudent(student) {
        const {id, etternavn, fornavn, tlf} = student;
        if(this.#arkiv3.has(id)) {
            return null;
        } else {

        }
        this.#arkiv3.set(id, {etternavn, fornavn, tlf});

        //this.#arkiv.push(student)
        //this.#arkiv2.add(student)
    }

    eksporterdata() {
        //console.log(this.#arkiv)
        //console.log(this.#arkiv2)
        console.log(this.#arkiv3)
    }

}


const arkiv = new Studentarkiv();
const ole = arkiv.nystudent({
    id: 101,
    etternavn: "Olsen",
    fornavn: "Ole",
    tlf: ["112 23 344", "323 22 323"]
    });

// console.log(ole)

const anne = arkiv.nystudent({ 
    id:106,
    etternavn:"Annesen",
    fornavn: "Anne" }
);

//const oletelefon = arkiv.hartelefon(101, "112 23 344");
//const annetelefon = arkiv.hartelefon(106, "767 44 333");
const arkivdata = arkiv.eksporterdata()