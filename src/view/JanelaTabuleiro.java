package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import view.JanelaTabuleiro;
import main.Configuracao;
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
		composite.setBounds(50, 100, 500, 500);
	}
}
