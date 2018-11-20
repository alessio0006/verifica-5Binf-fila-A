


package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Color Picker");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	
		super.setSize(300,200);
		
	
		StringBuilder sb=new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		     
		     sb.append(" <h1> Color Picker </h1>");
		  // Create a table
				sb.append("<table>");
				sb.append(" <tr> <th> <b> Name </b> </th> ");
				sb.append(" <tr> <th> <b> Hex </b> </th> ");
				sb.append("<tr> <th> <b> RGB </b> </th> </tr>   ");
				sb.append(" <tr> <th>  Persian green  </th> ");
				sb.append(" <tr> <th>  #00A693  </th> ");
				sb.append("<tr> <th>  0,166,147  </th> </tr>  ");
				sb.append("<tr> <th>  Venice Blue  </th> ");
				sb.append("<tr> <th>  #055989  </th> ");
				sb.append("<tr> <th>  5,89,137  </th> </tr> ");
				sb.append("<tr> <th>  Pale Blue  </th> ");
				sb.append(" <tr> <th>  #73D1E4 </th> ");
				sb.append(" <tr> <th>  115,209,228  </th> </tr> </div>");
				sb.append("</table>");
		        sb.append("</html>");        
		// TODO Convertire lo StringBuilder in String
		String html1=sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html1));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

