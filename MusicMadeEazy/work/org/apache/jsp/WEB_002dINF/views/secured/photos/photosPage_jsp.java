/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-11-17 10:09:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.secured.photos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class photosPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<style>\r\n");
      out.write(".blueLink{\r\n");
      out.write("color:blue;\r\n");
      out.write("cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".greyLinkDisabled{\r\n");
      out.write("cursor: default;\r\n");
      out.write("color: grey;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write(" <div class=\"fl ml-photos-left-part\">\r\n");
      out.write("        <div class=\"appraisalbox\">\r\n");
      out.write("            \r\n");
      out.write("         </div>\r\n");
      out.write("            \r\n");
      out.write("    </div>\r\n");
      out.write("\t\t<form action=\"/fl-ims/secured/AppraisalData/Photos/Delete\" id=\"deletePhotosForm\" method=GET name=\"photoDeleteForm\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"sequenceNumber\" id=\"sequenceId-delete\" value=\"1\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"sourceId\" id=\"sourceId-delete\" value=\"1\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t<form action=\"/fl-ims/secured/AppraisalData/Photos\" id=\"listPhotosForm\" method=GET name=\"photoListForm\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form action='/fl-ims/secured/AppraisalData/Photos/Upload' method=\"POST\" name=\"photoUploadForm\" id=\"photoUploadForm\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"sequenceNumber\" id=\"sequenceId\" value=\"1\">\r\n");
      out.write("\t\t\t<input type =\"hidden\" name=\"canUploadPhoto\" id=\"canUploadPhoto\" value=\"true\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"csrftoken\"/>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"appraisalId\" id=\"appraisalId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appraisalId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"file\" onChange=\"submitFormbyAjax()\" name=\"imageFile\" id=\"imageFile\" accept=\"image/*\" style=\"display:none;visibility: hidden;\" >\r\n");
      out.write("      \r\n");
      out.write("      \t<div class=\"fl ml-photos-right-part\">\r\n");
      out.write("            \r\n");
      out.write("            \t<div class=\"ml-photos-wrap\">\r\n");
      out.write("\t                <h1 class=\"fl\">Photos</h1>\r\n");
      out.write("\t                <span class=\"fr\"><label for=\"imageFile\" id=\"imageLabel\" class=\"underline photoLinkClick blueLink\">Add Photo</label><a href=\"#\" id=\"addPhotoLink\" class=\"underline photoLinkClick blueLink\">Add Photo</a></span>\t\r\n");
      out.write("\t                <br clear=\"all\"><br>\r\n");
      out.write("\t                <div id=\"inner-div-photos\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                 <br clear=\"all\"><br>\r\n");
      out.write("\t                \r\n");
      out.write("\t                <div class=\"footer-links\">\r\n");
      out.write("\t\t                \r\n");
      out.write("\t                \r\n");
      out.write("                \r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                 <br clear=\"all\"> \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                </div><!--ml-photos-wrap ends-->\r\n");
      out.write("           \r\n");
      out.write("        \t </div>\r\n");
      out.write("        \r\n");
      out.write("\t\t</form>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      <br clear=\"all\">\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\" src=\"/fl-ims/resources/js/jquery-browser.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/IMT/goldfish/public/javascript/jquery.jcarousel.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/IMT/goldfish/public/javascript/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t \r\n");
      out.write("    \r\n");
      out.write("jQuery(document).ready(function(){\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tcallAjax();\r\n");
      out.write(" \tjQuery('#photoUploadForm').ajaxForm(function() {\r\n");
      out.write("        alert(\"Thank you for your comment!\");\r\n");
      out.write("    }); \r\n");
      out.write("\r\n");
      out.write(" \tif(jQuery.browser.msie){\r\n");
      out.write("\t\t//jQuery(\"#imageFile\").show();\r\n");
      out.write("\t\t//jQuery(\"#imageFile\").attr('onChange','');\r\n");
      out.write("\t\tjQuery(\"#imageLabel\").show();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery(\"#addPhotoLink\").hide();\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t//jQuery(\"#imageFile\").hide();\r\n");
      out.write("\t\t//jQuery(\"#imageFile\").attr('onChange','submitFormbyAjax()');\r\n");
      out.write("\t\tjQuery(\"#imageLabel\").hide();\r\n");
      out.write("\t\tjQuery(\"#addPhotoLink\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write(" \tjQuery(\"#addPhotoLink\").unbind(\"click\").click(function(eve){\r\n");
      out.write("   \t\teve.preventDefault();\r\n");
      out.write("   \t\t//callAjax()\r\n");
      out.write("   \t\tjQuery(\"#imageFile\").click();\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("function checkSequence(number){\r\n");
      out.write("\tif(eval(number)>=eval(jQuery(\"#sequenceId\").val())){\r\n");
      out.write("\t\tjQuery(\"#sequenceId\").val(eval(number)+1)\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("function addSequence(number){\r\n");
      out.write("\tjQuery(\"#sequenceId\").val(eval(number)+1);\r\n");
      out.write("}\r\n");
      out.write("function subSequence(number){\r\n");
      out.write("\tjQuery(\"#sequenceId\").val(eval(number)-1);\r\n");
      out.write("}\r\n");
      out.write("function disableClickable(){\r\n");
      out.write("\t\r\n");
      out.write("\tjQuery(\".photoLinkClick\").text(\"Uploading ...\");\t\r\n");
      out.write("\tjQuery(\".photoLinkClick\").unbind(\"click\").click(function(eve){\r\n");
      out.write("   \t\teve.preventDefault();\r\n");
      out.write("   \t});\r\n");
      out.write("\tjQuery(\".photoLinkClick\").addClass(\"greyLinkDisabled\");\r\n");
      out.write("\tjQuery(\".photoLinkClick\").removeClass(\"blueLink\");\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("function enableClickable(){\r\n");
      out.write("\t\r\n");
      out.write("\tjQuery(\".photoLinkClick\").addClass(\"blueLink\");\r\n");
      out.write("\tjQuery(\".photoLinkClick\").removeClass(\"greyLinkDisabled\");\r\n");
      out.write("\tjQuery(\".photoLinkClick\").unbind(\"click\");\r\n");
      out.write("\tjQuery(\".photoLinkClick\").text(\"Add Photo\");\r\n");
      out.write("\tjQuery(\"#addPhotoLink\").unbind(\"click\").click(function(eve){\r\n");
      out.write("   \t\teve.preventDefault();\r\n");
      out.write("   \t\t//callAjax()\r\n");
      out.write("   \t\tjQuery(\"#imageFile\").click();\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t});\r\n");
      out.write("}\r\n");
      out.write("function submitFormbyAjax(){\r\n");
      out.write("\r\n");
      out.write("\tvar seqVal=jQuery(\"#sequenceId\").val();\r\n");
      out.write("\t\r\n");
      out.write("\tif($(\"#canUploadPhoto\").val()==\"false\"){\r\n");
      out.write("\t\talert(\"Already Uploading Photo... Please Wait\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t//jQuery.ajaxFileUpload({\r\n");
      out.write("\t\t\r\n");
      out.write("\tdisableClickable();\r\n");
      out.write("\t$(\"#canUploadPhoto\").val(\"false\")\t\r\n");
      out.write("\t$(photoUploadForm).ajaxSubmit({\t\r\n");
      out.write("\t\t\turl:photoUploadForm.action+\"?_csrf=\"+$(\"#csrftoken\").val()+\"&appraisalId=\"+$(\"#appraisalId\").val()+\"&sequenceNumber=\"+$(\"#sequenceId\").val(),\r\n");
      out.write("\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\t//data:new FormData(photoUploadForm),\r\n");
      out.write("\t\t\t//processData:false,\r\n");
      out.write("\t\t\t//contentType:false,\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsuccess:function(jsonObj){\r\n");
      out.write("\t\t\t\t$(\"#canUploadPhoto\").val(\"true\")\r\n");
      out.write("\t\t\t\tenableClickable();\r\n");
      out.write("\t\t\t\taddSequence(seqVal);\r\n");
      out.write("\t\t\t\tjQuery(\"#imageFile\").replaceWith(jQuery(\"#imageFile\").clone());\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(jsonObj){\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\taddListItemUpload(jsonObj,seqVal);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\tsubSequence(seqVal);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tadjustImagesAndLinks();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t error:function(data){\r\n");
      out.write("\t\t\t\t $(\"#canUploadPhoto\").val(\"true\")\r\n");
      out.write("\t\t\t\t enableClickable();\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\talert(\"Error Uploading Photo\");\r\n");
      out.write("\t\t\t\tsubSequence(seqVal);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("function callAjax(){\r\n");
      out.write("\tjQuery(\"#inner-div-photos\").html(\"\");\r\n");
      out.write("\tjQuery.ajax({\r\n");
      out.write("\t\turl:photoListForm.action,\r\n");
      out.write("\t\ttype:\"GET\",\r\n");
      out.write("\t\tdata:jQuery(\"#listPhotosForm\").serializeArray(),\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t//alert(\"success\");\t\t\t\t\r\n");
      out.write("\t\t\tvar jsonObj=(data)\r\n");
      out.write("\t\t\tjQuery(jsonObj.appraisalPhotos).each(function(index,obj){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\taddListItem(obj);\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t   adjustImagesAndLinks()\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror:function(data){\r\n");
      out.write("\t\t\talert(\"Error Listing Photos\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("function adjustImagesAndLinks(){\r\n");
      out.write("\r\n");
      out.write("\tjQuery(\".delete-ml-image\").unbind(\"click\").click(function(eve){\r\n");
      out.write("   \t\teve.preventDefault();\r\n");
      out.write("   \t\tif(!confirm(\"Delete Photo!\")){\r\n");
      out.write("   \t  \t  \treturn false;\r\n");
      out.write("   \t  \t}\r\n");
      out.write("   \t\t\r\n");
      out.write("\t   \t var me = jQuery(this);\r\n");
      out.write("\t     //You can also set some attribute value if you do not want to use class\r\n");
      out.write("\t     if(me.hasClass('disabledforclick'))\r\n");
      out.write("\t     {\r\n");
      out.write("\t         return false;\r\n");
      out.write("\t     }\r\n");
      out.write("\t     else\r\n");
      out.write("\t     {\r\n");
      out.write("\t         me.addClass('disabledforclick');\r\n");
      out.write("\t   \t\tdelItem(this)\r\n");
      out.write("\t     }\r\n");
      out.write("   \t});\r\n");
      out.write("\r\n");
      out.write("\tjQuery(\"div.delete-ml-image-wrap:nth-child(5n+1)\").addClass(\"no-marg\");\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function addListItem(item){\r\n");
      out.write("   \t\r\n");
      out.write("   \tvar html='<div class=\"delete-ml-image-wrap\"><img src=\"'+item[\"thumbUrl\"]+'\" width=\"119\" height=\"89\"/><span class=\"delete-ml-image\" photoId='+item.sequenceNo+' photoSource='+item.source+'></span></div>';\r\n");
      out.write("   \tcheckSequence(item.sequenceNo)\r\n");
      out.write("   \t$(\"#inner-div-photos\").html($(\"#inner-div-photos\").html()+html);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function addListItemUpload(item,seqVal){\r\n");
      out.write("    \t\r\n");
      out.write("\tvar html='<div class=\"delete-ml-image-wrap\"><img src=\"'+item[\"thumbnail\"]+'\" width=\"119\" height=\"89\"/><span class=\"delete-ml-image\" photoId='+seqVal+' photoSource='+1+'></span></div>';\r\n");
      out.write("   \t$(\"#inner-div-photos\").html($(\"#inner-div-photos\").html()+html);\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("function delItem(item){\r\n");
      out.write("  \t\r\n");
      out.write("  \t//alert(jQuery(item).attr(\"photoId\"))\r\n");
      out.write("  \tjQuery(\"#sequenceId-delete\").val(jQuery(item).attr(\"photoId\"));\r\n");
      out.write("  \tjQuery(\"#sourceId-delete\").val(jQuery(item).attr(\"photoSource\"))\r\n");
      out.write("  \tjQuery.ajax({\r\n");
      out.write("\t\turl:photoDeleteForm.action,\r\n");
      out.write("\t\ttype:\"POST\",\r\n");
      out.write("\t\tdata:jQuery(\"#deletePhotosForm\").serializeArray(),\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\tif(data){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t    \tjQuery(item.parentNode).remove();\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\tjQuery(item).removeClass(\"disabledforclick\")\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\talert(\"Error Deleting Photo\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror:function(data){\r\n");
      out.write("\t\t\tjQuery(item).removeClass(\"disabledforclick\")\r\n");
      out.write("\t\r\n");
      out.write("\t\t\talert(\"Error Deleting Photo\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t})\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
