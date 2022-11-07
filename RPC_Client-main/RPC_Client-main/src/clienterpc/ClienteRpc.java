package clienterpc;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.xmlrpc.XmlRpcClient;

public class ClienteRpc {

    public static void main(String[] args) {
        // TODO code application logic here             

        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        XmlRpcClient client = new XmlRpcClient("http://192.168.0.105:8080");

                        VentanaChat1 v = new VentanaChat1(client);
                        v.setVisible(true);
                        Thread deamon=new Demonio("demonio",v,client);
                        deamon.start();
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(ClienteRpc.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            });

        } catch (Exception e) {
        }

    }

}
