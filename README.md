# 💡 Projeto Banco com AspectJ

Este repositório traz uma implementação simples de um sistema bancário utilizando **Programação Orientada a Objetos (POO)** e **Programação Orientada a Aspectos (POA)**.  

A proposta foi unir os dois paradigmas para resolver um problema clássico:  
- O cliente pode realizar **saques em diferentes contas** (corrente, salário, poupança e investimento).  
- Sempre que o saldo for insuficiente, um **log de erro** deve ser gerado automaticamente.  

A parte da lógica das contas foi feita em POO, enquanto a **verificação de saldo** foi tratada como um **aspecto transversal**, implementado com **AspectJ**.  

---

## 🎯 Objetivo
- Explorar conceitos de **POO e POA juntos**.  
- Mostrar como o uso de aspectos reduz a repetição de código.  
- Ter um exemplo prático e didático do paradigma orientado a aspectos aplicado em Java.  

---

## 🛠️ Tecnologias
- Java  
- AspectJ  
- Eclipse + AJDT  

---

## 🚀 Como funciona
1. O cliente tenta sacar um valor de qualquer tipo de conta.  
2. Antes da execução do saque, o **aspecto de verificação** entra em ação.  
3. Caso o saldo seja insuficiente, um log de erro é registrado automaticamente.  
4. Se houver saldo, o saque acontece normalmente.  

---

## 📚 Aprendizados
Esse projeto foi uma ótima oportunidade de:  
- Entender melhor como funcionam **concerns transversais** (como logs).  
- Praticar a **separação de responsabilidades** entre POO e POA.  
- Ver na prática como o AspectJ pode ser aplicado em situações reais.  

---

## 📌 Observação
O foco não é criar um sistema bancário completo, mas sim **demonstrar a aplicação de aspectos** em um contexto simples e claro.  
