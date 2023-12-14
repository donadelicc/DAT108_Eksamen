

class Calculator {

    status;
    result;

    constructor(status, result) {
        this.status = status;
        this.result = result;
    }

    // * @public
    // * @param {String} operation - Matematikk operasjon
    // * @param {Array.<String>} numberList - Array av input-data}

    calculate(operation, numberList) {

        /* JavaScript kode for å utføre utregning */

        /** Konverterer til heltall */
        const numbers = numberList.map(value => value.trim()).filter(
            value => /^\d+$/.test(value)).map(
            number => parseInt(number, 10))

        if (numbers.length == 0) {
            this.status = 'Ingen tall i tallisten'
        } else {
            if (numbers.length == numberList.length) {
                this.status = 'Alle input-verdier ble prosessert'
            } else {
                this.status = 'Tallisten inneholder verdi(er) som ikke er tall'
            }

            switch (operation) {
                case 'sum':
                    this.result = numbers.reduce(
                        (sum, number) => sum + number
                    )
                    break
                case 'produkt':
                    this.result = numbers.reduce(
                        (product, number) => product * number
                    )
                    break
                case 'min':
                    this.result = Math.min(...numbers)
                    break
                case 'max':
                    this.result = Math.max(...numbers)
                    break
                default:
                    this.status = 'Ukjent operasjon'
            }
        }


    }



}

const calculator = new Calculator()
calculator.calculate('sum', ['1', '3', '7'])
console.log(`Svaret er: ${calculator.result}`)
//console.log(`Status for utregning: ${calculator.status}`)