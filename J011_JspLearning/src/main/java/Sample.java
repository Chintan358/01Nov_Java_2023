
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Sample extends TagSupport {

	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();// returns the instance of JspWriter
		try {
			out.print("Hello jstl calling");// 
		} catch (Exception e) {
			System.out.println(e);
		}
		return SKIP_BODY;// will not evaluate the body content of the tag
	}

}
