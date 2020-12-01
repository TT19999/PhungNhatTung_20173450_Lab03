package media.singlepane.book;

import javax.swing.JLabel;

import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	private JLabel labelPublisher;
	private JLabel labelPublicationDate;
	private JLabel labelAuthors;
	private JLabel labelNumberOfPages;
	private JLabel lableLangguage;
	
	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublisher = new JLabel();
		add(labelPublisher, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublicationDate = new JLabel();
		add(labelPublicationDate, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelAuthors = new JLabel();
		add(labelAuthors, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNumberOfPages = new JLabel();
		add(labelNumberOfPages, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		lableLangguage = new JLabel();
		add(lableLangguage, c);
	}
	
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof Book) {
			Book bMedia = (Book) t;
			
			labelPublisher.setText("Publisher: " + bMedia.getPublisher());
			labelPublicationDate.setText("Publication Date: " + bMedia.getPublicationDate());
			labelAuthors.setText("Authors: " + bMedia.getAuthors());
			labelNumberOfPages.setText("NumberofPages: " + bMedia.getNumberOfPages());
			lableLangguage.setText("Language: " + bMedia.getLanguage());
		}
	}
}
