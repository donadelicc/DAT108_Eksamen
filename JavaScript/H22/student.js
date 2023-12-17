
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
        if(!this.gyldigStudent(student)) {
            return null;
        }
        const {id, etternavn, fornavn, tlf} = student;
        if(this.#arkiv3.has(id)) {
            return false;
        } else {
            this.#arkiv3.set(id, {etternavn, fornavn, tlf});
            return true;
        }

        //this.#arkiv.push(student)
        //this.#arkiv2.add(student)
    }

    gyldigStudent(student) {
        return this.gyldigId(student.id) &&
                this.gyldigStreng(student.etternavn) &&
                this.gyldigStreng(student.fornavn) &&
                this.gyldigTelefonListe(student.tlf);
    }
    gyldigId(id) {
        return typeof id === 'number' && !isNaN(id);
    }
    gyldigStreng(str) {
        return typeof str === 'string' && str.trim().length > 0;
    }
    gyldigTelefonListe(tlf) {
        if ( typeof tlf === 'undefined') {
            return true;
        }
        if(!Array.isArray(tlf)) {
            return false;
        }
        return tlf.every(nummer => /^[0-9 ]+$/.test(nummer));
    }
    tømArkiv() {
        if(this.#arkiv3.size > 0) {
            this.#arkiv3.clear();
            console.log("Arkivet er tømt");
        } else {
            console.log("Arkivet var allerede tomt");
        }

    }

    hartelefon(id, tlf) {
        if(this.#arkiv3.has(id)) {
            const student = this.#arkiv3.get(id);
            return student.tlf && student.tlf.includes(tlf);
            }
        return false;
    }

    nytelefon(id, nummer) {
        if(!this.#arkiv3.has(id)) {
            return null;
        }
        if(this.hartelefon(id, nummer)) {
            return false;
        } else {
            const student = this.#arkiv3.get(id);
            if(!student.tlf) {
                student.tlf = [];
            }
            student.tlf.push(nummer);
            this.#arkiv3.set(id, student);
            return true;
        }
        

    }

    eksporterdata() {
        if(this.#arkiv3.size > 0) {
            this.#arkiv3.forEach((student, id) => {
                console.log(id+';'+student.etternavn+';'+student.fornavn+';'+student.tlf.join(';'));
            }
            )
        } else {
            console.log("Arkivet er tomt.");
        }
    }

}




const arkiv = new Studentarkiv();

//arkiv.tømArkiv();

const ole = arkiv.nystudent({
    id: 101,
    etternavn: "Olsen",
    fornavn: "Ole",
    tlf: ["112 23 344", "323 22 323"]
    });
console.log(`Ble Ole lagt til: ${ole}`)
// arkiv.tømArkiv();

const anne = arkiv.nystudent({ 
    id:106,
    etternavn:"Annesen",
    fornavn: "Anne" 
});
console.log(`Ble Anne lagt til: ${anne}`)

const oletelefon = arkiv.hartelefon(101, "112 23 344");
console.log(`Ole har telefonnummeret: ${oletelefon}`)
const annetelefon = arkiv.hartelefon(106, "767 44 333");
console.log(`Anne har telefonnummeret: ${annetelefon}`)

const oleNyTelefon = arkiv.nytelefon(101, "112 23 344");
console.log(`Legge til ny tlf for Ole: ${oleNyTelefon}`)
const anneNyTelefon = arkiv.nytelefon(106, "999 99 999");
console.log(`Legge til ny tlf for Anne: ${anneNyTelefon}`)

console.log("---------------------------------\nARKIVDATA:\n---------------------------------")
const arkivdata = arkiv.eksporterdata()


const test = arkiv.test({
    id: 101,
    etternavn: "Olsen",
    fornavn: "Ole",
    tlf: ["112 23 344", "323 22 323"]
    });

