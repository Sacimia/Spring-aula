function cadastroCliente(){
    event.preventDefault()
    let url = "http://localhost:8080/clientes/"
    let nome = document.getElementById("nome").value
    let email = document.getElementById("email").value
    let cpfouCnpj = document.getElementById("pfouCnpj").value
    let tipo = document.getElementById("tipo").value
    let telefones = document.getElementById("telefones").value
}
function fazPost(url,body){
    console.log(body);
    let request = new XMLHttpRequest()
    request.open("POST", url, true)
    request.setRequestHeader("Content-type", "application/java")
    request.send(JSON.stringify(body))

    request.onload =  function (){
        console.log(this.responseText)
    }
}