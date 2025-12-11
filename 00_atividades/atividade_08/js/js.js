/* Aqui o JavaScript pega o formulário que tem o id form.
Assim podemos trabalhar com ele no código. */
const form = document.querySelector('#form');


/* Essa função será chamada quando o usuário clicar em Enviar no formulário. */
const exibir = () => {
    /* 
    *procura cada campo pelo ID
    *pega o valor digitado
    *trim() remove espaços no início/fim
    *parseFloat() converte strings em número real (peso e altura)
     */
    let nome = document.querySelector('#nome').value.trim();
    let data = document.querySelector('#dataNascimento').value;
    let genero = document.querySelector('#genero').value;
    let email = document.querySelector('#email').value.trim();
    let telefone = document.querySelector('#telefone').value.trim();
    let peso = parseFloat(document.querySelector('#peso').value);
    let altura = parseFloat(document.querySelector('#altura').value);

    /* .toFixed(2) reduz o resultado para 2 casas decimais. */
    const imc = (peso / (altura * altura)).toFixed(2);
    let diagnostico = '';
    if (imc < 18.5) diagnostico = 'Abaixo do peso';
    else if (imc < 24.9) diagnostico = 'Peso normal';
    else if (imc < 29.9) diagnostico = 'Sobrepeso';
    else if (imc < 39.9) diagnostico = 'Obesidade';
    else diagnostico = 'Obesidade Grave';


    /* Seleciona o elemento com id #result
    *Insere dentro dele um bloco HTML com template string (` `)
    *Mostra todos os dados digitados
    *Mostra o IMC e o diagnóstico
    *A classe alert alert-info é do Bootstrap (caixa azul)
    *A altura também é convertida para centímetros com (altura * 100). */

    //Saida de dados
    document.querySelector('#result').innerHTML =
        `<div class="alert alert-info p-4">
        <h4>Resultado:</h4>
        <p><strong>Nome:</strong> ${nome}</p>
        <p><strong>Data de Nascimento:</strong> ${data}</p>
        <p><strong>Gênero:</strong> ${genero}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Telefone:</strong> ${telefone}</p>
        <p><strong>Peso:</strong> ${peso} kg</p>
        <p><strong>Altura:</strong> ${(altura * 100).toFixed(0)} cm (${altura} m)</p>
        <p><strong>IMC:</strong> ${imc}</p>
        <p><strong>Diagnóstico:</strong> ${diagnostico}</p>
    </div>`;

    /* Depois que o resultado aparece, o formulário volta a ficar limpo. */
    form.reset();
};
/* event.preventDefault() impede a página de recarregar.
*Chama a função calcular(), que faz todo o trabalho.    
*/
form.addEventListener('submit', function (event) {
    event.preventDefault();
    exibir();
});
