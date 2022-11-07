
package serverrpc;

import javax.swing.JOptionPane;
import org.apache.xmlrpc.WebServer;

public class ServerRpc {


    public static void main(String[] args) {
     
        
        
        try {
            JOptionPane.showMessageDialog(null, "Iniciando..");
            WebServer server=new WebServer(8080);
            Mensaje_chat msg=new Mensaje_chat();
            server.addHandler("servidor_rpc", msg);
            server.start();
            JOptionPane.showMessageDialog(null, "Servidor RCP iniciado..");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error => "+e.getMessage());
        }
           
    }
    
}
