const form = document.querySelector("form");
const telefoneMask = document.querySelector("#telefone");
const cepMask = document.querySelector("#cep");
const pesquisaCep = document.querySelector("#cep")

//Function para limpar o form
const limparFormularioCep = () => {
    document.querySelector("#estado").value = ("");
    document.querySelector("#cidade").value = ("");
    document.querySelector("#bairro").value = ("");
    document.querySelector("#logradouro").value = ("");
    document.querySelector("#complemento").value = ("");

}

const meuCallback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector("#estado").value = (conteudo.uf);
        document.querySelector("#cidade").value = (conteudo.localidade);
        document.querySelector("#bairro").value = (conteudo.bairro);
        document.querySelector("#logradouro").value = (conteudo.logradouro);
        document.querySelector("#complemento").value = (conteudo.complemento);

    }
    else {
        limparFormularioCep();
        alert("Cep não encontrado.")

    }
}

//TODO: Funções de mascara de entrada e função pesquisaCep

//Variaveis para armazenamento de dados
const exibirDados = () => {
    let nome = document.querySelector("nome").value;
    let email = document.querySelector("#email").value;
    let nascimento = document.querySelector("#nascimento").value;
    let telefone = document.querySelector("#telefone").value;
    let cpf = document.querySelector("#cpf").value;
    let cep = document.querySelector("#cep").value;
    let estado = document.querySelector("#estado").value;
    let cidade = document.querySelector("#cidade").value;
    let bairro = document.querySelector("#bairro").value;
    let logradouro = document.querySelector("#logradouro").value;
    let complemento = document.querySelector("#complemento").value;
    let numero = document.querySelector("#numero").value;

    //Saida de dados
    document.querySelector('#nomeResult').innerHTML = `<br>${nome}<br><br><hr>`;
    document.querySelector('#emailResult').innerHTML = `<b>E-mail:</b> ${email}<br><hr>`;
    document.querySelector('#nascimentoResult').innerHTML = `<b>Data de Nascimento:</b> ${nascimento}<br><hr>`;
    document.querySelector('#cpfResult').innerHTML = `<b>CPF:</b> ${cpf}<br><hr>`;
    document.querySelector('#telefoneResult').innerHTML = `<b>Telefone:</b> ${telefone}<br><hr>`;
    document.querySelector('#cepResult').innerHTML = `<b>CEP:</b> ${cep}<br><hr>`;
    document.querySelector('#estadoResult').innerHTML = `<b>Estado:</b> ${estado}<br><hr>`;
    document.querySelector('#cidadeResult').innerHTML = `<b>Cidade:</b> ${cidade}<br><hr>`;
    document.querySelector('#bairroResult').innerHTML = `<b>Bairro:</b> ${bairro}<br><hr>`;
    document.querySelector('#logradouroResult').innerHTML = `<b>Logradouro:</b> ${logradouro}<br><hr>`;
    document.querySelector('#complementoResult').innerHTML = `<b>Complemento:</b> ${complemento}<br><hr>`;
    document.querySelector('#numeroResult').innerHTML = `<b>Número:</b> ${numero}<br><hr>`;




    form.reset();


}

form.addEventListener("submit", function (event) {
    event.preventDefault();
    exibirDados();
});


