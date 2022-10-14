package Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class Panel extends JFrame {
    public JPanel panel;
    private JTextField interficie;
    float num1, num2;
    char signo;

        public Panel() {

            this.setSize(381, 535);
            this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/iconocalc.png")).getImage());
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setTitle("   Iván Gallego Fernández");
            setLocationRelativeTo(null);
            iniciarComponents();

        }

        private void iniciarComponents() {
            colocarPaneles();
            colocarBotones();
            colocarAreasDeTexto();


        }
        //patatas, yogures, pan de calabaza, //

    private void colocarPaneles() {
            JLabel etiqueta = new JLabel();
            etiqueta.setText("");
            panel = new JPanel();
            panel.setLayout(null);
            this.getContentPane().add(panel);
            //panel.setBackground(Color.LIGHT_GRAY);
        }

        private void colocarAreasDeTexto() {
            interficie = new JTextField();
            interficie.setBounds(35, 5, 294, 60);
            interficie.setText("");
            panel.add(interficie);

            interficie.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent ke) {
                    String value = interficie.getText();
                    int l = value.length();
                    if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                        interficie.setEditable(true);
                    } else if (ke.getKeyChar() == '.') {
                        interficie.setEditable(true);
                    } else if (ke.getKeyCode() == 8) {
                        interficie.setEditable(true);
                    } else {
                        interficie.setEditable(false);
                    }
                }
            });
        }

    private void colocarBotones() {

/////////////////////////////////////////////////////////////////////////////////

            JButton boton1 = new JButton(".");
            boton1.setBounds(19, 86, 67, 67);
            boton1.setBackground(Color.WHITE);
            boton1.setForeground(Color.BLACK);
        ActionListener oyenteDeAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + ".");

            }
        };
        boton1.addActionListener(oyenteDeAccion1);
            panel.add(boton1);

