package taller3.televisores;

public class TV{
    
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    static int numTV = 0;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }
    public Marca getMarca(){
        return marca;
    }
    public int getCanal(){
        return canal;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public Control getContol(){
        return control;
    }
    public static int getNumTV(){
        return numTV;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setMarca(Marca marca){
        this.marca= marca;
    }
    public void setCanal(int canal){
        this.canal= canal;
    }
     public void setPrecio(int precio){
        this.precio= precio;
    }
     public void setVolumen(int volumen){
        this.volumen= volumen;
    }
     public void setControl(Control control){
        this.control= control;
    }
    public static void setNumTV(int num) {
        numTV = num;
    }

    public void TurnOn(){
        if(estado==false){
            this.estado = true;
        }
    }
    public void TurnOff(){
        if(estado==true){
            this.estado = false;
        }
    }
    public void canalUp(){
        if(estado==true && canal >0 && canal <= 120){
          canal++;  
        }
        
    }
    public void canalDown(){
         if(estado==true && canal >0 && canal <= 120){
          canal--;  
        }
    }
    public void volumenUp(){
        if(estado==true && volumen >0 && volumen <= 7){
          volumen++;
        }
    }
    public void volumenDown(){
        if(estado==true && volumen >0 && volumen <= 7){
          volumen--;
        }
    }



}