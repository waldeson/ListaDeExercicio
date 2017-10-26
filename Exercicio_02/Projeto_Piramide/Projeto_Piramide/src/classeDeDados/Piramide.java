
package classeDeDados;

public class Piramide {
    
    private float base = 0;
    private float altura = 0;
    
    //Metodos

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
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
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float calcularVolume(){
        return(float)(1.0/3.0*base*altura);
    }
}
