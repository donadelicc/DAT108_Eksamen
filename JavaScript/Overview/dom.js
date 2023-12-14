


// 1. Operasjoner på HTML-elementer med JavaScript

// Lese innholdet av et HTML-element
const content = document.getElementById('someElementId').innerHTML;

// Legge til nytt innhold
document.getElementById('someElementId').innerHTML = '<p>Nytt innhold</p>';

// Slette et element
const element = document.getElementById('elementToRemove');
element.parentNode.removeChild(element);

// Modifisere innholdet
document.getElementById('someElementId').innerHTML = 'Oppdatert innhold';'





// 2. Operasjoner på CSS

// Endre stil på et element
document.getElementById('someElementId').style.backgroundColor = 'blue';

// Legge til en CSS-klasse til et element
document.getElementById('someElementId').classList.add('new-class');

// Fjerne en CSS-klasse fra et element
document.getElementById('someElementId').classList.remove('existing-class');

// 3. Adressering av HTML-elementer fra JavaScript

// Finne et element ved hjelp av ID
const elementById = document.getElementById('uniqueElementId');

// Finne elementer ved hjelp av klasse
const elementsByClass = document.getElementsByClassName('someClassName');

// Finne elementer ved hjelp av tagg
const elementsByTag = document.getElementsByTagName('div');



// 4. HTML-innhold

// Arbeide med tekstinnholdet i et HTML-element
const textContent = document.getElementById('textElement').textContent;

// Få tak i og endre et attributt
const attributeValue = document.getElementById('elementId').getAttribute('data-custom');
document.getElementById('elementId').setAttribute('data-custom', 'new value');

// Navigere i HTML-trestrukturen
const parentElement = document.getElementById('childElement').parentNode;

// 5. Absolutte og relative dokument-referanser

// Absolutt referanse
const rootElement = document.getElementById('root');

// Relativ referanse
const childButton = rootElement.querySelector('button');



// 6. Lage absolutt referanse

// Absolutt referanse ved bruk av getElementById
const element2 = document.getElementById('specificElement');

// Absolutt referanse ved bruk av querySelector på document
const sameElement = document.querySelector('#specificElement');

// 7. Metoden getElementById

// Bruk av getElementById for å hente et spesifikt element
const myElement = document.getElementById('uniqueElementId');

// Sjekk om elementet eksisterer
if (myElement) {
    console.log('Elementet eksisterer');
} else {
    console.log('Elementet finnes ikke');
}

// 8. Demonstrere getElementById

<div id="root">
    <h1>Velkommen til DAT108</h1>
</div>

const rootElement2 = document.getElementById('root');
console.log(rootElement2.innerHTML); // Output: <h1>Velkommen til DAT108</h1>


// 9. Bruk av relative dokument-referanser

// Finne et child-element relatert til et annet element
const parentElement2 = document.getElementById('parent');
const childElement = parentElement2.querySelector('.childClass');

// Finne et søskenelement
const nextSibling = childElement.nextElementSibling;


// 10. Lage relative referanser

// Finne et element basert på en klasse innenfor et bestemt parent-element
const parentElement3 = document.getElementById('container');
const childOfClass = parentElement3.getElementsByClassName('childClass')[0];

// Finne et element basert på tagg
const firstButton = parentElement3.getElementsByTagName('button')[0];



// 11.  'querySelector'

// Bruk av querySelector for å finne det første elementet som matcher en CSS-selektor
const firstButton2 = document.querySelector('button');

// Finne et element med en spesifikk klasse
const specialElement = document.querySelector('.special');


// 12. 'querySelectorAll'

// Bruk av querySelectorAll for å finne alle elementer som matcher en CSS-selektor
const allButtons = document.querySelectorAll('button');

// Finne alle elementer med en spesifikk klasse
const specialElements = document.querySelectorAll('.special');


// 13. 'getElementsByTagName'

// Finne alle div-elementer i dokumentet
const divElements = document.getElementsByTagName('div');

// Finne det første button-elementet
const firstButton3 = document.getElementsByTagName('button')[0];


// 14. 'getElementsByClassName'

// Finne alle elementer med en spesifikk klasse
const classElements = document.getElementsByClassName('someClass');

// Finne det første elementet i klassen
const firstClassElement = document.getElementsByClassName('someClass')[0];


// 15. Lister av web-elementer

// Arbeide med en levende liste av elementer
const paragraphs = document.getElementsByTagName('p');
// Modifisere et av elementene vil oppdatere listen dynamisk


// 16. Elementlister i Prototype og jQuery

// jQuery eksempel for å finne alle elementer med en klasse
const elements = $('.someClass');
// Dette returnerer en statisk liste av elementer


//17. Dokument-referanser som elementegenskaper

// Hente en spesifikk egenskap fra et element
const elementStyle = document.getElementById('myElement').style;

// Arbeide med tilpassede metoder for et element
const tableRows = document.getElementById('myTable').rows;


// 18. Eksempler på elementegenskaper for elementreferanser
// Arbeide med TABLE-elementegenskaper
const myTable = document.getElementById('myTable');
const tableHead = myTable.tHead;
const tableBodies = myTable.tBodies;
const tableRows2 = myTable.rows;


// 19. Egenskaper for barn-foreldre relasjoner

// Finne barn og foreldre til et element
const formElement = document.querySelector('form');
const formChildren = formElement.children;
const firstChild = formElement.firstElementChild;
const formParent = formElement.parentNode;

// 20. Egenskaper for søskenrelasjoner

// Arbeide med søsken-elementer
const element3 = document.querySelector('.someClass');
const nextSibling2 = element.nextElementSibling;
const previousSibling = element.previousElementSibling;