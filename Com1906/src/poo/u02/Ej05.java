package poo.u02;

import javax.swing.JOptionPane;

public class Ej05 {

	public static void main(String[] args) {
		DiscoMusical disco1  = new DiscoMusical();
		//System.out.println(disco1.toString());
		DiscoMusical disco2 = new DiscoMusical("Nevermind", "Nirvana", 1991);
		DiscoMusical disco3 = new DiscoMusical("Nevermind", "Nirvana", 1991);
		DiscoMusical disco4 = new DiscoMusical("Nevermind", "Nirvana", 1991);
		DiscoMusical disco5 = new DiscoMusical("Nevermind", "Nirvana", 1991);
		DiscoMusical disco6 = new DiscoMusical("Ultimo", "Nirvana", 1991);
		DiscoMusical disco7 = new DiscoMusical("Este no se deberia agregar", "Nirvana", 1991);
		//System.out.println(disco2.toString());
		// test
		
		Discografica discografica = new Discografica(6, "EMI");
		discografica.agregarDisco(disco1);
		discografica.agregarDisco(disco2);
		JOptionPane.showMessageDialog(null, discografica.toString());

		discografica.agregarDisco(disco3);
		discografica.agregarDisco(disco4);
		discografica.agregarDisco(disco5);
		discografica.agregarDisco(disco6);
		discografica.agregarDisco(disco7);
		
		JOptionPane.showMessageDialog(null, discografica.toString());
		
		JOptionPane.showMessageDialog(null, disco2.equals(disco3));
		JOptionPane.showMessageDialog(null, disco2.equals(disco1));
	}

}
