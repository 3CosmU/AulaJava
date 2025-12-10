const form = document.querySelector('#form');

const calcular = () => {
    let nome = document.querySelector('#nome').value.trim();
    let data = document.querySelector('#dataNascimento').value;
    let genero = document.querySelector('#genero').value;
    let email = document.querySelector('#email').value.trim();
    let telefone = document.querySelector('#telefone').value.trim();
    let peso = parseFloat(document.querySelector('#peso').value);
    let altura = parseFloat(document.querySelector('#altura').value);


    const imc = (peso / (altura * altura)).toFixed(2);
    let diagnostico = '';
    if (imc < 18.5) diagnostico = 'Abaixo do peso';
    else if (imc < 24.9) diagnostico = 'Peso normal';
    else if (imc < 29.9) diagnostico = 'Sobrepeso';
    else if (imc < 39.9) diagnostico = 'Obesidade';
    else diagnostico = 'Obesidade Grave';

    document.querySelector('#result').innerHTML = `
    <div class="alert alert-info p-4">
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
    </div>
  `;

    form.reset();
};

form.addEventListener('submit', function (event) {
    event.preventDefault();
    calcular();
});
