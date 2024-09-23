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


}
