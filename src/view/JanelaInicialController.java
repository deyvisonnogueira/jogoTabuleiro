package view;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;

import main.Configuracao;
import model.Classe;
import model.Personagem;

public class JanelaInicialController {
	JanelaInicial view;
	Configuracao model;

	public JanelaInicialController(JanelaInicial view, Configuracao model) {
		this.view = view;
		this.model = model;
	}

	public void setEvent(SelectionEvent e,Classe c) {
		view.msgSemDinheiro(false);
		if ((e.getSource() instanceof Button)) {
			if (((Button) e.getSource()).getText().contains("Gigante")) {
				System.out.println(view.getJogador1().getDinheiro());
				if(!view.getJogador1().addPersonagem(new Personagem(model.getTabuleiro(),c))){
					view.msgSemDinheiro(true);
					System.out.println("dawdwad");
				}else{
					
					view.getJogador1().diminuirDinheiro(c.getValor());
					view.atualizaDinheiro();
					System.out.println(view.getJogador1().getDinheiro());
				}
				
				
			}
			if (((Button) e.getSource()).getText().contains("Cavaleiro")) {
				view.getJogador1().diminuirDinheiro(c.getValor());
				view.getJogador1().addPersonagem(new Personagem(model.getTabuleiro(),c));
				System.out.println(view.getJogador1().getDinheiro());
				
			}
			
			if (((Button) e.getSource()).getText().contains("Jogar")) {
				view.setVisible(false);
				model.jogar();
			}

		}
	}
}
