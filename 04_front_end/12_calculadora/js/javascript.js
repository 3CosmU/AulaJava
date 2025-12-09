const form = document.querySelector("form");

const calcular = () => {
    //declaração de áriaveis locais
    let x = document.querySelector("#x").value;
    let y = document.querySelector("#y").value;
    let operador = document.querySelector("#operador").value;
    let result = 0;

    //TODO: fazer função calcular
    switch (operador) {
        case "soma":
            result = x + y;
            document.querySelector("#result").innerHTML = result;
            break;
        case "subtração":
            result = x - y;
            document.querySelector("#result").innerHTML = result;
            break;
        case "multiplicação":
            result = x * y;
            document.querySelector("#result").innerHTML = result;
            break;
        case "divisão":
            result = x / y;
            document.querySelector("#result").innerHTML = result;
            break;
    }
}




form.addEventListener("subimit", function (event) {
    event.preventDefault();
    calcular();
});
