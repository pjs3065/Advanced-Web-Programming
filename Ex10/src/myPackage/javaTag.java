package myPackage;

public class javaTag extends java_BasedTag {
	public void setLimit(String limit) {
		try {
			this.limit = Integer.parseInt(limit);
		} catch (NumberFormatException e) {
			this.limit = 10;
		}
	}
}
