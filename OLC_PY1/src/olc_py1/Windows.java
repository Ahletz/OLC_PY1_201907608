
package olc_py1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Windows extends JFrame{
    
    private JTextArea TextArea;
    
    public Windows(){
        
        setSize(800,800); //tamaño de la ventana
        setTitle(""); //titlo de la pestaña
        setLocationRelativeTo(null); //centrar en pantalla
        
        Componentes(); //llamada componentes para mostrar
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //opcion para detener el programa cuando se cierre la ventana 
    }
    
    
    
    
    private void Componentes(){
    
        JPanel Panel = new JPanel(); //panel para componente ventana
        
        //botones
        
         JButton boton1 = new JButton("NUEVO ARCHIVO"); //CREAR UN BOTON 
         JButton boton2 = new JButton("ABRIR ARCHIVO");
         JButton boton3 = new JButton("GUARDAR");
         JButton boton4 = new JButton("NUEVA PESTAÑA");
         JButton boton5 = new JButton("EJECUTAR");
         
         boton1.setBounds(10, 20, 150, 30);
         boton2.setBounds(10, 60, 150, 30);
         boton3.setBounds(10, 100, 150, 30);
         boton4.setBounds(10, 140, 150, 30);
         boton5.setBounds(10, 180, 150, 30);
         
         Panel.add(boton1);//agregar el boton al panel
         Panel.add(boton2);
         Panel.add(boton3);
         Panel.add(boton4);
         Panel.add(boton5);
         
         //consola de texto 
         
         TextArea = new JTextArea();
         TextArea.setEditable(false);// Deshabilitar la edición
         TextArea.setBackground(Color.YELLOW); // Cambiar el color de fondo
         TextArea.setBounds(50, 400, 300, 100); //tamaño del area de texto
         
         Panel.add(TextArea); //agregar el area de texto al panel
         
         //descativar la posicion automatica
         Panel.setLayout(null);
         
         //agregar el panel a la ventana
         getContentPane().add(Panel);
        
    }
    
}
