import javax.swing.JOptionPane
import javax.swing.JOptionPane.*




fun main() {
    val listaCadastro = mutableListOf<Cadastro>()
   while(true) {
       var pergunta1 = showInputDialog("1 - Cadastrar \r\n 2 - Login").toInt()
       if(pergunta1 == 1) {
           val cadastro1 = Cadastro()
           cadastro1.nome = showInputDialog("Insira seu nome:")
           cadastro1.cpf = showInputDialog("Insira seu CPF:")
           cadastro1.telefone = showInputDialog("Insira seu Número para Contato:")
           cadastro1.email = showInputDialog("Insira seu E-mail:")
           cadastro1.senha = showInputDialog("Insira sua Senha:")
           cadastro1.confsenha = showInputDialog("Confirme sua Senha:")
           cadastro1.ValidarCadastro()
           listaCadastro.add(cadastro1)
       }
       if(pergunta1 == 2) {
           var email = showInputDialog("Insira seu E-mail:")
           var senha = showInputDialog("Insira sua Senha:")
           listaCadastro.forEach { cadastro ->
               if(cadastro.email.equals(email) && cadastro.senha.equals(senha)){
               showMessageDialog(null,"Login Efetuado com sucesso!")
               }else showMessageDialog(null,"Login não consta no banco de dados")
           }
           showMessageDialog(null,"Login Efetuado com sucesso!")

       }else{
           JOptionPane.showMessageDialog(null, "Encerrando")
           break
       }
   }
}

