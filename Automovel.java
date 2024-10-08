public class Automovel implements Comparable<Automovel> {

   public String placa;
   public String marca;
   public int ano;
   public float preco;

   public Automovel(String placa, String marca, int ano, float preco){
       this.placa = placa;
       this.marca = marca;
       this.ano = ano;
       this.preco = preco;
   }

   public Automovel(){}

    public String getPlaca(){return placa;}

    public void setPlaca(String placa){ this.placa = placa;}

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    public int getAno() {return ano;}

    public void setAno(int ano) {this.ano = ano;}

    public float getPreco() {return preco;}

    public void setPreco(float preco) {this.preco = preco;}

    public int compareTo(Automovel outro){
       if(placa.compareTo(outro.getPlaca()) < 0){
           return -1;
       }else if(placa.compareTo(outro.getPlaca()) == 0){
           return 0;
       } else{
           return 1;
       }
    }

    @Override
    public String toString(){
       return "Placa: " + placa + ", Marca:" + marca + ", Ano: " + ano + ", Preço: R$ " + preco;
    }

}
