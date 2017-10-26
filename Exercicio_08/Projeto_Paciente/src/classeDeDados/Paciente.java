
package classeDeDados;

public class Paciente {
    //Atributos
    private String nome = " ";
    private float peso = 0;
    private float altura = 0;
    
    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws Exception {        
        if(peso < 0)       throw new Exception ("Peso não pode ser nullo ou zero!!!");
        else if(peso == 0) throw new Exception ("Peso não pode ser nullo ou zero!!!");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {       
        if(altura < 0)       throw new Exception ("Altura não pode ser nullo ou zero!!!");
        else if(altura == 0) throw new Exception ("Altura não pode ser nullo ou zero!!!");
        this.altura = altura;
    }
    
    public float caucularIMC(){
        return (float)(peso/(Math.pow(altura,2)));
    }
    public String caucularFaixaDoPeso(){
        
        String peso = " ";
        if(caucularIMC()<20)                                 peso = "Abaixo do peso ideal.";
        else if (caucularIMC() <= 25 || caucularIMC() >= 20) peso = "Peso normal."         ;
        else if (caucularIMC() <= 30)                        peso = "Excesso de peso."     ;
        else if (caucularIMC() <= 35)                        peso = "Obesidade."           ;
        else                                                 peso = "Obesidade mórbida."   ;
        return                                               peso                          ;
    }     

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
