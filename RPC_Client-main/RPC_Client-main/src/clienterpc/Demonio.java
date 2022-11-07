package clienterpc;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.xmlrpc.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;

public class Demonio extends Thread {

    private VentanaChat1 v;
    private XmlRpcClient client;        
    private String histLocal;

    public Demonio(String nombre, VentanaChat1 v, XmlRpcClient client) {
        super(nombre);
        this.v = v;
        this.client = client;                
        this.histLocal = "";

    }

    public void run() {
        while (true) {

            try {
                sleep(1000);
                Vector <String> vect=new Vector<String>();
                String data="";
                vect.add(data);
                this.histLocal = (String) client.execute("servidor_rpc.actualizacion", vect);
                this.v.actualizarTextArea(histLocal);
                

            } catch (XmlRpcException ex) {
                Logger.getLogger(Demonio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Demonio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Demonio.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
