package whereismodule;
import java.applet.*;
public class FourthApp extends Applet{
	String str = "";
	public void init() {
		str += "init ";
	}
	public void start() {
		str += "start ";
	}
	public void paint(Graphics g) {
		str += "paint ";
		g.drawString(str,100,100);
	}
	public void stop()
	{
		str += "stop ";
	}
	public void destroy()
	{
		str += "destroy ";
	}
}
//지금까지가 자바 언어를 사용한 프로그램 실행 흐름.
//이거 실행 안되는데, 애플릿 api는 자바 11부터 완전히 제거됨.
