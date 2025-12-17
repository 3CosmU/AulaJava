//Seleção dos elementos do formulário
const form = document.querySelector('form');

//Seleciona o formulário inteiro para poder capturar o envio (submit).
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const pesquisaCep = document.querySelector('#cep');
const pesquisaCpf = document.querySelector("#cpf")


//Função para limpar os campos de endereço
const limpaFormularioCep = () => {
    document.querySelector('#estado').value = ("");
    document.querySelector('#cidade').value = ("");
    document.querySelector('#bairro').value = ("");
    document.querySelector('#logradouro').value = ("");
    document.querySelector('#complemento').value = ("");
}
/*  Callback do ViaCEP (retorno da API),
Função chamada automaticamente pelo ViaCEP quando o CEP é consultado 
Verifica se não houve erro na resposta.
Preenche os campos do formulário com os dados retornados pela API.
*/
const meuCallback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector('#estado').value = (conteudo.uf);
        document.querySelector('#cidade').value = (conteudo.localidade);
        document.querySelector('#bairro').value = (conteudo.bairro);
        document.querySelector('#logradouro').value = (conteudo.logradouro);
        document.querySelector('#complemento').value = (conteudo.complemento);
    }
    else {
        limpaFormularioCep();
        alert("CEP não encontrado.");
    }
}

//mask cpf,cep,telefone
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

pesquisaCpf.addEventListener("input", function () {
    this.value = this.value
        .replace(/\D/g, "")
        .replace(/(\d{3})(\d)/, "$1.$2")
        .replace(/(\d{3})(\d)/, "$1.$2")
        .replace(/(\d{3})(\d{1,2})$/, "$1-$2");
});

/* Busca automática do CEP (quando sai do campo)
Executa quando o usuário sai do campo CEP.
Remove o hífen e deixa só números.
Expressão regular para validar CEP com 8 dígitos.
Verifica se o CEP é válido.
Mostra "loading..." enquanto busca os dados. 
Cria dinamicamente um <script> para consumir a API do ViaCEP usando JSONP.*/

pesquisaCep.addEventListener("blur", function () {
    let cep = document.querySelector("#cep").value.replace(/\D/g, "");

    if (cep != "") {
        let validarCep = /^[0-9]{8}$/;

        if (validarCep.test(cep)) {
            document.querySelector("#estado").value = "loading..."
            document.querySelector("#cidade").value = "loading..."
            document.querySelector("#bairro").value = "loading..."
            document.querySelector("#logradouro").value = "loading..."
            document.querySelector("#complemento").value = "loading..."

            let script = document.createElement("script");


            script.src = "https://viacep.com.br/ws/" + cep + "/json/?callback=meuCallback";


            document.body.appendChild(script);


        }
        else {
            limpaFormularioCep();
            alert("Formato do cep e inválido.")
        }
    }
    else {
        limpaFormularioCep();
    }
});

/* Função para exibir os dados preenchidos
    Captura todos os valores do formulário.
 */

const exibirDados = () => {
    let nome = document.querySelector('#nome').value;
    let email = document.querySelector('#email').value;
    let nascimento = document.querySelector('#nascimento').value;
    let telefone = document.querySelector('#telefone').value;
    let cpf = document.querySelector('#cpf').value;
    let cep = document.querySelector('#cep').value;
    let estado = document.querySelector('#estado').value;
    let cidade = document.querySelector('#cidade').value;
    let bairro = document.querySelector('#bairro').value;
    let logradouro = document.querySelector('#logradouro').value;
    let complemento = document.querySelector('#complemento').value;
    let numero = document.querySelector('#numero').value;

    /*   Saida de dados
        Lê os dados digitados pelo usuário.
        Exibe os dados na tela, campo por campo. */
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



    /* Reset do formulário */
    form.reset();


}


/* Evento de envio do formulário */
form.addEventListener("submit", function (event) {
    event.preventDefault();
    exibirDados();
});


