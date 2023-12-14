class Spiller {
    #navn
    #spiller
    #email
    #passord
    constructor(navn="", spillernavn="", email="", passord="") {
        this._navn = navn
        this.spillernavn = spillernavn
        this.email = email
        this.passord = passord
    }

    getNavn() {
        return this._navn
    }
    setNavn(navn) {
        this._navn = navn
    }
    getEpost() {
        return this._epost
    }
    setEpost(epost) {
        this._epost = epost
    }
    getSpillernavn() {
        return this._spillernavn
    }
    setSpillernavn(spillernavn) {
        this._spillernavn = spillernavn
    }
    getPassord() {
        return this._passord
    }
    setPassord(passord) {
        this._passord = passord
    }

    sjekkSpillerNavn() {
        let username = document.getElementById('spillernavn')
        const regex = /^.{4,10}$/
        if(regex.test(username)) {
            username.setAttribute('style', 'border-color: green')
        } else {
            username.setAttribute('style', 'border-color: red')
        }
    }

    sjekkPassord() {
        let passord = document.getElementById('passord')
        let gjentattPassord = document.getElementById('gjentapass')
        if(passord===gjentattPassord) {
            passord.setAttribute('style', 'border-color: green')
            gjentattPassord.setAttribute('style', 'border-color: green')
        } else {
            passord.setAttribute('style', 'border-color: green')
            gjentattPassord.setAttribute('style', 'border-color: red')
        }
    }


}

let spillernavn = document.getElementById('spillernavn')
spillernavn.addEventListener("input", sjekkSpillerNavn)
let passord = document.getElementById('passord')
passord.addEventListener("input", sjekkPassord)
let gjentattPass = document.getElementById('gjentattpass')
gjentattPass.addEventListener("input", sjekkPassord)




