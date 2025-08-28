# Projeto Banco com AspectJ

Este projeto simula um sistema bancário simples, onde é possível realizar saques em diferentes tipos de contas: corrente, salário, poupança e investimento.  

A lógica principal das contas foi feita com Programação Orientada a Objetos, enquanto a verificação de saldo foi tratada como um aspecto separado usando AspectJ. Assim, sempre que o saldo for insuficiente, uma mensagem de log é registrada automaticamente.

---

## Como funciona
- O cliente solicita um saque em qualquer conta.  
- O aspecto de verificação entra em ação antes da operação.  
- Se não houver saldo suficiente, o log de erro é exibido.  
- Caso contrário, o saque é concluído normalmente.  

---

## Tecnologias
- Java  
- AspectJ  
- Eclipse (com suporte ao AspectJ)  

---

## Nota
O objetivo é mostrar de forma simples como separar regras transversais (como logs) usando aspectos, evitando repetição de código.
