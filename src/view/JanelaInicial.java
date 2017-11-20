package view;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.wb.swt.SWTResourceManager;

import main.Configuracao;
import model.Classe;
import model.Jogador;

public class JanelaInicial {

	protected Shell shell;
	private JanelaInicialController controller;
	private Configuracao model;
	private Jogador jogador1;
	private Jogador jogador2;
	private Label msgSemDinheiro;
	private Label dinheiroJ1;
	
	
	
	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}

	public JanelaInicial(Configuracao configuracao){
		this.model = configuracao;
		this.controller = new JanelaInicialController(this, configuracao);
		this.controller.model = configuracao;
		this.jogador1 = new Jogador("Jogador 1", 100);
		this.jogador2 = new Jogador("Jogador 2", 200);
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
		shell.setSize(1500, 1000);
		shell.setText("SWT Application");
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setLocation(0, 0);
		tabFolder.setSize(1500, 1000);
		
		TabItem tbtmInicializaoes = new TabItem(tabFolder, SWT.NONE);
		tbtmInicializaoes.setText("Nome do jogo");
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmInicializaoes.setControl(composite_1);
		composite_1.setFont(SWTResourceManager.getFont("Comic Sans MS", 13, SWT.BOLD));
		
		Label titulo = new Label(composite_1, SWT.NONE);
		titulo.setText("Frase de impacto ");
		titulo.setBounds(50, 150, 250, 50);
		titulo.setVisible(false);
		
		msgSemDinheiro = new Label(composite_1, SWT.NONE);
		titulo.setText("Você não tem dinheiro sufuciente para comprar esse personagem");
		titulo.setBounds(250, 550, 550, 50);

		
		dinheiroJ1 = new Label(composite_1, SWT.NONE);
		titulo.setText("Dinheiro: "+jogador1.getDinheiro());
		titulo.setBounds(100, 50, 550, 50);
		titulo.setVisible(true);
		
		
		ArrayList<Button> personagens = new ArrayList<>();
		personagens.add(new Button(composite_1, SWT.NONE));
		personagens.add(new Button(composite_1, SWT.NONE));
		personagens.add(new Button(composite_1, SWT.NONE));
		personagens.add(new Button(composite_1, SWT.NONE));
		personagens.add(new Button(composite_1, SWT.NONE));
		
		Classe[] classes = new Classe[5];
		
		classes[0] = new Classe("Gigante",30,1010,140);
		classes[1] = new Classe("Cavaleiro",10,505,176);
		classes[2] = new Classe("Arqueira",15,254,122);
		classes[3] = new Classe("Bruxo",20,336,228);
		classes[4] = new Classe("Duende",5,169,106);
		
		
		int x = 350,y =100;
		int width = 150;
		int weigth = 100;
		
		int classe = 0;
		
		for(Button b:personagens){
			Classe c = classes[classe];
			b.setBounds(x, y, width, weigth);
			b.setText(c.getTipo()+" "+c.getValor());
			b.setImage(SWTResourceManager.getImage(c.getTipo()+".jpg"));
			b.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					controller.setEvent(e, c);
					}
			});
			x += width+10;
			classe++;
		}
		
		
	}
	
	public void setVisible(boolean visible) {
		shell.setVisible(visible);		
	}
	
	public void msgSemDinheiro(boolean dinheiro){
		msgSemDinheiro.setVisible(dinheiro);
		
	}
	
	public void atualizaDinheiro(){
		dinheiroJ1.setText("Dinheiro: "+jogador1.getDinheiro());
	}
	
	
}
