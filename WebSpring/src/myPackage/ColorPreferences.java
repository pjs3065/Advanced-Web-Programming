package myPackage;

import java.io.Serializable;

public class ColorPreferences implements Serializable{
	private static final long serialVersionUID = 1L;
    private String foreground, background;
    
    private boolean isEmpty(String param) {
        return((param == null) || (param.trim().equals("")));
    }

	public String getForeground() {
		return foreground;
	}

	public void setForeground(String foreground) {
		this.foreground = foreground;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

}
