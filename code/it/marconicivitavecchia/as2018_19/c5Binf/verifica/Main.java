


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
				sb.append("<div> <tr> <th> <b> Name </b> </th> </div>");
				sb.append("<div> <tr> <th> <b> Hex </b> </th> </div>");
				sb.append("<div> <tr> <th> <b> RGB </b> </th> </tr> </div> <br> ");
				sb.append("<div> <tr> <th>  Persian green  </th> </div>");
				sb.append("<div> <tr> <th>  #00A693  </th> </div>");
				sb.append("<div> <tr> <th>  0,166,147  </th> </tr> </div> <br>");
				sb.append("<div> <tr> <th>  Venice Blue  </th> </div>");
				sb.append("<div> <tr> <th>  #055989  </th> </div>");
				sb.append("<div> <tr> <th>  5,89,137  </th> </tr> </div> <br>");
				sb.append("<div> <tr> <th>  Pale Blue  </th> </div>");
				sb.append("<div> <tr> <th>  #73D1E4 </th> </div>");
				sb.append("<div> <tr> <th>  115,209,228  </th> </tr> </div> <br>");
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

