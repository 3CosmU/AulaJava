
const form = document.querySelector("form");


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
    document.querySelector("#nomeResult").innerHTML = `<b>Nome:</b> ${nome}`;
    document.querySelector("#emailResult").innerHTML = `<b>E-mail:</b> ${email}`;
    document.querySelector("#nascimentoResult").innerHTML = `<b>Data de Nascimento:</b> ${nascimento}`;
    document.querySelector("#cpfResult").innerHTML = `<b>Cpf:</b> ${cpf}`;
    document.querySelector("#telefoneResult").innerHTML = `<b>Telefone:</b> ${telefone}`;
    document.querySelector("#cepResult").innerHTML = `<b>Cep:</b> ${cep}`;
    document.querySelector("#enderecoResult").innerHTML = `<b>Endereço:</b> ${endereco}`;


    //apagar dados de todo o formulario
    form.reset();
}




form.addEventListener("submit", function (event) {
    event.preventDefault();
    exibirInfo();
});