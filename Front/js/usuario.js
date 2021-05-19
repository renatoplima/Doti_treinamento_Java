function exibirdash(){

    fetch("http://localhost:8080/lancamento/" + document.getElementById("cmb_artistas").value)
        .then(res => res.json())
        .then(res => {
            document.getElementById("dados").innerHTML = "<br><h3>Lançamento: " + res + "</h3>";
        })

    fetch("http://localhost:8080/catalogo/" + document.getElementById("cmb_artistas").value)
        .then(res => res.json())
        .then(res => {
            document.getElementById("dados").innerHTML += "<br><h3>Catálogo: " + res + "</h3>";
        })

}

function filtrar(){
    fetch("http://localhost:8080/artista/" + document.getElementById("cmb_artistas").value)
        .then(res => res.json())
        .then(res => {
            var resposta = 
                "<table border='1' align='center' width='80%'><tr>" + 
                "<tr  align='center'>" + 
                "<th>Música</th> <th>Cadastro</th> <th>Lançamento</th>" +
                "</tr>";
            for (contador = 0; contador < res.musicas.length; contador++){
                lancamento="Não";
                if (res.musicas[contador].lancamento == 1){
                    lancamento="Sim";
                }
                resposta+=
                    "<tr  align='center'>" +
                    "<td>" + res.musicas[contador].titulo + "</td>" +
                    "<td>" + res.musicas[contador].cadastro + "</td>" +
                    "<td>" + lancamento + "</td>" +
                    "</tr>";
            }
            resposta+="</table>";
            document.getElementById("tabelamusicas").innerHTML=resposta;
        })
        .catch(err => {
            window.alert("Sem Músicas")
            window.location="../html/error.html"
        })
}

function exibirartistas(){

    fetch("http://localhost:8080/artistas")
        .then(res => res.json())
        .then(res => {
//            var resposta="<option selected>Escolha o Artista ...</option>";
            var resposta="";
            for (contador = 0; contador < res.length; contador++){
                resposta+=
                "<option value='" + res[contador].id + "'>" + res[contador].nomeArtistico + "</option>";
            }
            document.getElementById("cmb_artistas").innerHTML = resposta;
        })
        .catch(err => {
            window.alert("Sem Artistas")
            window.location="../html/error.html"
        })

}

function exibirusuario(){

//    exibirartistas();

    var userstr = localStorage.getItem("userlogado");
    if (userstr == null){
        window.location="../html/login.html";
    }else {
        var userjson = JSON.parse(userstr);
        document.getElementById("dados").innerHTML = 
            "<h4>" + userjson.nome + 
            "<br>" + userjson.email + 
            "<br>ID: " + userjson.id + "</h4>" ;
           // + "<br><img src="../imagens/Goku.png" >"; 
        document.getElementById("foto").innerHTML = 
            "<img src=../imagens/" + userjson.foto + " width='200' height='200'>";
    }

}

function logar(){

    var usuario = {
        email : document.getElementById("txtemail").value,
        senha : document.getElementById("txtsenha").value
    };

    var envelope = {
        method : "POST",
        body : JSON.stringify(usuario),
        headers : {
            "content-type" : "application/json"
        }
    };

    fetch("http://localhost:8080/login", envelope)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("userlogado", JSON.stringify(res));
            window.location="../html/principal.html"
        })
        .catch(err => {
            window.location="../html/error.html"
        });
    
}