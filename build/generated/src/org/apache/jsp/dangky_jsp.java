package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangky_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>Đăng ký</title>\n");
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
      out.write("<style>\n");
      out.write(".red {\n");
      out.write("\tcolor: red;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");

		String baoLoi = request.getAttribute("baoLoi")+"";
		baoLoi = (baoLoi.equals("null"))?"":baoLoi;
	
		
		String tenDangNhap= request.getAttribute("tenDangNhap")+"";	
		tenDangNhap = (tenDangNhap.equals("null"))?"":tenDangNhap;
		
		String hoVaTen= request.getAttribute("hoVaTen")+"";
		hoVaTen = (hoVaTen.equals("null"))?"":hoVaTen;
		
		String gioiTinh= request.getAttribute("gioiTinh")+"";
		gioiTinh = (gioiTinh.equals("null"))?"":gioiTinh;
		
		String ngaySinh= request.getAttribute("ngaySinh")+"";
		ngaySinh = (ngaySinh.equals("null"))?"":ngaySinh;
		
		String diaChiKhachHang= request.getAttribute("diaChiKhachHang")+"";
		diaChiKhachHang = (diaChiKhachHang.equals("null"))?"":diaChiKhachHang;
		
		String diaChiMuaHang= request.getAttribute("diaChiMuaHang")+"";
		diaChiMuaHang = (diaChiMuaHang.equals("null"))?"":diaChiMuaHang;
		
		String diaChiNhanHang= request.getAttribute("diaChiNhanHang")+"";
		diaChiNhanHang = (diaChiNhanHang.equals("null"))?"":diaChiNhanHang;
		
		String dienThoai= request.getAttribute("dienThoai")+"";
		dienThoai = (dienThoai.equals("null"))?"":dienThoai;
		
		String email= request.getAttribute("email")+"";
		email = (email.equals("null"))?"":email;
		
		String dongYNhanMail= request.getAttribute("dongYNhanMail")+"";
		dongYNhanMail = (dongYNhanMail.equals("null"))?"":dongYNhanMail;
	
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t<h1>ĐĂNG KÝ TÀI KHOẢN</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"red\" id=\"baoLoi\">\n");
      out.write("\t\t\t");
      out.print(baoLoi );
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<form class=\"form\" action=\"dang-ky\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t<h3>Tài khoản</h3>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"tenDangNhap\" class=\"form-label\">Tên đăng nhập<span\n");
      out.write("\t\t\t\t\t\t\tclass=\"red\">*</span></label> <input type=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"tenDangNhap\" name=\"tenDangNhap\" required=\"required\" value=\"");
      out.print(tenDangNhap);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"matKhau\" class=\"form-label\">Mật khẩu<span\n");
      out.write("\t\t\t\t\t\t\tclass=\"red\">*</span></label> <input type=\"password\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"matKhau\" name=\"matKhau\" required=\"required\" onkeyup=\"kiemTraMatKhau()\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"matKhauNhapLai\" class=\"form-label\" >Nhập lại\n");
      out.write("\t\t\t\t\t\t\tmật khẩu<span class=\"red\">*</span> <span id=\"msg\" class=\"red\" ></span>\n");
      out.write("\t\t\t\t\t\t</label> <input type=\"password\" class=\"form-control\" id=\"matKhauNhapLai\"\n");
      out.write("\t\t\t\t\t\t\tname=\"matKhauNhapLai\" required=\"required\" onkeyup=\"kiemTraMatKhau()\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t<h3>Thông tin khách hàng</h3>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"hoVaTen\" class=\"form-label\">Họ và tên</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"hoVaTen\" name=\"hoVaTen\" value=\"");
      out.print(hoVaTen);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"gioiTinh\" class=\"form-label\">Giới tính</label> <select\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"gioiTinh\" name=\"gioiTinh\">\n");
      out.write("\t\t\t\t\t\t\t<option></option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Nam\" ");
      out.print((gioiTinh.equals("Nam"))?"selected='selected'":"" );
      out.write(" >Nam</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Nữ\" ");
      out.print((gioiTinh.equals("Nữ"))?"selected='selected'":"" );
      out.write(" >Nữ</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Khác\" ");
      out.print((gioiTinh.equals("Khác"))?"selected='selected'":"" );
      out.write(" >Khác</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"ngaySinh\" class=\"form-label\">Ngày sinh</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"date\" class=\"form-control\" id=\"ngaySinh\" name=\"ngaySinh\" value=\"");
      out.print(ngaySinh);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t<h3>Địa chỉ</h3>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"diaChiKhachHang\" class=\"form-label\">Địa chỉ\n");
      out.write("\t\t\t\t\t\t\tkhách hàng</label> <input type=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"diaChiKhachHang\" name=\"diaChiKhachHang\" value=\"");
      out.print(diaChiKhachHang);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"diaChiMuaHang\" class=\"form-label\">Địa chỉ mua\n");
      out.write("\t\t\t\t\t\t\thàng</label> <input type=\"text\" class=\"form-control\" id=\"diaChiMuaHang\"\n");
      out.write("\t\t\t\t\t\t\tname=\"diaChiMuaHang\" value=\"");
      out.print(diaChiMuaHang);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"diaChiNhanHang\" class=\"form-label\">Địa chỉ\n");
      out.write("\t\t\t\t\t\t\tnhận hàng</label> <input type=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"diaChiNhanHang\" name=\"diaChiNhanHang\" value=\"");
      out.print(diaChiNhanHang);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"dienThoai\" class=\"form-label\">Điện thoại</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"tel\" class=\"form-control\" id=\"dienThoai\" name=\"dienThoai\" value=\"");
      out.print(dienThoai);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"email\" class=\"form-label\">Email</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"email\" class=\"form-control\" id=\"email\" name=\"email\"  value=\"");
      out.print(email);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"dongYDieuKhoan\" class=\"form-label\">Đồng ý với\n");
      out.write("\t\t\t\t\t\t\t<a>điều khoản của công ty </a><span id=\"red\">*</span>\n");
      out.write("\t\t\t\t\t\t</label> <input type=\"checkbox\" class=\"form-check-input\"\n");
      out.write("\t\t\t\t\t\t\tid=\"dongYDieuKhoan\" name=\"dongYDieuKhoan\" required=\"required\" onchange=\"xuLyChonDongY()\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t<label for=\"dongYNhanMail\" class=\"form-label\">Đồng ý nhận\n");
      out.write("\t\t\t\t\t\t\temail</label> <input type=\"checkbox\" class=\"form-check-input\"\n");
      out.write("\t\t\t\t\t\t\tid=\"dongYNhanMail\" name=\"dongYNhanMail\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input class=\"btn btn-primary form-control\" type=\"submit\"\n");
      out.write("\t\t\t\t\t\tvalue=\"Đăng ký\" name=\"submit\" id=\"submit\" style=\"visibility: hidden;\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tfunction kiemTraMatKhau(){\n");
      out.write("\t\tmatKhau = document.getElementById(\"matKhau\").value;\n");
      out.write("\t\tmatKhauNhapLai = document.getElementById(\"matKhauNhapLai\").value;\n");
      out.write("\t\tif(matKhau!=matKhauNhapLai){\n");
      out.write("\t\t\tdocument.getElementById(\"msg\").innerHTML = \"Mật khẩu không khớp!\";\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tdocument.getElementById(\"msg\").innerHTML = \"\";\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction xuLyChonDongY(){\n");
      out.write("\t\tdongYDeuKhoan = document.getElementById(\"dongYDieuKhoan\");\n");
      out.write("\t\tif(dongYDeuKhoan.checked==true){\n");
      out.write("\t\t\tdocument.getElementById(\"submit\").style.visibility=\"visible\";\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tdocument.getElementById(\"submit\").style.visibility=\"hidden\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
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
