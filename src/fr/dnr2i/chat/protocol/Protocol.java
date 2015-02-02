package fr.dnr2i.chat.protocol;

public enum Protocol 
{
	YES ("PROTOCOL_YES"),
	NO ("PROTOCOL_NO"),
	MESSAGE_PUBLIC ("PROTOCOL_MESSAGE_PUBLIC"),
	MESSAGE_PRIVATE ("PROTOCOL_MESSAGE_PRIVATE"),
	CLIENT_DISCONNECT ("PROTOCOL_CLIENT_DISCONNECT");
	
	private String code;
	
	Protocol(String code)
	{
		this.code = code;
	}
	
	public String toString()
	{
		return this.code;
	}
}
