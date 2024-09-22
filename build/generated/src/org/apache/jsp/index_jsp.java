package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>Bookstore</title>\n");
      out.write("<link\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\"\n");
      out.write("\tintegrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"\n");
      out.write("\tintegrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js\"\n");
      out.write("\tintegrity=\"sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- Navbar -->\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\"> <img\n");
      out.write("\t\t\t\tsrc=\"https://1.bp.blogspot.com/-f_5JLvF9_gU/YZGM7p_fkFI/AAAAAAAAAVo/zHkM8tD3ioAvD1pFznG1kw-QOmOibu5ywCLcBGAsYHQ/s150/1-removebg-preview.png\"\n");
      out.write("\t\t\t\talt=\"Bootstrap\" height=\"24\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\"\n");
      out.write("\t\t\t\tdata-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\n");
      out.write("\t\t\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("\t\t\t\taria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link active\"\n");
      out.write("\t\t\t\t\t\taria-current=\"page\" href=\"#\">Trang chủ</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Combo\n");
      out.write("\t\t\t\t\t\t\tgiảm giá</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\"\n");
      out.write("\t\t\t\t\t\tdata-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Thể loại </a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Quần Jean</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Áo thun</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><hr class=\"dropdown-divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Áo sơ mi</a></li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link disabled\">Hết hàng</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<form class=\"d-flex\" role=\"search\">\n");
      out.write("\t\t\t\t\t<input class=\"form-control me-2\" type=\"search\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Nội dung tìm kiếm\" aria-label=\"Search\">\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-outline-success\" type=\"submit\">Tìm</button>\n");
      out.write("\t\t\t\t\t");

						Object obj = session.getAttribute("khachHang");
						KhachHang khachHang = null;
						if (obj!=null)
							khachHang = (KhachHang)obj;
						
						if(khachHang==null){
					
      out.write("\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-primary\" style=\"white-space: nowrap;\" href=\"dangnhap.jsp\">\n");
      out.write("\t\t\t\t\t\t\tĐăng nhập\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t");
} else { 
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"row text-center\" style=\"margin-left: 0.25em\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\"><b>");
      out.print(khachHang.getTenDangNhap() );
      out.write("</b></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\"><a style=\"white-space: nowrap;\" href=\"dang-xuat\">\n");
      out.write("\t\t\t\t\t\t\t\tĐăng xuất\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<!-- End Navbar -->\n");
      out.write("\n");
      out.write("\t<!-- Page content -->\n");
      out.write("\t<div class=\"container mt-4\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<!-- Menu left -->\n");
      out.write("\t\t\t<div class=\"col-lg-3\">\n");
      out.write("\t\t\t\t<div class=\"list-group \">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"list-group-item list-group-item-action\">\n");
      out.write("\t\t\t\t\t\tThời trang nam </a> <a href=\"#\"\n");
      out.write("\t\t\t\t\t\tclass=\"list-group-item list-group-item-action\">Thời trang nữ</a> <a\n");
      out.write("\t\t\t\t\t\thref=\"#\" class=\"list-group-item list-group-item-action\">Dành\n");
      out.write("\t\t\t\t\t\tcho bé</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- End Menu left -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- Slider and Products -->\n");
      out.write("\t\t\t<div class=\"col-lg-9\">\n");
      out.write("\t\t\t\t<!-- Slider -->\n");
      out.write("\t\t\t\t<div id=\"carouselExampleIndicators\" class=\"carousel slide mb-4\"\n");
      out.write("\t\t\t\t\tdata-bs-ride=\"true\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("\t\t\t\t\t\t\tdata-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\n");
      out.write("\t\t\t\t\t\t\taria-label=\"Slide 1\"></button>\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("\t\t\t\t\t\t\tdata-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("\t\t\t\t\t\t\tdata-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-item active\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/slider/1.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/slider/2.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/slider/3.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<button class=\"carousel-control-prev\" type=\"button\"\n");
      out.write("\t\t\t\t\t\tdata-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"visually-hidden\">Previous</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<button class=\"carousel-control-next\" type=\"button\"\n");
      out.write("\t\t\t\t\t\tdata-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"visually-hidden\">Next</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- End Slider -->\n");
      out.write("\t\t\t\t<!-- Products -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\" src=\"img/product/1.png\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Áo thun Pro-S1</a>\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<h5>50.000</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\n");
      out.write("\t\t\t\t\t\t\t\t\tmàu sắc tốt.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<small class=\"text-muted\">&#9733; &#9733; &#9733;\n");
      out.write("\t\t\t\t\t\t\t\t\t&#9733; &#9734;</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\" src=\"img/product/2.png\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"\" ></a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Áo thun Pro-S1</a>\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<h5>50.000</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\n");
      out.write("\t\t\t\t\t\t\t\t\tmàu sắc tốt.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<small class=\"text-muted\">&#9733; &#9733; &#9733;\n");
      out.write("\t\t\t\t\t\t\t\t\t&#9733; &#9734;</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\" src=\"img/product/3.png\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"\" ></a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Áo thun Pro-S1</a>\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<h5>50.000</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\n");
      out.write("\t\t\t\t\t\t\t\t\tmàu sắc tốt.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<small class=\"text-muted\">&#9733; &#9733; &#9733;\n");
      out.write("\t\t\t\t\t\t\t\t\t&#9733; &#9734;</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\" src=\"img/product/1.png\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"\" ></a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Áo thun Pro-S1</a>\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<h5>50.000</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\n");
      out.write("\t\t\t\t\t\t\t\t\tmàu sắc tốt.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<small class=\"text-muted\">&#9733; &#9733; &#9733;\n");
      out.write("\t\t\t\t\t\t\t\t\t&#9733; &#9734;</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- End Products -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- End Slider and Products -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End Page content -->\n");
      out.write("\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t<footer class=\"py-3 my-4\">\n");
      out.write("\t\t<ul class=\"nav justify-content-center border-bottom pb-3 mb-3\">\n");
      out.write("\t\t\t<li class=\"nav-item\"><a href=\"#\"\n");
      out.write("\t\t\t\tclass=\"nav-link px-2 text-muted\">Trag chủ</a></li>\n");
      out.write("\t\t\t<li class=\"nav-item\"><a href=\"#\"\n");
      out.write("\t\t\t\tclass=\"nav-link px-2 text-muted\">Quy định giao hàng</a></li>\n");
      out.write("\t\t\t<li class=\"nav-item\"><a href=\"#\"\n");
      out.write("\t\t\t\tclass=\"nav-link px-2 text-muted\">Quy định trả hàng</a></li>\n");
      out.write("\t\t\t<li class=\"nav-item\"><a href=\"#\"\n");
      out.write("\t\t\t\tclass=\"nav-link px-2 text-muted\">Liên hệ</a></li>\n");
      out.write("\t\t\t<li class=\"nav-item\"><a href=\"#\"\n");
      out.write("\t\t\t\tclass=\"nav-link px-2 text-muted\">Blogs</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<p class=\"text-center text-muted\">© 2022 TITV.vn, Inc</p>\n");
      out.write("\t</footer>\n");
      out.write("\t<!-- End footer -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"input-group mb-3\">\n");
      out.write("\t \n");
      out.write("\t  <div class=\"form-floating\">\n");
      out.write("\t    <input type=\"text\" class=\"form-control\" id=\"floatingInputGroup1\" placeholder=\"Username\">\n");
      out.write("\t    <label for=\"floatingInputGroup1\">Username</label>\n");
      out.write("\t  </div>\n");
      out.write("\t  \n");
      out.write("\t   <span class=\"input-group-text\">@gmail.com</span>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
