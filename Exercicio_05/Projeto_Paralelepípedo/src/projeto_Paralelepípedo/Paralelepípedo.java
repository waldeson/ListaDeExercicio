/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_Paralelepípedo;

/**
 *
 * @author aluno
 */
public class Paralelepípedo {
    private float altura;
    private float largura;
    private float comprimento;
    
    //Metodos

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     * @throws java.lang.Exception
     */
    public void setAltura(float altura)throws Exception{
        if(altura <= 0)throw new Exception("Altura não pode ser nula ou zero!!!");
        this.altura = altura;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     * @throws java.lang.Exception
     */
    public void setLargura(float largura)throws Exception {
        if(largura <= 0) throw new Exception("Largura não pode ser nula ou zero!!!");
        this.largura = largura;
    }

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     * @throws java.lang.Exception
     */
    public void setComprimento(float comprimento) throws Exception{
        if(comprimento <= 0)throw new Exception("Comprimento não pode ser nulo ou zero!!!");
        this.comprimento = comprimento;
    }
    public float calculoDoVolume(){
         return (float)(altura*(comprimento*largura));        
    }
    public float calculoDaArea(){
        return (float)(2*((altura*largura)+(altura*comprimento)+(largura*comprimento)));
    }
}
