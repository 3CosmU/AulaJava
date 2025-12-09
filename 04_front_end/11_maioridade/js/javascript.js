// Declaração de váriaveis globais
const form = document.querySelector("Form");

//funç para calcular a maior idade
const maioridade = () => {
    let nome = document.querySelector("#nome").value;
    let idade = document.querySelector("#idade").value;
    const result = (idade >= 18) ? " é maior de idade" : " é menor de idade"; //Ternario

    //If else normal

    /* const result
    
        if (idade >= 18) {
            result = "é maior de idade";
        } else {
            result = "é menor de idade";
        } */




    //Saida de dados
    document.querySelector("#result").innerHTML = `${nome}${result}.`;

    //Limpar valores
    document.querySelector("#nome").value = '';
    document.querySelector("#idade").value = '';


}

//evento
form.addEventListener("submit", function (event) {
    event.preventDefault();
    maioridade();

});
