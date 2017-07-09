package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DemoSession_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Demo before session</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p>Demo khi dung bien binh thuong</p>\n");
      out.write("        ");

            int n = 0;
            n++;
            out.print(n);
            // lam ntn se khong thay doi duoc gia tri cua n moi khi refresh lai page (do phai request lai)
        
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <p>Demo khi dung attribute</p>\n");
      out.write("        ");

            // neu su dung attribute cung khong the thay doi duoc gia tri cua n
            // do attribute la cua request
            int m = 0;
            Object mObject = request.getAttribute("m");
            if (mObject != null) {
                m = Integer.parseInt(mObject.toString());
            }
            m++;
            request.setAttribute("m", m);
        
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.m}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <p>Demo khi dung session</p>\n");
      out.write("        ");

            // neu dung session, thi se luu duoc gia tri cua bien
            // vi moi bien se co 1 vung nho session rien danh cho no, khong bi mat di khi request lai page
            int k = 0;
            Object kObject = session.getAttribute("k");
            if (kObject != null) {
                k = Integer.parseInt(kObject.toString());
            }
            k++;
            session.setAttribute("k", k);
        
      out.write("\n");
      out.write("        Demo session: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.k}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <p>Demo khi dung application (Servlet context)</p>\n");
      out.write("        ");

            // lon hon vung nho session do la application (Serlvlet context),
            //no la vung nho dung chung cho tat ca cac request khac nhau
            int t = 0;
            Object tObject = application.getAttribute("t");
            if (tObject != null) {
                t = Integer.parseInt(tObject.toString());
            }
            t++;
            application.setAttribute("t", t);
        
      out.write("\n");
      out.write("        Application: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applicationScope.t}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        Session event: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.abc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        Cookies: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie.user.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
