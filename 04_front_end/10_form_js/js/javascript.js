// Declaração de váriaveis globais

const form = document.querySelector("form");

form.addEventListener("submit", function (event) {
    // Desativar o submit
    event.preventDefault();

    //declaração de váriaveis locais

    let texto = document.querySelector("#texto").value;

    //Exibir texto em forma de caixa de diálogo

    alert(texto);
});