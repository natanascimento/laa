package grafoslaa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Natan Nascimento Oliveira Matos
 * Matricula: 1181177100
 * Matéria: Laboratório de Análise de Algoritmo
 * Turma: N01
 * 
 * 1° Questão
 */

public class Avaliacao2_1_Questao {
  
    static String caminhoDoArquivo = "C:\\dev\\laa\\grafos\\data\\file1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        
        int numeroDeVertices = pegarNumeroDeVertices();
        List<Integer>[] grafo = new ArrayList[numeroDeVertices];
        carregarGrafoEmMemoria(grafo);
        imprimirVerticesEQuantidadeAdjacentes(grafo);
        int complexidade = calcularComplexidade(grafo, numeroDeVertices);
        System.out.println("A complexidade deste grafo é: " + complexidade);
    }
    
    static int calcularComplexidade(List[] grafo, int numeroDeVertices){
        int numeroDeArestas = 0;
        for(int i=0; i < grafo.length;i++){
            numeroDeArestas += (grafo[i].size());
        }
        return (numeroDeVertices +  numeroDeArestas);
    }
    
    static int pegarNumeroDeVertices() throws FileNotFoundException{
        int contador = 0;
        Scanner input = new Scanner (new FileReader (caminhoDoArquivo));
        while (input.hasNext()){
            contador ++;
            input.nextLine();
        }
        return contador;
    }
    
    static void ligarGrafo(List[] grafo){
        for (int i = 0; i < grafo.length; i++){
            grafo[i] = new ArrayList<Integer>();
        }
    }
    
    static void carregarGrafoEmMemoria(List[] grafo) throws FileNotFoundException{
        int contador = 0;
        ligarGrafo(grafo);
        Scanner input = new Scanner (new FileReader (caminhoDoArquivo));
        while (input.hasNext()){
            String line = input.nextLine();
            String[] vertices = line.split("\t");
            for (String vertice: vertices){
                grafo[contador].add(vertice);
            }
            contador++;
        }
    }
    
    static void imprimirVerticesEQuantidadeAdjacentes(List[] grafo){
        for (int i=0; i < grafo.length; i++){
            System.out.print(grafo[i].get(0) + ": ");
            grafo[i].remove(grafo[i].get(0));
            System.out.print(grafo[i]);
            System.out.println("(quantidade de vértices adjacentes: " + (grafo[i].size()) + ")");
        }
    }
      
}
