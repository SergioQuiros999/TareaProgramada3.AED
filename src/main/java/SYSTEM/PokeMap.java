/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SYSTEM;

import GUI.Mapa;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Fanny Brenes
 */
public class PokeMap extends JPanel {

    ImageIcon place = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Tienda.png")).getImage());
    ImageIcon place1 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Captura_Pokémon.png")).getImage());
    ImageIcon place2 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/9324174b6a5d37014a71877e992f7610.png")).getImage());
    ImageIcon place3 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/EP711_Gimnasio_Pokémon_de_Ciudad_Mayólica.png")).getImage());
    ImageIcon place4 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/EP961_Restaurante_Aina.png")).getImage());

    public void cargarimagen(Graphics g) {

        g.drawImage(place.getImage(), 50, 70, 60, 60, null);
        g.drawImage(place1.getImage(), 680, 230, 60, 60, null);
        g.drawImage(place2.getImage(), 330, 330, 60, 60, null);
        g.drawImage(place3.getImage(), 400, 70, 60, 60, null);
        g.drawImage(place4.getImage(), 50, 490, 60, 60, null);
    }

    public void crearpuntodecaptura(Graphics g) {
        ImageIcon[] place1 = new ImageIcon[100];
        int cantidad = PokeManager.getInstance().busqueda.size();
        for (int i = 0; i < cantidad; i++) {
            place1[i] = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Captura_Pokémon.png")).getImage());
            g.drawImage(place1[i].getImage(), Integer.parseInt(PokeManager.getInstance().GetBusqueda(i).getX()), Integer.parseInt(PokeManager.getInstance().GetBusqueda(i).getY()), 60, 60, null);
        }
    }

    public void puntoespecifico(Graphics g, String nombre) {
        if (nombre == "Gimnasio Pokemon") {
            g.drawImage(place3.getImage(), 50, 70, 60, 60, null);
        }
        if (nombre == "Tienda Pokemon") {
            g.drawImage(place.getImage(), 50, 70, 60, 60, null);
        }
        if (nombre == "Restaurante Pokemon") {
            g.drawImage(place4.getImage(), 50, 70, 60, 60, null);
        }
        if (nombre == "Hospital Pokemon") {
            g.drawImage(place2.getImage(), 50, 70, 60, 60, null);
        }
        if (nombre == "Punto de Captura") {
            g.drawImage(place1.getImage(), 50, 70, 60, 60, null);
        }
        if (nombre != "Gimnasio Pokemon" && nombre != "Tienda Pokemon" && nombre != "Restaurante Pokemon" && nombre != "Hospital Pokemon" && nombre != "Punto de Captura") {
            g.drawImage(place1.getImage(), 50, 70, 60, 60, null);
        }
    }
}
