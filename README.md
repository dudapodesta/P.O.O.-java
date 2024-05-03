Trabalho (dígitos): faça um programa em java que lê um inteiro x de 3 dígitos e retorna os inteiros a,b,c referentes aos dígitos da unidade, dezena e centena, respectivamente.\\
Algoritmo (para x,a,b,c inteiros):
Leia(x)
Faça a=x%10
Faça x=x/10
Faça b=x%10
Faça c=x/10

Algoritmo (para x,a,b,c reais):
Leia(x)
Faça a=x%10
Faça x=x-a
Faça x=x/10
Faça b=x%10
Faça x=x-b
Faça x=x/10
Faça c=x%10

