# -*- coding: utf-8 -*-
"""
Created on Thu Apr 23 20:57:26 2020

@author: natan
"""

'''
Atividade 2

Fazer uma função que: Dado um vetor de números inteiros, retorne os índices de dois% 
%números cuja soma representa um valor definido pelo usuário. Não pode usar o mesmo elemento duas vezes.

Exemplo:
Dado numeros = [11, 3, 9, 2] e valor do usuário = 5,
Porque numeros[1] + numeros[3] = 3 + 2 = 5, a função retornaria [1, 3].

Na próxima aula vou escolher alguns alunos para explicar como resolveram.

Favor, observem o prazo e não acumulem atividades (a complidade da resolução é gradativa).

'''

def somavetor(list):
    
    valoruser = int(input('Informe um valor: '))

    valorMenor = []

    for i in range(len(list)):
        if list[i] < valoruser:
            valorMenor.append(list[i])

    print(valorMenor)

somavetor([11,3,9,2,4])