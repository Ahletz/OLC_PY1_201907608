package Documentos;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{

    public JPanel panel;

    public Ventana(){

        setSize(900,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("EXREGAN");
        setResizable(false);
        setLayout(null);
        Componentes();
        setLocationRelativeTo(null);

    }
    public void Componentes(){
        Panel();
        AreaTexto1();
        AreaTexto2();
        Botones();
    }

    private void Panel(){

        panel = new JPanel();
        this.getContentPane().add(panel); //agregar panel a la ventana creada
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(10,10,860,640);
        panel.setLayout(null);


    }

    private void AreaTexto1(){

        JTextArea area1 = new JTextArea();
        area1.setBounds(250,20,600,300);
        area1.setEditable(true);
        panel.add(area1);

    }
    private void AreaTexto2(){

        JTextArea area2 = new JTextArea();
        area2.setBounds(250,350,600,250);
        area2.setEditable(false);
        panel.add(area2);

    }

    private void Botones(){

        JButton Boton1 = new JButton("ABRIR");
        JButton Boton2 = new JButton("NUEVO");
        JButton Boton3 = new JButton("GUARDAR");
        JButton Boton4 = new JButton("GUARDAR COMO");
        JButton Boton5 = new JButton("GENERAR AUTOMATA");
        JButton Boton6 = new JButton("ANALIZAR ENTRADA");

        Boton1.setBounds(20,20,150,30);
        Boton2.setBounds(20,70,150,30);
        Boton3.setBounds(20,120,150,30);
        Boton4.setBounds(20,170,150,30);
        Boton5.setBounds(20,220,150,30);
        Boton6.setBounds(20,270,150,30);


        panel.add(Boton1);
        panel.add(Boton2);
        panel.add(Boton3);
        panel.add(Boton4);
        panel.add(Boton5);
        panel.add(Boton6);
    }

    private void Label(){}


}
