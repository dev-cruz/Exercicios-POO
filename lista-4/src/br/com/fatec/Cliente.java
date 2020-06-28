package br.com.fatec;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import javax.swing.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import javax.crypto.Cipher;

public class Cliente extends JFrame implements ActionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	private JTextArea text;
	private JTextField txtMsg;
	private JButton btnSend;
	private JButton btnExit;
	private JLabel lblHistoric;
	private JLabel lblMsg;
	private JPanel pnlContent;
	private Socket socket;
	private OutputStream ou ;
	private Writer ouw; 
	private BufferedWriter bfw;
	private JTextField txtIP;
	private JTextField txtDoor;
	private JTextField txtName;
	public Cliente() throws IOException{                  
	    JLabel lblMessage = new JLabel("Verificar!");
	    txtIP = new JTextField("127.0.0.1");
	    txtDoor = new JTextField("12345");
	    txtName = new JTextField("Cliente");                
	    Object[] texts = {lblMessage, txtIP, txtDoor, txtName };  
	    JOptionPane.showMessageDialog(null, texts);              
	     pnlContent = new JPanel();
	     text= new JTextArea(10,20);
	     text.setEditable(false);
	     text.setBackground(new Color(240,240,240));
	     txtMsg= new JTextField(20);
	     lblHistoric= new JLabel("Chat");
	     lblMsg= new JLabel("Mensagem");
	     btnSend= new JButton("Enviar");
	     btnSend.setToolTipText("Enviar Mensagem");
	     btnExit= new JButton("Sair");
	     btnExit.setToolTipText("Sair do Chat");
	     btnSend.addActionListener(this);
	     btnExit.addActionListener(this);
	     btnSend.addKeyListener(this);
	     txtMsg.addKeyListener(this);
	     JScrollPane scroll = new JScrollPane(text);
	     text.setLineWrap(true);  
	     pnlContent.add(lblHistoric);
	     pnlContent.add(scroll);
	     pnlContent.add(lblMsg);
	     pnlContent.add(txtMsg);
	     pnlContent.add(btnExit);
	     pnlContent.add(btnSend);
	     pnlContent.setBackground(Color.LIGHT_GRAY);                                 
	     text.setBorder(BorderFactory.createEtchedBorder(Color.BLUE,Color.BLUE));
	     txtMsg.setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.BLUE));                    
	     setTitle(txtName.getText());
	     setContentPane(pnlContent);
	     setLocationRelativeTo(null);
	     setResizable(false);
	     setSize(250,300);
	     setVisible(true);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void conectar() throws IOException{	                           
	  socket = new Socket(txtIP.getText(),Integer.parseInt(txtDoor.getText()));
	  ou = socket.getOutputStream();
	  ouw = new OutputStreamWriter(ou);
	  bfw = new BufferedWriter(ouw);
	  bfw.write(txtName.getText()+"\r\n");
	  bfw.flush();
	}
	  public void enviarMensagem(String msg) throws IOException{	                           
          try {
              Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
              byte[] mensagem = msg.getBytes();
   
              // Usando chave de 128-bits (16 bytes)
              byte[] chave = "chave de 16bytes".getBytes();
   
              // Criptografando...
              cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(chave, "AES"));
              byte[] crypted = cipher.doFinal(mensagem);
   
              // Decriptografando...
              cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(chave, "AES"));
              byte[] decrypted = cipher.doFinal(crypted);
   
              System.out.println(new String(decrypted));
          } catch (Exception e) {
             e.printStackTrace();
          }
		  if(msg.equals("Sair")){
	      bfw.write("Desconectado \r\n");
	      text.append("Desconectado \r\n");
	    }else{
	      bfw.write(msg+"\r\n");
	      text.append( txtName.getText() + " : -> " +txtMsg.getText()+"\r\n");
	    }
	     bfw.flush();
	     txtMsg.setText("");        
	}
	  public void escutar() throws IOException{	                             
	     InputStream in = socket.getInputStream();
	     InputStreamReader inr = new InputStreamReader(in);
	     BufferedReader bfr = new BufferedReader(inr);
	     String msg = "";                             
	      while(!"Sair".equalsIgnoreCase(msg))                             
	         if(bfr.ready()){
	           msg = bfr.readLine();
	         if(msg.equals("Sair"))
	           text.append("Servidor caiu! \r\n");
	          else
	           text.append(msg+"\r\n");         
	          }
	  }
	   public void sair() throws IOException{                    
	    enviarMensagem("Sair");
	    bfw.close();
	    ouw.close();
	    ou.close();
	    socket.close();
	 }
	   @Override
	   public void actionPerformed(ActionEvent e) {
	     try {
	        if(e.getActionCommand().equals(btnSend.getActionCommand()))
	           enviarMensagem(txtMsg.getText());
	        else
	           if(e.getActionCommand().equals(btnExit.getActionCommand()))
	           sair();
	        } catch (IOException e1) {
	             // TODO Auto-generated catch block
	             e1.printStackTrace();
	        }                       
	   }
	   @Override
	   public void keyPressed(KeyEvent e) {              
	       if(e.getKeyCode() == KeyEvent.VK_ENTER){
	          try {
	             enviarMensagem(txtMsg.getText());
	          } catch (IOException e1) {
	              // TODO Auto-generated catch block
	              e1.printStackTrace();
	          }                                                          
	      }                       
	   }
	       
	   @Override
	   public void keyReleased(KeyEvent arg0) {
	     // TODO Auto-generated method stub               
	   }
	       
	   @Override
	   public void keyTyped(KeyEvent arg0) {
	     // TODO Auto-generated method stub               
	   }


	     
	   }
	            
