/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-11-17 10:09:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.secured.retail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class retailPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<script type=\"text/javascript\" type=\"javascript\" src=\"/IMT/common/_scripts/global.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t jQuery(document)\r\n");
      out.write("\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tjQuery\r\n");
      out.write("\t\t\t\t\t\t\t\t.get(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"AppraisalData/Retail/GroupStore?appraisalId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appraisalId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&includeDealerGroup=0\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t if(data.reportGroupingTrimDTO!=null){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taddStoreData(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tjQuery\r\n");
      out.write("\t\t\t\t\t\t\t\t.get(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"AppraisalData/Retail/GroupStore?appraisalId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appraisalId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&includeDealerGroup=1\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(data.reportGroupingTrimDTO!=null){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taddGroupData(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tjQuery\r\n");
      out.write("\t\t\t\t\t\t\t\t.get(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"AppraisalData/Retail/Polk?appraisalId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appraisalId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taddPolkData(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$('#multiOpenAccordion').multiOpenAccordion({\r\n");
      out.write("\t\t\t\t\t\t\t active: [1, 2],\r\n");
      out.write("\t\t\t\t\t\t\t    click: function(event, ui) {\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t    init: function(event, ui) {\r\n");
      out.write("\t\t\t\t\t\t\t    },\r\n");
      out.write("\t\t\t\t\t\t\t    tabShown: function(event, ui) {\r\n");
      out.write("\t\t\t\t\t\t\t    },\r\n");
      out.write("\t\t\t\t\t\t\t    tabHidden: function(event, ui) {\r\n");
      out.write("\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t   });\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar dealerId = jQuery('#dealerId').val();\r\n");
      out.write("\t\t\t\t\t\tvar memberId = jQuery('#memberId').val();\r\n");
      out.write("\t\t\t\t\t\tvar def_ret_acc = getCookie('ret_def_acc_'+dealerId+\"_\"+memberId);\r\n");
      out.write("\t\t\t\t\t\tif(def_ret_acc==''){\r\n");
      out.write("\t\t\t\t\t\t\t$('#multiOpenAccordion').multiOpenAccordion( \"option\", \"active\", [2]);\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tvar sArr = def_ret_acc.split(',');\r\n");
      out.write("\t\t\t\t\t\t\tvar iarr = [];\r\n");
      out.write("\t\t\t\t\t\t\tfor(var i=0;i<sArr.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\tiarr.push(parseInt(sArr[i]));\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t$('#multiOpenAccordion').multiOpenAccordion( \"option\", \"active\",iarr);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tjQuery('#storeHeaderId').find('span').css('float','left');\r\n");
      out.write("\t\t\t\t\t\tjQuery('#lightId').css('float','');\r\n");
      out.write("\t\t\t\t\t\tjQuery('#groupHeaderId').find('span').css('float','left');\r\n");
      out.write("\t\t\t\t\t\tjQuery('#inGroupHeaderId').find('span').css('float','left');\r\n");
      out.write("\t\t\t\t\t\tjQuery('#grpRedisHeaderId').css('float','');\r\n");
      out.write("\t\t\t\t\t\tjQuery('#polkHeaderId').find('span').css('float','left');\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\tfunction perfPlus(params,buttonName){\r\n");
      out.write("\r\n");
      out.write("\t\tpop(\"/NextGen/PerformancePlus.go?\"+params,buttonName);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction vDeals(params,buttonName){\r\n");
      out.write("\r\n");
      out.write("\t\tpop(\"/NextGen/ViewDealsAction.go?\"+params,buttonName);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addStoreData(data){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery(\"#pStoreHeadingId\").text(\"Performance from the last \"+data.weeks+\" weeks for \"+data.dealerGroupName);\r\n");
      out.write("\t\t//Data for store with trim\r\n");
      out.write("\t\tjQuery(\"#storeSpanMakeModelTrimId\").text(data.make+\" \"+data.model+\" \"+data.trim);\r\n");
      out.write("\t\tif(data.specificReport.unitsSold!=0){\r\n");
      out.write("\t\t\tvar href = \"/NextGen/ViewDealsAction.go?groupingDescriptionId=\"+data.generalReport.groupingId+\"&weeks=\"+data.weeks+\"&isPopup=true&reportType=\"+data.includeDealerGroup+\"&comingFrom=TA&applyMileageFilter=false&trim=\"+data.trim+\"&mode=UCBP\";\r\n");
      out.write("\t\t\t//alert('href='+href);\r\n");
      out.write("\t\t\tvar buttonName = \"ViewDeals\";\r\n");
      out.write("\t\t\tjQuery(\"#storeSpanTrimButtonsId\").append('<a class=\"ml-retail-btn\" href=\"javascript:pop(\\''+href+'\\',\\''+buttonName+'\\')\" id=\"viewDealsHref\">View Deals</a>');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(data.includeDealerGroup == 0){\r\n");
      out.write("\t\t\tvar href = \"/NextGen/PerformancePlus.go?groupingDescriptionId=\"+data.groupingDescriptionId+\"&weeks=\"+data.weeks+\"&forecast=false&mode=UCBP&isPopup=true&mileageFilter=false&mileage=\"+data.mileage;\r\n");
      out.write("\t\t\t//alert('href='+href);\r\n");
      out.write("\t\t\tvar buttonName = \"exToPlus\";\r\n");
      out.write("\t\t\tjQuery(\"#storeSpanOverallButtonsId\").append('<a class=\"ml-retail-btn\" href=\"javascript:pop(\\''+href+'\\',\\''+buttonName+'\\');\">Performance Plus</a>');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar trHtml = '<td  id=\"storeTrimAvgGrossProfitFormattedId\" >'+data.reportGroupingTrimDTO.avgGrossProfitFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeTrimUnitsSoldFormattedId\" >'+data.reportGroupingTrimDTO.unitsSoldFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeTrimAvgDaysToSaleFormattedId\" >'+data.reportGroupingTrimDTO.avgDaysToSaleFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeTrimAvgMileageFormattedId\" >'+data.reportGroupingTrimDTO.avgMileageFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeTrimNoSalesId\" >'+data.reportGroupingTrimDTO.noSales+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeTrimUnitsInStockFormattedId\" >'+data.reportGroupingTrimDTO.unitsInStockFormatted+'</td>';\r\n");
      out.write("\t\tjQuery(\"#storeTrimTrId\").append(trHtml);\r\n");
      out.write("\r\n");
      out.write("\t\t//Data for store with Overall----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery(\"#storeSpanMakeModelOverallId\").text(data.make+\" \"+data.model+\" Overall\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar trOverallHtml = '<td  id=\"storeTrimAvgGrossProfitFormattedId\" >'+data.reportGroupingOverallDTO.avgGrossProfitFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeOverallUnitsSoldFormattedId\" >'+data.reportGroupingOverallDTO.unitsSoldFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeOverallAvgDaysToSaleFormattedId\" >'+data.reportGroupingOverallDTO.avgDaysToSaleFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeOverallAvgMileageFormattedId\" >'+data.reportGroupingOverallDTO.avgMileageFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeOverallNoSalesId\" >'+data.reportGroupingOverallDTO.noSales+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"storeOverallUnitsInStockFormattedId\" >'+data.reportGroupingOverallDTO.unitsInStockFormatted+'</td>';\r\n");
      out.write("\t\tjQuery(\"#storeOverallTrId\").append(trOverallHtml);\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction addGroupData(data){\r\n");
      out.write("\r\n");
      out.write("\t\t//set light\r\n");
      out.write("\t\tjQuery(\"#lightId\").empty();\r\n");
      out.write("\t\tjQuery(\"#lightHeaderId\").empty();\r\n");
      out.write("\t\tif(data.light==1){\r\n");
      out.write("\t\t\tjQuery(\"#lightId\").append('<img src=\"/fl-ims/resources/images/vhr/carfax/red.png\">');\r\n");
      out.write("\t\t\tjQuery(\"#lightHeaderId\").append('<img src=\"/fl-ims/resources/images/vhr/carfax/red.png\">');\r\n");
      out.write("\t\t}else if(data.light==2){\r\n");
      out.write("\t\t\tjQuery(\"#lightId\").append('<img src=\"/fl-ims/resources/images/vhr/carfax/yellow.png\">');\r\n");
      out.write("\t\t\tjQuery(\"#lightHeaderId\").append('<img src=\"/fl-ims/resources/images/vhr/carfax/yellow.png\">');\r\n");
      out.write("\t\t}else if(data.light==3){\r\n");
      out.write("\t\t\tjQuery(\"#lightId\").append('<img src=\"/fl-ims/resources/images/green-round.png\">');\r\n");
      out.write("\t\t\tjQuery(\"#lightHeaderId\").append('<img src=\"/fl-ims/resources/images/green-round.png\">');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tjQuery(\"#pGroupHeadingId\").text(\"Performance from the last \"+data.weeks+\" weeks for \"+data.dealerGroupName);\r\n");
      out.write("\t\t//Data for store with trim\r\n");
      out.write("\t\tjQuery(\"#groupSpanMakeModelTrimId\").text(data.make+\" \"+data.model+\" \"+data.trim);\r\n");
      out.write("\t\tif(data.specificReport.unitsSold!=0){\r\n");
      out.write("\t\t\tvar href = \"/NextGen/ViewDealsAction.go?groupingDescriptionId=\"+data.generalReport.groupingId+\"&weeks=\"+data.weeks+\"&isPopup=true&reportType=\"+data.includeDealerGroup+\"&comingFrom=TA&applyMileageFilter=false&trim=\"+data.trim+\"&mode=UCBP\";\r\n");
      out.write("\t\t\t//alert('href='+href);\r\n");
      out.write("\t\t\tvar buttonName = \"ViewDeals\";\r\n");
      out.write("\t\t\tjQuery(\"#groupSpanTrimButtonsId\").append('<a class=\"ml-retail-btn\" href=\"javascript:pop(\\''+href+'\\',\\''+buttonName+'\\')\" id=\"viewDealsHref\">View Deals</a>');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(data.generalReport.unitsSold!=0){\r\n");
      out.write("\t\t\tvar href = \"/NextGen/ViewDealsAction.go?groupingDescriptionId=\"+data.generalReport.groupingId+\"&weeks=\"+data.weeks+\"&reportType=\"+data.includeDealerGroup+\"&isPopup=true&isPopup=true&applyMileageFilter=false&comingFrom=TA&mode=UCBP\";\r\n");
      out.write("\t\t\tvar buttonName = \"ViewDeals\";\r\n");
      out.write("\t\t\tjQuery(\"#groupSpanOverallButtonsId\").append('<a class=\"ml-retail-btn\" href=\"javascript:pop(\\''+href+'\\',\\''+buttonName+'\\')\" id=\"viewDealsHref\">View Deals</a>');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(data.includeDealerGroup == 0){\r\n");
      out.write("\t\t\tvar href = \"/NextGen/PerformancePlus.go?groupingDescriptionId=\"+data.groupingDescriptionId+\"&weeks=\"+data.weeks+\"&forecast=false&mode=UCBP&isPopup=true&mileageFilter=false&mileage=\"+data.mileage;\r\n");
      out.write("\t\t\t//alert('href='+href);\r\n");
      out.write("\t\t\tvar buttonName = \"exToPlus\";\r\n");
      out.write("\t\t\tjQuery(\"#groupSpanTrimButtonsId\").append('<a class=\"button\" href=\"javascript:pop(\\''+href+'\\',\\''+buttonName+'\\');\">Performance Plus</a>');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar trHtml = '<td  id=\"groupTrimAvgGrossProfitFormattedId\" >'+data.reportGroupingTrimDTO.avgGrossProfitFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"groupTrimUnitsSoldFormattedId\" >'+data.reportGroupingTrimDTO.unitsSoldFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"groupTrimAvgDaysToSaleFormattedId\" >'+data.reportGroupingTrimDTO.avgDaysToSaleFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"groupTrimAvgMileageFormattedId\" >'+data.reportGroupingTrimDTO.avgMileageFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"groupTrimNoSalesId\" >'+data.reportGroupingTrimDTO.noSales+'</td>';\r\n");
      out.write("\t\tjQuery(\"#groupTrimTrId\").append(trHtml);\r\n");
      out.write("\r\n");
      out.write("\t\t//Data for store with Overall----------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery(\"#groupSpanMakeModelOverallId\").text(data.make+\" \"+data.model+\" Overall\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar trOverallHtml = '<td  id=\"groupTrimAvgGrossProfitFormattedId\" >'+data.reportGroupingOverallDTO.avgGrossProfitFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"groupOverallUnitsSoldFormattedId\" >'+data.reportGroupingOverallDTO.unitsSoldFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"groupOverallAvgDaysToSaleFormattedId\" >'+data.reportGroupingOverallDTO.avgDaysToSaleFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"groupOverallAvgMileageFormattedId\" >'+data.reportGroupingOverallDTO.avgMileageFormatted+'</td>'+\r\n");
      out.write("\t\t'<td  id=\"groupOverallNoSalesId\" >'+data.reportGroupingOverallDTO.noSales+'</td>';\r\n");
      out.write("\t\tjQuery(\"#groupOverallTrId\").append(trOverallHtml);\r\n");
      out.write("\r\n");
      out.write("\t\t//Add Group Redistribution Data------------------------------------------------------------------------------\r\n");
      out.write("\t\tvar tableHtml = \"\";\r\n");
      out.write("\t\tif(data.demandDealers!=null){\r\n");
      out.write("\t\t\tjQuery(\"#retHeaderId\").empty();\r\n");
      out.write("\t\t\tjQuery(\"#grpRedisHeaderId\").append(\"(\"+data.demandDealers.length+\")\");\r\n");
      out.write("\t\t\tjQuery(\"#retHeaderId\").append('<font style=\"font-size:13px;\">('+data.demandDealers.length+' in Group)</font>');\r\n");
      out.write("\t\t\tfor(var i=0;i<data.demandDealers.length;i++){\r\n");
      out.write("\t\t\t\tvar item = data.demandDealers[i];\r\n");
      out.write("\t\t\t\tif(item == null){\r\n");
      out.write("\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(data.isLithia){\r\n");
      out.write("\t\t\t\t\ttableHtml+='<span><a  onclick=\"showEmailRedistributionForm(\\''+item.emailAddress+'\\'); return false;\" >'+item.name+'</a></span> '+\r\n");
      out.write("\t\t\t\t\t'<span>'+item.officePhoneNumberFormatted+'</span> <span>'+item.unitsInStock+'</span><br clear=\"all\">';\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\ttableHtml+='<span>'+item.name+'</a></span> '+\r\n");
      out.write("\t\t\t\t\t'<span>'+item.officePhoneNumberFormatted+'</span> <span>'+item.unitsInStock+'</span><br clear=\"all\">';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tjQuery(\"#grpRedisTableId\").append(tableHtml);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tjQuery(\"#grpRedisHeaderId\").append(\"(0)\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//End ---------------------------------------------------------------------------------------------------------\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tfunction addPolkData(data){\r\n");
      out.write("\t\tvar polkHtml = '<div id=\"marketInsights\" class=\"databox\" >'+\r\n");
      out.write("\t\t'<h4>DMV Core Market Anaylsis: </h4>';\r\n");
      out.write("\t\tif(data.insightPresentationAdapter.makeModelMarketInsightAvailable){\r\n");
      out.write("\t\t\tpolkHtml += '<p  class=\"perfDescription\">'+data.insightPresentationAdapter.makeModelMarketInsight+'</p>'\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(data.insightPresentationAdapter.modelYearMarketInsightAvailable){\r\n");
      out.write("\t\t\tpolkHtml += '<p class=\"perfDescription\">'+data.insightPresentationAdapter.modelYearMarketInsight+'</p>';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tpolkHtml += '</div>';\r\n");
      out.write("\t\tjQuery(\"#polkDivId\").append(polkHtml);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(jQuery(\"#marketInsights\")) { \r\n");
      out.write("\t\t\tjQuery(\"#polkDivId, #marketInsights\").show();\r\n");
      out.write("\t\t\tjQuery(\"#polkDivId .jsData\").empty();\r\n");
      out.write("// \t\t\tjQuery(\"#marketInsights .perfDescription\").each(function () {\r\n");
      out.write("// \t\t\t\tjQuery(\"#polkDivId .jsData\").append(jQuery(\"<dt>\"+$(this).text()+\"</dt>\"));\r\n");
      out.write("// \t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"fl retail-left-part\">\r\n");
      out.write("\t<div class=\"appraisalbox\">\r\n");
      out.write("\t\t <h2 align=\"center\">Appraisal Calculator</h2>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label>Target Selling Price</label> $<span\r\n");
      out.write("\t\t\t\tclass=\"appraisal-txtbox txt-right\">0</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label>Estimated Recon.</label> $<span> <input type=\"text\"\r\n");
      out.write("\t\t\t\tclass=\"appraisal-txtbox\">\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label>Target gross Profit</label> $<span> <input type=\"text\"\r\n");
      out.write("\t\t\t\tclass=\"appraisal-txtbox\">\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"seperator\"></div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label>Appraisal Value</label> $<span> <input type=\"text\"\r\n");
      out.write("\t\t\t\tclass=\"appraisal-txtbox\">\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label class=\"normal-lineheight\">Current Appraisal<br> <a\r\n");
      out.write("\t\t\t\tclass=\"underline\" href=\"#\">View History</a>\r\n");
      out.write("\t\t\t</label> $<span class=\"appraisal-txtbox txt-right\">1,900</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label class=\"normal-lineheight\">Appraiser Name<br> <a\r\n");
      out.write("\t\t\t\tclass=\"underline\" href=\"#\">Add/Remove</a></label> <span\r\n");
      out.write("\t\t\t\tclass=\"appraisal-txtbox txt-right\"> <select>\r\n");
      out.write("\t\t\t\t\t<option>Hudson,Brian</option>\r\n");
      out.write("\t\t\t\t\t<option>Hudson,Brian</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<br> <label class=\"block\">Reconditioning Notes</label> <br>\r\n");
      out.write("\t\t\t<textarea class=\"recnotes\" rows=\"4\"></textarea>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"align-right\">\r\n");
      out.write("\t\t\t<button class=\"appraisal-btn\">Save</button>\r\n");
      out.write("\t\t\t<button>Cancel</button>\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--retail-left-part ends-->\r\n");
      out.write("<div class=\"fr retail-right-part\">\r\n");
      out.write("\t<div class=\"performance-polk-wrap\">\r\n");
      out.write("\t\t<div id=\"performance-polk\" class=\"second-tier-nestings\">\r\n");
      out.write("\t\t\t<ul class=\"fl\">\r\n");
      out.write("\t\t\t\t<!-- <li><a href=\"#ml-perf\">Performance</a></li> -->\r\n");
      out.write("\t\t\t\t<!-- <li><a href=\"#ml-polk\">Polk</a></li> -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<br clear=\"all\">\r\n");
      out.write("\t\t\t<div id=\"ml-perf\" style=\"border-radius: 5px;\">\r\n");
      out.write("\t\t\t\t<div id=\"multiOpenAccordion\">\r\n");
      out.write("\t\t\t\t\t<h3 id=\"storeHeaderId\" style=\"margin-top:0px;\" class=\"ui-accordion-header ui-state-default ui-accordion-icons ui-accordion-header-active ui-state-active ui-corner-top\">\r\n");
      out.write("\t\t\t\t\t\tStore Performance <span id=\"lightId\"></span>\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t<div id=\"0\" class=\"ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"greysubhead\" id=\"pStoreHeadingId\"></p>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"store-perfm-head fl\" id=\"storeSpanMakeModelTrimId\"></span> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"fr store-perfm-head-right\" style=\"padding-bottom: 3px;\" id=\"storeSpanTrimButtonsId\">\r\n");
      out.write("\t\t\t\t\t\t</span> <br clear=\"all\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"store-perfm-table\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Retail Average Gross Profit</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Units Sold</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Average Days to Sale</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Average Mileage</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>No Sales</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Units in Stock</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr id=\"storeTrimTrId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"store-perfm-head fl\" id=\"storeSpanMakeModelOverallId\"></span> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"fr store-perfm-head-right \" style=\"padding-bottom: 3px;\" id=\"storeSpanOverallButtonsId\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</span> <br clear=\"all\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"store-perfm-table\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Retail Average Gross Profit</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Units Sold</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Average Days to Sale</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Average Mileage</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>No Sales</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Units in Stock</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr id=\"storeOverallTrId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<h3 id=\"groupHeaderId\" class=\"ui-accordion-header ui-state-default ui-accordion-icons ui-accordion-header-active ui-state-active ui-corner-top\">Group Performance</h3>\r\n");
      out.write("\t\t\t\t\t<div id=\"1\" class=\"ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"greysubhead\" id=\"pGroupHeadingId\"></p>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"store-perfm-head fl\" id=\"groupSpanMakeModelTrimId\"></span> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"fr store-perfm-head-right \" style=\"padding-bottom: 3px;\" id=\"groupSpanTrimButtonsId\">\r\n");
      out.write("\t\t\t\t\t\t</span> <br clear=\"all\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"store-perfm-table\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Retail Average Gross Profit</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Units Sold</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Average Days to Sale</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Average Mileage</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>No Sales</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr id=\"groupTrimTrId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"store-perfm-head fl\" id=\"groupSpanMakeModelOverallId\"></span> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"fr store-perfm-head-right \" style=\"padding-bottom: 3px;\" id=\"groupSpanOverallButtonsId\">\r\n");
      out.write("\t\t\t\t\t\t</span> <br clear=\"all\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"store-perfm-table\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Retail Average Gross Profit</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Units Sold</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Average Days to Sale</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Average Mileage</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>No Sales</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr id=\"groupOverallTrId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<h3 id=\"inGroupHeaderId\" class=\"ui-accordion-header ui-state-default ui-accordion-icons ui-accordion-header-active ui-state-active ui-corner-top\">In Group Redistribution <span id=\"grpRedisHeaderId\"></span></h3>\r\n");
      out.write("\t\t\t\t\t<div id=\"2\" class=\"ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active\">\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grp-redistribution-head\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Dealer</span> <span>Phone Number</span> <span>Unit\r\n");
      out.write("\t\t\t\t\t\t\t\tin Stock</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grp-redistribution-body\" id=\"grpRedisTableId\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h3 id=\"polkHeaderId\" class=\"ui-accordion-header ui-state-default ui-accordion-icons ui-accordion-header-active ui-state-active ui-corner-top\">Polk Market Analysis</h3>\r\n");
      out.write("\t\t\t\t\t<div id=\"3\" class=\"ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active\">\r\n");
      out.write("\t\t\t\t\t\t<br clear=\"all\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"polkDivId\" class=\"summary\">\r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br clear=\"all\"/>\r\n");
      out.write("\t\t  \t\t<br clear=\"all\"/>\r\n");
      out.write("\t\t\t\t<div class=\"footer-links\"></div>\r\n");
      out.write("\t\t\t\t<br clear=\"all\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--performance-polk ends-->\r\n");
      out.write("\t\t \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--retail-right-part ends-->\r\n");
      out.write("\t<br clear=\"all\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br clear=\"all\" />");
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
