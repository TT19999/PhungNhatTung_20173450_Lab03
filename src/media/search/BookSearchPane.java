package media.search;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BookSearchPane extends PhysicalMediaSearchPane {
	
	private JTextField publisherField;
	private JTextField languageField;
	
	
	public BookSearchPane() {
		super();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();
		
		
		JLabel publesherJLabel = new JLabel("Publisher");
		publisherField = new JTextField(15);
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(publesherJLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(publisherField, c);
		JLabel languageJLabel = new JLabel("Language");
		languageField = new JTextField(15);
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(languageJLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(languageField, c);
	}

	@Override
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();
		
		if (!publisherField.getText().trim().equals("")) {
			res.put("publisher", publisherField.getText().trim());
		}
		
		return res;
	}
}
