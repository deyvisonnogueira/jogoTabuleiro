package view;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import view.JanelaTabuleiro;
import main.Configuracao;
import model.Personagem;
import view.JanelaTabuleiroController;

public class JanelaTabuleiro {
	Shell shell;
	private Configuracao model;
	private JanelaTabuleiroController controller;
	
	public JanelaTabuleiro(Configuracao model) {
		this.model = model;
		this.controller = new JanelaTabuleiroController(this, model);
		open();
	}
	
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	protected void createContents() {
		shell = new Shell();
		shell.setSize(800, 800);
		shell.setText("SWT Application");
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		composite.setBounds(50, 100, 502, 502);
		ArrayList<Personagem> personagensJ1= (ArrayList<Personagem>) model.getJanelaInicial().getJogador1().getPersonagens();
		ArrayList<Personagem> personagensJ2= (ArrayList<Personagem>) model.getJanelaInicial().getJogador2().getPersonagens();
		Label lblNewLabel;
		int x = 1,y =1;
		int cont = 0;
		for(Personagem p : personagensJ1){
			lblNewLabel = new Label(composite, SWT.NONE);
			lblNewLabel.setImage(SWTResourceManager.getImage(p.getImagem()));
			lblNewLabel.setBounds(x, y, 50, 50);
			x+=51;
			if(cont ==9){
				y+=51;
				x=0;
			}
			cont++;
		}
		x = 1;
		y =450;
		cont = 0;
		for(Personagem p : personagensJ2){
			lblNewLabel = new Label(composite, SWT.NONE);
			lblNewLabel.setImage(SWTResourceManager.getImage(p.getImagem()));
			lblNewLabel.setBounds(x, y, 50, 50);
			x+=51;
			if(cont ==9){
				y-=51;
				x=0;
			}
			cont++;
		}
		
		lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage("C:\\Users\\mathe\\workspace2\\jogoTabuleiro\\castelo.jpg"));
		lblNewLabel.setBounds(201, 251, 50, 50);
		lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage("C:\\Users\\mathe\\workspace2\\jogoTabuleiro\\castelo.jpg"));
		lblNewLabel.setBounds(201, 201, 50, 50);
		lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage("C:\\Users\\mathe\\workspace2\\jogoTabuleiro\\castelo.jpg"));
		lblNewLabel.setBounds(251, 251, 50, 50);
		lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage("C:\\Users\\mathe\\workspace2\\jogoTabuleiro\\castelo.jpg"));
		lblNewLabel.setBounds(251, 201, 50, 50);
	}
}
