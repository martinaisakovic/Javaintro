package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class WindowAdress {

	protected Shell shlAdressapplication;
	private Text vornameTF;
	private Text nachnameTF;
	private Text plzTF;
	private Text ortTF;
	private Text strasseTF;
	private Button btnSpeichern;
	private Button btnLadenVonDatei;
	private Button btnSchreibenInDatei;
	private Label strasseL;
	private Label ortL;
	private Label plzL;
	private Label nachnameL;
	private Label vornameL;
	private Composite composite;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			WindowAdress window = new WindowAdress();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		while (!shlAdressapplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlAdressapplication = new Shell();
		
		vornameTF = new Text(shlAdressapplication, SWT.BORDER);
		vornameTF.setBounds(81, 7, 76, 21);
		
		nachnameL = new Label(shlAdressapplication, SWT.NONE);
		nachnameL.setBounds(10, 44, 65, 15);
		nachnameL.setText("Nachname");
		
		nachnameTF = new Text(shlAdressapplication, SWT.BORDER);
		nachnameTF.setBounds(81, 41, 76, 21);
		
		composite = new Composite(shlAdressapplication, SWT.NONE);
		composite.setBounds(10, 82, 55, 15);
		
		plzL = new Label(composite, SWT.NONE);
		plzL.setBounds(0, 0, 55, 15);
		plzL.setText("PLZ");
		
		plzTF = new Text(shlAdressapplication, SWT.BORDER);
		plzTF.setBounds(81, 79, 76, 21);
		
		ortL = new Label(shlAdressapplication, SWT.NONE);
		ortL.setBounds(10, 117, 55, 15);
		ortL.setText("Ort");
		
		ortTF = new Text(shlAdressapplication, SWT.BORDER);
		ortTF.setBounds(81, 114, 76, 21);
		
		strasseL = new Label(shlAdressapplication, SWT.NONE);
		strasseL.setBounds(10, 152, 55, 15);
		strasseL.setText("Strasse");
		
		strasseTF = new Text(shlAdressapplication, SWT.BORDER);
		strasseTF.setBounds(81, 149, 76, 21);
		
		btnSpeichern = new Button(shlAdressapplication, SWT.NONE);
		btnSpeichern.setBounds(23, 207, 75, 25);
		btnSpeichern.setText("Speichern");
		
		btnLadenVonDatei = new Button(shlAdressapplication, SWT.NONE);
		btnLadenVonDatei.setBounds(144, 207, 97, 25);
		btnLadenVonDatei.setText("Laden von Datei");
		
		btnSchreibenInDatei = new Button(shlAdressapplication, SWT.NONE);
		btnSchreibenInDatei.setBounds(280, 207, 107, 25);
		btnSchreibenInDatei.setText("Schreiben in Datei");
		
		vornameL = new Label(shlAdressapplication, SWT.NONE);
		vornameL.setBounds(10, 13, 55, 15);
		vornameL.setText("Vorname");

	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Text getPlzTF() {
		return plzTF;
	}
	public Text getOrtTF() {
		return ortTF;
	}
	public Text getStrasseTF() {
		return strasseTF;
	}
	public Button getBtnSpeichern() {
		return btnSpeichern;
	}
	public Button getBtnLadenVonDatei() {
		return btnLadenVonDatei;
	}
	public Button getBtnSchreibenInDatei() {
		return btnSchreibenInDatei;
	}
	public Label getStrassel() {
		return strasseL;
	}
	public Label getOrtl() {
		return ortL;
	}
	public Label getPlzl() {
		return plzL;
	}
	public Label getNachnamel() {
		return nachnameL;
	}
	public Label getVornamel() {
		return vornameL;
	}
	public Shell getShlAdressapplication() {
		return shlAdressapplication;
	}
}
