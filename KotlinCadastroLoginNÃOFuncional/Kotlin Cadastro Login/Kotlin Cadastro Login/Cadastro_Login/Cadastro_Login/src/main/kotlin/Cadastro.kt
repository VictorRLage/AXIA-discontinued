import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

class Cadastro {
    lateinit var nome:String
    lateinit var cpf:String
    lateinit var telefone:String
    lateinit var email:String
    lateinit var senha:String
    lateinit var confsenha:String
    var verificar:Boolean = false

fun ValidarNome(){
    if(nome == " "){
        showMessageDialog(null,"Preencha o campo!")
        verificar = false
    }else{
        verificar = true
    }
}

fun ValidarCpf(){
    if (cpf.length == 11 ){
        verificar = true
    }else{
        showMessageDialog(null,"CPF Inválido!")
        verificar = false
    }
}

fun ValidarTelefone(){
    if (telefone.length == 11 ) {
        verificar = true
    }else{
        showMessageDialog(null,"Telefone Inválido!")
        verificar = false
    }
}

fun ValidarEmail(){
    if (email == " "){
        showMessageDialog(null,"E-mail Inválido!")
        verificar = false
    }
    verificar = true
    for (i in 0..email.length) {
        if(email[i] == '@') {
            verificar = true
            break
        }
        verificar = true
    }
}

fun ValidarSenha(){
    if (senha == " " ){
        showMessageDialog(null,"Preencha o campo de senha!")
        verificar = false
    }else{
        verificar = true
    }
}

fun ValidarConfSenha(){
    if (confsenha == senha) {
        verificar = true
    } else {
        showMessageDialog(null, "Senhas não coincidem!")
        verificar = false
    }
}
fun ValidarCadastro(){
        ValidarNome()
        ValidarCpf()
        ValidarTelefone()
        ValidarEmail()
        ValidarSenha()
        ValidarConfSenha()
        if(verificar == true) {
            showMessageDialog(null, "Cadastro Efetuado com sucesso!")
        }else{
            showMessageDialog(null,"Cadastro não efetuado verificar os campos!!")
        }
    }
}




