package myPackage;

public class ex10_4 {

	private String method = "";
	private String requestURI = "";
	private String queryString = "";
	private String protocol = "";
	private String host = "";
	private String connection = "";
	private String cachecontrol = "";
	private String useragent = "";
	private String upgradeinsecurerequests = "";
	private String accept = "";
	private String acceptencoding = "";
	private String acceptlanguage = "";	

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRequestURI() {
		return requestURI;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getCachecontrol() {
		return cachecontrol;
	}

	public void setCachecontrol(String cachecontrol) {
		this.cachecontrol = cachecontrol;
	}

	public String getUseragent() {
		return useragent;
	}

	public void setUseragent(String useragent) {
		this.useragent = useragent;
	}

	public String getUpgradeinsecurerequests() {
		return upgradeinsecurerequests;
	}

	public void setUpgradeinsecurerequests(String upgradeinsecurerequests) {
		this.upgradeinsecurerequests = upgradeinsecurerequests;
	}

	public String getAccept() {
		return accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
	}

	public String getAcceptencoding() {
		return acceptencoding;
	}

	public void setAcceptencoding(String acceptencoding) {
		this.acceptencoding = acceptencoding;
	}

	public String getAcceptlanguage() {
		return acceptlanguage;
	}

	public void setAcceptlanguage(String accpetlanguage) {
		this.acceptlanguage = accpetlanguage;
	}

	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
}
