function fazGet(url){
    let request = new XMLHttpRequest()
    request.open("GET", url , false)
    request.send()
    return request.responseText
}

function criaLinha(cliente){
// cria linha   
    linha = document.createElement("tr")

// cria elemento da linha 
    tdIdCliente = document.createElement("td");
    tdNome = document.createElement("td"); 
    tdcpfouCnpj = document.createElement("td");
    tdTipo = document.createElement("td");
    tdEmail = document.createElement("td");

 //Criando o Html
 tdIdCliente.innerHTML = cliente.idCliente
 tdNome.innerHTML = cliente.nome
 tdcpfouCnpj.innerHTML  = cliente.cpfOuCnpj
 tdTipo.innerHtml = cliente.tipo
 tdEmail.innerHTML = cliente.email

 //add como filho a cada um 
 linha.appendChild(tdIdCliente);
 linha.appendChild(tdNome);
 linha.appendChild(tdcpfouCnpj);
 linha.appendChild(tdTipo);
 linha.appendChild(tdEmail);
 return linha;
}
 
function main(){
    let data = fazGet("http://localhost:8080/clientes/")
    // fazGet é a função que faz o método, agora URL
    let clientes = JSON.parse(data);
    //
    console.log(clientes);
//pegando nossa tabela em Html. criando linha a linha
    let tabela= document.getElementById("tabela")
    clientes.forEach(element => {
        let linha = criaLinha(element);
        tabela.appendChild(linha);
    });
 }

 main()