package classeDeDados;
public class Projeto_Retangulo {
    private float comprimento = 0;
    private float largura = 0;
    
    //Metodos

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
        if(comprimento <= 0)throw new Exception("Comprimento não pode ser negativo ou zero !!!");
        this.comprimento = comprimento;
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
    public void setLargura(float largura) throws Exception{
        if(largura <= 0) throw new Exception("Largura não pode ser zero !!!");
        this.largura = largura;
    }
    public float calculoDoPerimetro(){
        return (float)(comprimento+comprimento+(largura+largura));
    }
    public float calculoDaArea(){
        return(float)(largura*comprimento);
        
    }
}
