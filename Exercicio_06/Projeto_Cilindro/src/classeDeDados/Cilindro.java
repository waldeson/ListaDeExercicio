package classeDeDados;
public class Cilindro {
    private float raio;
    private float altura;
    
    //Metodos

    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(float raio)throws Exception {
        if(raio <= 0)throw new Exception("Raio não pode ser nullo ou zero!!!");
        this.raio = raio;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura)throws Exception {
        if(altura <= 0) throw new Exception("Altura não pode ser nulla ou zero!!!");
        this.altura = altura;
    }
    public float calculoDaAreaLateral()throws Exception{
        return(float)(2*3.1415*(raio*altura));
    }
    public float calculoDaAreaTotal()throws Exception{
        return (float)(2*3.1415*(raio*altura)+raio);
    }
    public float calculoDoVolume()throws Exception{        
        return(float)((3.1415*raio)*(raio*altura));
    }
}
