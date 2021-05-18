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
            window.alert("Logou");
        })
        .catch(err => {
            window.alert("Usuário ou senha incorretos");
        });
    
}