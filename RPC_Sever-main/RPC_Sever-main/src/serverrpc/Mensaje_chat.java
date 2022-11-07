
package serverrpc;


public class Mensaje_chat {

    
    private  String historial;
    
    public Mensaje_chat() {
    }
                
    public String envio_mensaje(String texto) {
        this.historial=historial+texto+"\n";
        return texto;
    }

    
    public String verificarHist(String t)  {
       
       return String.valueOf(this.historial.length())+t;
    }

    
    public String actualizacion(String t)  {
        return this.historial+t;
    }
                  
    
}
