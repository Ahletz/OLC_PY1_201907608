package Documentos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.security.PublicKey;

public class Ventana extends JFrame{

    public JPanel panel;
    public  JTextArea area1,area2;
    public File archivo;

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

        area1 = new JTextArea();
        area1.setBounds(250,20,600,300);
        area1.setEditable(true);
        panel.add(area1);

    }
    private void AreaTexto2(){

        area2 = new JTextArea();
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

        ActionListener Accion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccionB1();
            }
        };

        Boton1.addActionListener(Accion1);

        ActionListener Accion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccionB2();
            }
        };

        Boton2.addActionListener(Accion2);

        ActionListener Accion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccionB3();
            }
        };

        Boton3.addActionListener(Accion3);

        ActionListener Accion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccionB4();
            }
        };

        Boton3.addActionListener(Accion4);




    }

    private void Label(){}

    public void AccionB1 (){

        JFileChooser filec = new JFileChooser();
        filec.showOpenDialog(null);
        archivo = filec.getSelectedFile();
        System.out.println(archivo);
        String texto = "";
        String Linea = "";
        try {

            FileReader Fr = new FileReader(archivo);
            BufferedReader Br = new BufferedReader(Fr);

            while ((((Linea = Br.readLine()) != null))){
                texto +=Linea+"\n";
            }
            JOptionPane.showMessageDialog(null,"ARCHIVO CARGADO");

        }catch (Exception evnt ){


        }

        System.out.println(texto);
        area1.setText(texto);
        area2.setText("CONTENIDO OBTENIDO CARGADO PARA EDITAR");

    }

    public void AccionB2(){

        area1.setText("");
        area2.setText("LIMPIEZA DE EDITOR DE TEXTO COMPLETA");

    }

    public void  AccionB3(){

        String Contenido = area1.getText();
        System.out.println(Contenido);
        area2.setText("");

        if (archivo != null){

            try {

                FileWriter Fw = new FileWriter(archivo);
                Fw.write(Contenido);
                Fw.close();
            } catch (IOException e) {

            }
        }else{

            area2.setText("NO EXISTE UN ARCHIVO CARGADO, GUARDE COMO PARA GUARDAR NUEVO ARCHIVO");
        }




    }

    public void  AccionB4(){

        String Contenido = area1.getText();
        System.out.println(Contenido);
        area2.setText("");

        try {

            FileWriter Fw = new FileWriter("NUEVO_ARCHIVO.olc");
            Fw.write(Contenido);
            Fw.close();
        } catch (IOException e) {

        }


    }




}
