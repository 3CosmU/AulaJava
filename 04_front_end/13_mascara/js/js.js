
const form = document.querySelector("form");
const cpfMask = document.querySelector("#cpf");
const telefoneMask = document.querySelector("#telefone");
const cepMask = document.querySelector("#cep");


//function para armazenar os valores do input / declaração de variaveis locais 
const exibirInfo = () => {
    let nome = document.querySelector("#nome").value;
    let email = document.querySelector("#email").value;
    let nascimento = document.querySelector("#nascimento").value;
    let cpf = document.querySelector("#cpf").value;
    let telefone = document.querySelector("#telefone").value;
    let cep = document.querySelector("#cep").value;
    let endereco = document.querySelector("#endereco").value;

    //saida de dados
    document.querySelector('#nomeResult').innerHTML = `<br>${nome}<br><br><hr>`;
    document.querySelector('#emailResult').innerHTML = `<b>E-mail:</b> ${email}<br><hr>`;
    document.querySelector('#nascimentoResult').innerHTML = `<b>Data de Nascimento:</b> ${nascimento}<br><hr>`;
    document.querySelector('#cpfResult').innerHTML = `<b>CPF:</b> ${cpf}<br><hr>`;
    document.querySelector('#telefoneResult').innerHTML = `<b>Telefone:</b> ${telefone}<br><hr>`;
    document.querySelector('#cepResult').innerHTML = `<b>CEP:</b> ${cep}<br><hr>`;
    document.querySelector('#enderecoResult').innerHTML = `<b>Endereço:</b> ${endereco}<br><hr>`;


    //apagar dados de todo o formulario
    form.reset();

   

}

//Mascara
cpfMask.addEventListener("input", function () {
    this.value = this.value
        .replace(/\D/g, "")
        .replace(/(\d{3})(\d)/, "$1.$2")
        .replace(/(\d{3})(\d)/, "$1.$2")
        .replace(/(\d{3})(\d{1,2})$/, "$1-$2");
});


telefoneMask.addEventListener("input", function () {
    this.value = this.value
        .replace(/\D/g, "")
        .replace(/(\d{2})(\d)/, "($1)$2")
        .replace(/(\d{4,5})(\d)/, "$1-$2")
        .replace(/(-\d{4})\d+?$/, "$1");
});

cepMask.addEventListener("input", function () {
    this.value = this.value
        .replace(/\D/g, "")
        .replace(/(\d{5})(\d)/, "$1-$2")
        .replace(/(-\d{3})\d+?$/, "$1");

});




form.addEventListener("submit", function (event) {
    event.preventDefault();
    exibirInfo();
});



