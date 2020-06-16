# -*- coding: utf-8 -*-
"""
Created on Tue Apr 14 20:18:26 2020

@author: natan
"""


'''
Atividade 1  

1. Criar um vetor de "n" posições;
2. Inserir um conjunto de valores numéricos no vetor;
3. Imprimir os valores numéricos do vetor, sem utilizar o recurso de laço de repetição

'''
a = []

pos = int(input("Informe o numero de posições:  "))

for i in range (pos):
    n  = int(input("Informe um numero para ser inserido no array: "))
    a.append(n)

for i in range(len(a)):
    for j in range (0, len(a)-i-1):
       if a[j] > a[j+1]:
           a[j],a[j+1] = a[j+1],a[j]

for i in range (len(a)):
    print(a[i])


    