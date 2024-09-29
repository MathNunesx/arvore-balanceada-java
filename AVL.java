import java.util.LinkedList;
public class AVL {
    private NoAVL raiz;      //RAIZ DA ÁRVORE

    private boolean flaginsercao;    // VERIFICA SE JÁ FOI FEITA A INSERÇÃO

    private boolean flagRemove;       // VERIFIFCA SE JA FOI FEITA A REMOÇAO

    public AVL (Object dado, NoAVL pai, NoAVL esquerdo, NoAVL direito){
        raiz = new NoAVL(dado, pai, esquerdo, direito);
    }

    public AVL(Object dado) {this(dado, null, null, null);}

    public AVL(){raiz = null;}

    public NoAVL getRaiz(){ return raiz;}

    public void setRaiz(NoAVL _raiz){raiz = _raiz;}

    public boolean isEmpty(){return (raiz == null);}

    private int compara(Object ob1, Object ob2){return((Comparable)ob1).compareTo(ob2);}

    private NoAVL searchNoAvl(NoAVL raiz, Object e){
        // se a raiz estiver nula, elemento não existe

        if(raiz == null){
            return null;
        } else //elemento encontrado na raiz
        if(compara(e, raiz.getDado()) == 0){
            return raiz;
        } else //procurando recursivamente
        if(compara(e, raiz.getDado()) < 0){
            return searchNoAvl(raiz.getEsquerdo(), e);
        } else {
            return searchNoAvl(raiz.getDireito(), e);
        }
    }

    public NoAVL searchAVL(Object e){ return searchNoAvl(raiz, e);}

    //Rotação simples para esquerda

    private NoAVL rotacaoSD(NoAVL A) {
        NoAVL B = A.getEsquerdo();

        // Se não for a raiz, tem um Pai

        if (A.getPai() != null) {
            if (A.getPai().getEsquerdo() == A) //Se A for o filho esquerdo, o pai assume como filho esquerdo
            {
                A.getPai().setEsquerdo(B);
            } else {
                A.getPai().setDireito(B);// Senão o pai assume como filho direito B
            }
        }

        // O Pai de B agora é o Pai de A
        B.setPai(A.getPai());

        // Como B subiu, Pode ter deixado órfão (direito) que assume é o A
        A.setEsquerdo(B.getDireito());
        //Se A assumiu o filho do B, então setar o pai dele sendo o A

        if(A.getEsquerdo()!= null){
            A.getEsquerdo().setPai(A);
        }

        //B passa a ser o pai de A e A será Filho de B
        B.setDireito(A);
        A.setPai(B);

        return B;
    }



}
