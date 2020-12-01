package media.admin;

import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;

public abstract class AdminMediaPageController extends ADataPageController<Media> {
	
	public AdminMediaPageController() {
		super();
	}
	
	
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
	
}