/////////////////////////////////////////////////////////////////////////////////

            JButton boton2 = new JButton("AC");
            boton2.setBounds(106, 86, 67, 67);
            boton2.setBackground(Color.WHITE);
            boton2.setForeground(Color.BLACK);
            panel.add(boton2);
            ActionListener oyenteDeAccion2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText("");
                }
            };
            boton2.addActionListener(oyenteDeAccion2);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton3 = new JButton("<-");
            boton3.setBounds(193, 86, 67, 67);
            boton3.setForeground(Color.BLACK);
            boton3.setBackground(Color.WHITE);
            ActionListener esborrar = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (interficie.getText().length() !=0){
                        interficie.setText(interficie.getText().substring(0, interficie.getText().length()-1));
                    } else{
                        JOptionPane.showMessageDialog(null, "No hay nada que borrar Chaval");
                    }
                }
            };
            panel.add(boton3);
            boton3.addActionListener(esborrar);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton4 = new JButton("+");
            boton4.setBounds(280, 86, 67, 67);
            boton4.setForeground(Color.BLACK);
            boton4.setBackground(Color.WHITE);
            panel.add(boton4);
        ActionListener oyenteDeAccion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Float.parseFloat(interficie.getText());
                signo='+';
                interficie.setText("");

            }
        };
        boton4.addActionListener(oyenteDeAccion4);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton5 = new JButton("7");
            boton5.setBounds(19, 167, 67, 67);
            boton5.setForeground(Color.BLACK);
            boton5.setBackground(Color.WHITE);
            panel.add(boton5);
            ActionListener oyenteDeAccion5 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "7");

                }
            };
            boton5.addActionListener(oyenteDeAccion5);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton6 = new JButton("8");
            boton6.setBounds(106, 167, 67, 67);
            boton6.setForeground(Color.BLACK);
            boton6.setBackground(Color.WHITE);
            panel.add(boton6);
            ActionListener oyenteDeAccion6 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "8");
                }
            };
            boton6.addActionListener(oyenteDeAccion6);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton7 = new JButton("9");
            boton7.setBounds(193, 167, 67, 67);
            boton7.setForeground(Color.BLACK);
            boton7.setBackground(Color.WHITE);
            panel.add(boton7);
            ActionListener oyenteDeAccion7 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "9");

                }
            };
            boton7.addActionListener(oyenteDeAccion7);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton8 = new JButton("-");
            boton8.setBounds(280, 167, 67, 67);
            boton8.setForeground(Color.BLACK);
            boton8.setBackground(Color.WHITE);
            panel.add(boton8);
        ActionListener oyenteDeAccion8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Float.parseFloat(interficie.getText());
                signo='-';
                interficie.setText("");

            }
        };
        boton8.addActionListener(oyenteDeAccion8);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton9 = new JButton("4");
            boton9.setBounds(19, 247, 67, 67);
            boton9.setForeground(Color.BLACK);
            boton9.setBackground(Color.WHITE);
            panel.add(boton9);
            ActionListener oyenteDeAccion9 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "4");

                }
            };
            boton9.addActionListener(oyenteDeAccion9);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton10 = new JButton("5");
            boton10.setBounds(106, 247, 67, 67);
            boton10.setForeground(Color.BLACK);
            boton10.setBackground(Color.WHITE);
            panel.add(boton10);
            ActionListener oyenteDeAccion10 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "5");

                }
            };
            boton10.addActionListener(oyenteDeAccion10);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton11 = new JButton("6");
            boton11.setBounds(193, 247, 67, 67);
            boton11.setForeground(Color.BLACK);
            boton11.setBackground(Color.WHITE);
            panel.add(boton11);
            ActionListener oyenteDeAccion11 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "6");

                }
            };
            boton11.addActionListener(oyenteDeAccion11);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton12 = new JButton("*");
            boton12.setBounds(280, 247, 67, 67);
            boton12.setForeground(Color.BLACK);
            boton12.setBackground(Color.WHITE);
            panel.add(boton12);
        ActionListener oyenteDeAccion12 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Float.parseFloat(interficie.getText());
                signo='*';
                interficie.setText("");

            }
        };
        boton12.addActionListener(oyenteDeAccion12);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton13 = new JButton("1");
            boton13.setBounds(19, 327, 67, 67);
            boton13.setForeground(Color.BLACK);
            boton13.setBackground(Color.WHITE);
            panel.add(boton13);
            ActionListener oyenteDeAccion13 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "1");

                }
            };
            boton13.addActionListener(oyenteDeAccion13);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton14 = new JButton("2");
            boton14.setBounds(106, 327, 67, 67);
            boton14.setForeground(Color.BLACK);
            boton14.setBackground(Color.WHITE);
            panel.add(boton14);
            ActionListener oyenteDeAccion14 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "2");

                }
            };
            boton14.addActionListener(oyenteDeAccion14);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton15 = new JButton("3");
            boton15.setBounds(193, 327, 67, 67);
            boton15.setForeground(Color.BLACK);
            boton15.setBackground(Color.WHITE);
            panel.add(boton15);
            ActionListener oyenteDeAccion15 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "3");

                }
            };
            boton15.addActionListener(oyenteDeAccion15);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton16 = new JButton("/");
            boton16.setBounds(280, 327, 67, 67);
            boton16.setForeground(Color.BLACK);
            boton16.setBackground(Color.WHITE);
            panel.add(boton16);


        ActionListener oyenteDeAccion16 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Float.parseFloat(interficie.getText());
                signo='/';
                interficie.setText("");

            }
        };
        boton16.addActionListener(oyenteDeAccion16);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton17 = new JButton("00");
            boton17.setBounds(19, 407, 67, 67);
            boton17.setForeground(Color.BLACK);
            boton17.setBackground(Color.WHITE);
            panel.add(boton17);
            ActionListener oyenteDeAccion17 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "00");

                }
            };
            boton17.addActionListener(oyenteDeAccion17);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton18 = new JButton("0");
            boton18.setBounds(106, 407, 67, 67);
            boton18.setForeground(Color.BLACK);
            boton18.setBackground(Color.WHITE);
            panel.add(boton18);
            ActionListener oyenteDeAccion18 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    interficie.setText(interficie.getText() + "0");

                }
            };
            boton18.addActionListener(oyenteDeAccion18);

//////////////////////////////////////////////////////////////////////////////////

            JButton boton19 = new JButton("=");
            boton19.setBounds(204, 407, 134, 67);
            boton19.setForeground(Color.BLACK);
            boton19.setBackground(Color.WHITE);
            panel.add(boton19);

        ActionListener oyenteDeAccion19 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Integer.parseInt(interficie.getText());

                if (signo == '+') {
                    interficie.setText(Float.toString(num1 + num2));
                } else if (signo == '-') {
                    interficie.setText(Float.toString(num1 - num2));
                } else if (signo == '*') {
                    interficie.setText(Float.toString(num1 * num2));
                } else if (signo == '/') {
                    interficie.setText(Float.toString(num1 / num2));
                }
            }
        };
        boton19.addActionListener(oyenteDeAccion19);


//////////////////////////////////////////////////////////////////////////////////

        }
    }


