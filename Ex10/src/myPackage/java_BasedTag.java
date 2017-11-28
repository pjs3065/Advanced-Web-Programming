package myPackage;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class java_BasedTag extends SimpleTagSupport implements SimpleTag {

	protected int limit = -1;

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();

		if (limit == -1) {
			limit = 1;
			double randomNumber = (double) (Math.random() * limit);
			out.print("randomNumber(" + limit + ")" + ": " + randomNumber);
		} else {
			int randomNumber = (int) (Math.random() * limit);
			out.print("randomNumber(" + limit + ")" + ": " + randomNumber);
		}
	}
}
