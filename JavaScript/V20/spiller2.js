class Spiller {
    constructor(navn="", spillernavn="", email="", passord="") {
        this._navn = navn;
        this._spillernavn = spillernavn;
        this._email = email;
        this._passord = passord;
    }

    sjekkSpillerNavn() {
        const regex = /^.{4,10}$/;
        if (regex.test(this._spillernavn)) {
            document.getElementById('spillernavn').style.borderColor = 'green';
        } else {
            document.getElementById('spillernavn').style.borderColor = 'red';
        }
    }

    sjekkPassord() {
        let passordFelt = document.getElementById('passord');
        let gjentattPassordFelt = document.getElementById('gjentapass');
        if (this._passord === gjentattPassordFelt.value) {
            passordFelt.style.borderColor = 'green';
            gjentattPassordFelt.style.borderColor = 'green';
        } else {
            passordFelt.style.borderColor = 'red';
            gjentattPassordFelt.style.borderColor = 'red';
        }
    }
}

let spiller = new Spiller();

document.getElementById('spillernavn').addEventListener("input", (event) => {
    spiller.setSpillernavn(event.target.value);
    spiller.sjekkSpillerNavn();
});

document.getElementById('passord').addEventListener("input", (event) => {
    spiller.setPassord(event.target.value);
    spiller.sjekkPassord();
});

document.getElementById('gjentapass').addEventListener("input", () => {
    spiller.sjekkPassord();
});
