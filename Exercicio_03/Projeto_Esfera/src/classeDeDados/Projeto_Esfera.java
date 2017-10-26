package classeDeDados;

public class Projeto_Esfera {
    private float raio;
    private float area;
    private float volume;
    
    //Metodos

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) throws Exception{
        if(area < 0) throw new Exception ("Area não pode ser zero");
        this.area = area;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) throws Exception{
        if(volume < 0) throw new Exception ("Volume não pode ser zero");
        this.volume = volume;
    }
    public float areaTotal(){
        return(float)(4*31415*(raio*raio));
        
    }
    public float volumeTotal(){
        return (float)((4/3.0)*3.1415*(raio*raio*raio));
    } 
}
