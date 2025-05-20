package Exercicios.src;

import java.util.HashSet;
import java.util.Set;

public class MatriculaDisciplinas {

    public static void main(String[] args) {
        // Alunos matriculados em POO
        Set<String> poo = new HashSet<>();
        poo.add("Ana");
        poo.add("Bruno");
        poo.add("Carlos");
        poo.add("Diana");

        // Alunos matriculados em BD
        Set<String> bd = new HashSet<>();
        bd.add("Carlos");
        bd.add("Diana");
        bd.add("Eduarda");
        bd.add("Fernando");

        // 1. Alunos nas duas disciplinas (interseção)
        Set<String> ambos = new HashSet<>(poo);
        ambos.retainAll(bd);  // interseção
        System.out.println("Alunos em POO e BD: " + ambos);

        // 2. Alunos somente em uma disciplina (diferença simétrica)
        Set<String> apenasUma = new HashSet<>(poo);
        apenasUma.addAll(bd);     // união
        Set<String> temp = new HashSet<>(poo);
        temp.retainAll(bd);       // interseção
        apenasUma.removeAll(temp);  // união - interseção
        System.out.println("Alunos apenas em uma das disciplinas: " + apenasUma);

        // 3. Alunos em pelo menos uma disciplina (união)
        Set<String> peloMenosUma = new HashSet<>(poo);
        peloMenosUma.addAll(bd);
        System.out.println("Alunos em pelo menos uma disciplina: " + peloMenosUma);
    }
}


