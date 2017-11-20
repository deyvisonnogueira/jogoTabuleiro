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
			if (!(((Button) e.getSource()).getText().equalsIgnoreCase("Jogar")) && !(((Button) e.getSource()).getText().equalsIgnoreCase("Terminar"))) {
				if(view.getJogador1().isJogar()){
					String nome = ((Button)e.getSource()).getText().split(" ")[0];
					if(!view.getJogador2().addPersonagem(new Personagem(model.getTabuleiro(),c,view.getJogador2(), "C:\\Users\\mathe\\workspace2\\jogoTabuleiro\\"+nome+".jpg" ))){
						view.msgSemDinheiro(true);
					}else{
						view.getJogador2().diminuirDinheiro(c.getValor());
						view.atualizaDinheiro(view.getJogador2().getDinheiro());
					}
				}else{
					String nome2 = ((Button)e.getSource()).getText().split(" ")[0];
					if(!view.getJogador1().addPersonagem(new Personagem(model.getTabuleiro(),c,view.getJogador1(), "C:\\Users\\mathe\\workspace2\\jogoTabuleiro\\"+nome2+".jpg" ))){
						view.msgSemDinheiro(true);
					}else{
						view.getJogador1().diminuirDinheiro(c.getValor());
						view.atualizaDinheiro(view.getJogador1().getDinheiro());
					}
				}
			}			
			if (((Button) e.getSource()).getText().equalsIgnoreCase("Terminar")) {
				view.getJogador1().setJogar(true);
				view.getJogar().setText("Jogar");
				view.atualizaDinheiro(view.getJogador2().getDinheiro());
			}else if (((Button) e.getSource()).getText().equalsIgnoreCase("Jogar")) {
				view.setVisible(false);
				model.jogar(view);
			}

		}
	}
}
