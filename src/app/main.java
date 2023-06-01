package app;

import controlador.*;
import modelo.dto.*;
import modelo.dao.*;	
import vista.*;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlatDarkLaf.setup();
		ControladorPrincipal controlador = new ControladorPrincipal(new UIPrincipal());
	}

}
