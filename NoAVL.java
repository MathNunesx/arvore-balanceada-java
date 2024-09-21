public class NoAVL {
    private Object dado;    // DADO DO NÓ
    private NoAVL pai;      // PAI DO NÓ
    private NoAVL esquerdo; //FILHO ESQUERDO
    private NoAVL direito;  // FILHO DIREITO
    private int fatorB;     // FATOR DE BALACEAMENTO

    public NoAVL(Object x, NoAVL p, NoAVL e, NoAVL d){
        dado = x;
        pai = p;
        esquerdo = e;
        direito = d;
        fatorB = 0;
    }

    public String toString(){ return dado.toString();}

    public NoAVL(){this("", null, null, null);}

    public NoAVL(Object _dado){this(_dado, null, null, null);}

    public Object getDado(){return dado;}

    public void setDado(Object _dado){dado = _dado;}

    public NoAVL getPai(){return pai;}
    public void setPai(NoAVL _pai){pai = _pai;}

    public NoAVL getEsquerdo(){return esquerdo;}

    public void setEsquerdo(NoAVL _esquerdo){esquerdo = _esquerdo;}

    public NoAVL getDireito(){return direito;}

    public void setDireito(NoAVL _direito){direito = _direito;}

    public void setFatorB(int _fatorB){fatorB = _fatorB;}
    public int getFatorB(){return fatorB;}


}
